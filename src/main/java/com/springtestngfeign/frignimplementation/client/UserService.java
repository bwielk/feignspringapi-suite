package com.springtestngfeign.frignimplementation.client;

import com.springtestngfeign.frignimplementation.model.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "UserService")
public interface UserService {

    @GetMapping("/users")
    public List<UserResponseDTO> getUsers();
}
