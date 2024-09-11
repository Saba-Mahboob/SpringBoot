package com.example.demo;

import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class controller {

    private User user;
    @Autowired
    public void setUser(User user){
        this.user=user;
    }

    @GetMapping("/")
    public String welcome() {
        return "index";
    }

    @GetMapping("/register")
    public String getModel(Model model , @Nullable @RequestParam String valid) {
        model.addAttribute("user", user);
        if(valid!=null&& valid.equals("false"))
        model.addAttribute("validPassword","false");
        if (valid!=null&& valid.equals("name")) {
            model.addAttribute("validName","false");
        }
        return "register";
    }

    @PostMapping("/register")
    public String submit (@ModelAttribute User user,Model model) {
        if (user.getPassword().equals("123") && user.getName()!="")
            return "profile";
         if (user.getName()=="") {
            return "redirect:/register?valid=name";
        } else
            return "redirect:/register?valid=false";

    }

    @GetMapping("/profile")
    public String result(Model model) {
        model.addAttribute("user", user);
        return "profile";
    }
}

