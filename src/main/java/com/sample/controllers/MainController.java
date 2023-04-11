package com.sample.controllers;

import com.sample.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String sheetHome(Model model){
        model.addAttribute("personName", "Serhii");
        return "some";
    }

    @GetMapping("/users")
    public String getUsers(Model model){
        List<User> userList = new ArrayList<>();
        userList.add(new User("Djon","Silver", "23"));
        userList.add(new User("Violet","Evergarden", "21"));

        model.addAttribute("usersList", userList);

        return "users";
    }
}
