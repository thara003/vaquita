package vaquita.controller;

import com.sun.xml.bind.v2.TODO;
import vaquita.entity.*;
import vaquita.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/manager")
public class ManagerController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ManagerService managerService;

    @Autowired
    private EventsService eventsService;

    @Autowired
    private UserrequestService userrequestService;

    @Autowired
    private BillingService billingService;

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model)
    {
        Manager manager = managerService.getManagerById(id);
        model.addAttribute("manager", manager);
        model.addAttribute("mid", id);

        List<Client> clients = clientService.getAllClient();
        model.addAttribute("clients", clients);

        List<Userrequest> userRequests = userrequestService.getAllUserrequest();
        model.addAttribute("userRequests", userRequests);

        List<Billing> billings = billingService.getAllBilling();
        model.addAttribute("billings", billings);

        return "manager";
    }

    @GetMapping("/save")
    public String save(@RequestParam("uid") int uid,  @RequestParam("mid") int mid) {
        Userrequest userRequest = userrequestService.getUserrequestById(uid);
        userRequest.setReq_status("ACCEPTED");
        userrequestService.updateUserrequest(userRequest);
        return "redirect:/manager/" + mid;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("uid") int uid,  @RequestParam("mid") int mid) {
        Userrequest userRequest = userrequestService.getUserrequestById(uid);
        Events events = eventsService.getEventsById(userRequest.getEvents().getId());
        events.setStatus("REJECTED");
        userrequestService.deleteUserrequest(userRequest.getId());
        return "redirect:/manager/" + mid;
    }

}

