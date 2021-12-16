package vaquita.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import vaquita.entity.*;
import vaquita.service.ClientService;
import vaquita.service.EventsService;
import vaquita.service.FeedbackService;
import vaquita.service.UserrequestService;


@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private EventsService eventsService;

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private UserrequestService userrequestService;

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
        model.addAttribute("eventId", theEvent.getId());

        Feedback theFeedback = new Feedback();
        model.addAttribute("theFeedback", theFeedback);

        return "client";
    }

    @PostMapping("/savefeedback")
    public String saveFeedback(@ModelAttribute("theFeedback") Feedback theFeedback, @RequestParam("id") int id){
        Client client = clientService.getAllClientById(id);
        theFeedback.setClient(client);
        feedbackService.addFeedback(theFeedback);
        clientService.updateClient(client);
        return "redirect:/clients/" + client.getC_id();
    }


    @PostMapping("/{id}/save")
    public String save(@ModelAttribute("theEvent") Events theEvent, @RequestParam("id") int id)
    {
        Client client = clientService.getAllClientById(id);
        theEvent.setClient(client);
        theEvent.setStatus("Pending");

        eventsService.addEvents(theEvent);
        clientService.updateClient(client);
        return "redirect:/clients/" + id;
    }

    @GetMapping("/deleteEvents")
    public String remove(@RequestParam("eid") int eid, @RequestParam("cid") int cid)
    {
        Client client = clientService.getAllClientById(cid);
        Events events = eventsService.getEventsById(eid);
        List<Userrequest> listUserrequest = events.getListUserrequest();
        for(Userrequest userrequest : listUserrequest)
        {
            if (userrequest.getEvents().getId() == eid){
                userrequestService.deleteUserrequest(userrequest.getId());
            }
        }
        client.removeEvents(events);
        clientService.updateClient(client);
        eventsService.deleteEvents(events);

        return "redirect:/clients/" + cid;
    }

    @GetMapping("/payment")
    public String payment( Model model )
    {
        return "payment";
    }

}
