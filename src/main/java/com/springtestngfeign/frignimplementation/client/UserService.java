package com.springtestngfeign.frignimplementation.client;

import com.springtestngfeign.frignimplementation.model.CommentDTO;
import com.springtestngfeign.frignimplementation.model.UpdateRequestDTO;
import com.springtestngfeign.frignimplementation.model.UpdateResponseDTO;
import com.springtestngfeign.frignimplementation.model.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

@Service
@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "UserService")
public interface UserService {

    @RequestMapping(method = RequestMethod.GET,
                    path = "/users",
                    produces = APPLICATION_JSON_VALUE)
    List<UserResponseDTO> getUsers();

    @RequestMapping(method = RequestMethod.POST,
                    path = "/posts",
                    consumes = APPLICATION_JSON_VALUE,
                    produces = APPLICATION_JSON_VALUE)
    UpdateResponseDTO createPost(UpdateRequestDTO updateRequestDTO);

    @RequestMapping(method = RequestMethod.POST,
                    path = "/posts/{postId}/comments",
                    produces = APPLICATION_JSON_VALUE)
    List<CommentDTO> getCommentByPostId(@PathVariable("postId") int postId);
}
