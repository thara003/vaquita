package vaquita.controller;

import vaquita.entity.Client;
import vaquita.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private ClientService clientService;

    @GetMapping("")
    public String showLogin(Model model)
    {
        List<Client> clients = clientService.getAllClient();
        model.addAttribute("clients", clients);
        return "login";
    }

    @GetMapping("/add")
    public String add(Model model)
    {
        Client theClient = new Client();
        model.addAttribute("theClient", theClient);
        return "signup";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("theClient") Client theClient)
    {
        clientService.addClient(theClient);
        return "redirect:/login";
    }
}

