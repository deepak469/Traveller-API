package com.ibm.hackathon.service;

import com.ibm.hackathon.model.User;
import com.ibm.hackathon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        userRepository.save(user);
    }

    public User getUser(Integer userId) {
        return userRepository.findById(new Long(userId)).get();
    }
}
