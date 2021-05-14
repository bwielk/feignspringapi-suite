package com.springtestngfeign.frignimplementation.services;

import com.springtestngfeign.frignimplementation.client.ReqResService;
import com.springtestngfeign.frignimplementation.client.UserService;
import com.springtestngfeign.frignimplementation.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl {

    @Autowired
    private UserService userService;

    @Autowired
    private ReqResService reqResService;

    public List<UserResponseDTO> getUsers(){
        return userService.getUsers();
    }

    public UpdateResponseDTO createPost(UpdateRequestDTO updateRequestDTO){
        return userService.createPost(updateRequestDTO);
    }

    public List<CommentDTO> getCommentsByPostIdPathVariable(int id){
        return userService.getCommentByPostIdPathVariable(id);
    }

    public List<CommentDTO> getCommentsByPostIdRequestParam(int id) {
        return userService.getCommentsByPostIdRequestParam(id);
    }

    public PersonsDTO getPersons(){
        return reqResService.getAllPersons();
    }
}
