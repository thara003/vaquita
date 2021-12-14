package vaquita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import vaquita.entity.*;
import vaquita.service.ClientService;
import vaquita.service.EventsService;
import vaquita.service.FeedbackService;

@Controller
@RequestMapping("/clients")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private ClientService clientService;

    @GetMapping("/add")
    public String add(Model model, @RequestParam("id") int id){
        Feedback theFeedback = new Feedback();
        model.addAttribute("theFeedback",theFeedback);
        model.addAttribute("id",id);
        return "client";
    }

    @PostMapping("/save")
    public String save(@RequestParam("id") int id, @ModelAttribute("theFeedback") Feedback theFeedback)
    {
        Client client = clientService.getAllClientById(id);
        theFeedback.setClient(client);
        feedbackService.addFeedback(theFeedback);
        clientService.updateClient(client);
        return  "redirect:/clients/"+ id;

    }
}
