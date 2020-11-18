package com.springtestngfeign.frignimplementation.services;

import com.springtestngfeign.frignimplementation.client.UserService;
import com.springtestngfeign.frignimplementation.model.UserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl {

    @Autowired
    private UserService userService;

    public List<UserResponseDTO> getUsers(){
        return userService.getUsers();
    }
}
