package com.abhiche.abhilasha;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "abhilasha");
        model.addAttribute("content", "fragments/home");
        return "index";
    }

    @RequestMapping("/bio")
    public String bio(Model model) {
        model.addAttribute("pageTitle", "Bio");
        model.addAttribute("content", "fragments/bio");
        return "index";
    }

    @RequestMapping("/nullcopula")
    public String nullCopula(Model model) {
        model.addAttribute("pageTitle", "Null Copula");
        model.addAttribute("content", "fragments/null-copula");
        return "index";
    }

    @RequestMapping("/turtleboat")
    public String turtleBoat(Model model) {
        model.addAttribute("pageTitle", "Turtle Boat");
        model.addAttribute("content", "fragments/turtle-boat");
        return "index";
    }

    @RequestMapping("/recordings")
    public String recordings(Model model) {
        model.addAttribute("pageTitle", "Recordings");
        model.addAttribute("content", "fragments/recordings");
        return "index";
    }

    @RequestMapping("/performances")
    public String performances(Model model) {
        model.addAttribute("pageTitle", "Performances");
        model.addAttribute("content", "fragments/performances");
        return "index";
    }

    @RequestMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("pageTitle", "Contact / Links");
        model.addAttribute("content", "fragments/contact");
        return "index";
    }
}