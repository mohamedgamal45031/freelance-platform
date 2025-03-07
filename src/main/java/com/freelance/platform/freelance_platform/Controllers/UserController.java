package com.freelance.platform.freelance_platform.Controllers;

import com.freelance.platform.freelance_platform.Models.Freelancer;
import com.freelance.platform.freelance_platform.Models.User;
import com.freelance.platform.freelance_platform.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/createFreelancer")
    public Freelancer createFreelancer(@RequestBody Freelancer freelancer) {
        return userService.createFreelancer(freelancer);
    }

    @GetMapping("/allUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/allFreelancers")
    public List<Freelancer> getAllFreelancers() {
        return userService.getAllFreelancers();
    }
}
