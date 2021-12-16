package vaquita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vaquita.entity.Client;
import vaquita.entity.Events;
import vaquita.entity.Userrequest;
import vaquita.service.ClientService;
import vaquita.service.EventsService;
import vaquita.service.UserrequestService;

import java.util.List;

@Controller
@RequestMapping("/clients")

public class EventController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private EventsService eventsService;

    @Autowired
    private UserrequestService userrequestService;

    @GetMapping("/add")
    public String add(Model model, @RequestParam("id") int id){
        Events theEvent = new Events();
        model.addAttribute("theEvent",theEvent);
        model.addAttribute("id",id);
        return "client";
    }

    @PostMapping("/save")
    public String save(@RequestParam("id") int id, @ModelAttribute("theEvent") Events theEvent)
    {
        Client client = clientService.getAllClientById(id);
        theEvent.setClient(client);
        theEvent.setStatus("PENDING");
        eventsService.addEvents(theEvent);
        clientService.updateClient(client);

        Userrequest userrequest = new Userrequest();
        userrequest.setClient(client);
        userrequest.setReq_status("PENDING");
        userrequest.setEvents(theEvent);
        userrequestService.addUserrequest(userrequest);

        return  "redirect:/clients/"+ id;

    }
}
