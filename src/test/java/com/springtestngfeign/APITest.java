package com.springtestngfeign;

import com.springtestngfeign.frignimplementation.model.*;
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
        assert !users.isEmpty() && users.size()==10;
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

    @Test
    public void testCanGetCommentsByPostIdWithPathVariable(){
        int postId = 1;
        List<CommentDTO> comments = usersService.getCommentsByPostIdPathVariable(postId);
        assert !comments.isEmpty() && comments.size()==5;
        assert comments.stream().allMatch(x -> x.getPostId() ==postId);
    }

    @Test
    public void testCanGetCommentByPostIdWithRequestParam() {
        int postId = 2;
        List<CommentDTO> comments = usersService.getCommentsByPostIdRequestParam(postId);
        assert !comments.isEmpty() && comments.size() == 5;
        assert comments.stream().allMatch(x -> x.getPostId() ==postId);
    }

    @Test
    public void dummyTest() {
        PersonsDTO personsDTO = usersService.getPersons();
        assert personsDTO != null;
    }
}
