package com.freelance.platform.freelance_platform.Services;

import com.freelance.platform.freelance_platform.Models.Freelancer;
import com.freelance.platform.freelance_platform.Models.User;
import com.freelance.platform.freelance_platform.Repositories.FreelancerRepository;
import com.freelance.platform.freelance_platform.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FreelancerRepository freelancerRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public Freelancer createFreelancer(Freelancer freelancer) {
        return freelancerRepository.save(freelancer);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<Freelancer> getAllFreelancers() {
        return freelancerRepository.findAll();
    }
}
