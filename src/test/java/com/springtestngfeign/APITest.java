package com.springtestngfeign;

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

}
