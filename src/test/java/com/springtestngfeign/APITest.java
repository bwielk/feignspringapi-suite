package com.springtestngfeign;

import com.springtestngfeign.frignimplementation.model.UpdateRequestDTO;
import com.springtestngfeign.frignimplementation.model.UpdateResponseDTO;
import com.springtestngfeign.frignimplementation.model.UserResponseDTO;
import com.springtestngfeign.frignimplementation.services.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;

public class APITest extends BaseAPITest {

    @Autowired
    private UsersServiceImpl usersService;

    @Test
    public void testUsersAreRetrieved(){
        List<UserResponseDTO> users = usersService.getUsers();
        assert !users.isEmpty();
    }

    @Test
    public void testPostCanBeCreated(){
        UpdateRequestDTO updateRequestDTO = new UpdateRequestDTO();
        updateRequestDTO.setBody("Hello");
        updateRequestDTO.setTitle("This is the title");
        updateRequestDTO.setUserId((long) 33243342);
        UpdateResponseDTO updateResponseDTO = usersService.createPost(updateRequestDTO);
        assert updateResponseDTO.getBody().equals("Hello");
        assert !updateRequestDTO.getTitle().equals("ABC");
    }

}
