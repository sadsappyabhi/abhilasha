package com.abhiche.abhilasha;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("pageTitle", "abhilasha is an electro-acoustic improviser");
        return "home";
    }

    @RequestMapping("/bio")
    public String bio(Model model) {
        model.addAttribute("pageTitle", "Bio");
        return "bio";
    }

    @RequestMapping("/nullcopula")
    public String nullCopula(Model model) {
        model.addAttribute("pageTitle", "Null Copula");
        return "null-copula";
    }

    @RequestMapping("/turtleboat")
    public String turtleBoat(Model model) {
        model.addAttribute("pageTitle", "Turtle Boat");
        return "turtle-boat";
    }

    @RequestMapping("/recordings")
    public String recordings(Model model) {
        model.addAttribute("pageTitle", "Recordings");
        return "recordings";
    }

    @RequestMapping("/performances")
    public String performances(Model model) {
        model.addAttribute("pageTitle", "Performances");
        return "performances";
    }

    @RequestMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("pageTitle", "Contact / Links");
        return "contact";
    }
}