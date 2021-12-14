package vaquita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import vaquita.entity.*;
import vaquita.service.ClientService;
import vaquita.service.EventsService;



@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private EventsService eventsService;

//    @GetMapping("")
//    public String findAll(Model model)
//    {
//        List<Client> clients = clientService.findAll();
//        model.addAttribute("clients", clients);
//        return "client";
//    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model)
    {
        Client client = clientService.getAllClientById(id);
        model.addAttribute("client", client);
        model.addAttribute("id", id);
        List<Userrequest> ListUserrequest = client.getListUserrequest();
        model.addAttribute("listUserrequest", ListUserrequest);
        List<Events> listEvents = client.getListEvents();
        model.addAttribute("listEvents" , listEvents);

        Events theEvent = new Events();
        model.addAttribute("theEvent", theEvent);

        return "client";
    }


//
//    @GetMapping("/add")
//    public String add(@ModelAttribute("theEvent") Events theEvent, @RequestParam("id") int id)
//    {
////        Client client = clientService.getAllClientById(id);
////        model.addAttribute("client", client);
////        model.addAttribute("id", id);
//        Events theEvent = new Events();
//        model.addAttribute("theEvent", theClient);
////        return "signup";
//        return "client";
//    }

    @PostMapping("/{id}/save")
    public String save(@ModelAttribute("theEvent") Events theEvent, @RequestParam("id") int id)
    {
        Client client = clientService.getAllClientById(id);
        theEvent.setClient(client);
        eventsService.addEvents(theEvent);
        clientService.updateClient(client);
        return "redirect:/clients/" + id;
    }

//    @PostMapping("/save")
//    public String save(@ModelAttribute("theProjectOrder") ProjectOrder theProjectOrder, @RequestParam("id") int id) {
//        Client client = clientService.getClientById(id);
//        theProjectOrder.setClient(client);
//        projectOrderService.addProjectOrder(theProjectOrder);
//        clientService.updateClient(client);
//        return "redirect:/client/" + id;
//    }

}
