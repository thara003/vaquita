package vaquita.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import vaquita.entity.*;
import vaquita.service.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private  ClientService clientService;

    @Autowired
    private  EventsService eventsService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private FeedbackService feedbackService;


    @GetMapping("/{id}")
    public String showAdmin(@PathVariable("id") int id, Model model)
    {
        Admin admin = adminService.getAdminById(id);
        model.addAttribute("admin",admin);
        model.addAttribute("aid", id);

        List<Client> clients = clientService.getAllClient();
        model.addAttribute("listClients", clients);

        List<Events> listEvents = eventsService.getAllEvents();
        model.addAttribute("listEvents", listEvents);

        List<Staff> staffList = staffService.getAllStaff();
        model.addAttribute("staffList", staffList);

        List<Feedback> feedbacks = feedbackService.getAllFeedback();
        model.addAttribute("feedbacksList", feedbacks);

        return "admin";
    }

}
