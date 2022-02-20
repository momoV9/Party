package be.thomasmore.party.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/", "/home"})
    public String home(Model model) {

        int myCalculatedValue = 34 * 62;
        model.addAttribute("myCalculatedValue", myCalculatedValue);
        return "home";
    }
    @GetMapping("/about")
    public String about(Model model) {
        String myName = "Mohamed Ahnoud";
        String myStreet = "Lageweg 451";
        String myCity = "Hoboken";
        model.addAttribute("name", myName);
        model.addAttribute("street", myStreet);
        model.addAttribute("city", myCity);
        return "about";
    }

}