package com.springtestngfeign.frignimplementation.model;

import java.util.List;

public class CommentsDTO {

    private List<CommentDTO> comments;

    public List<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(List<CommentDTO> comments) {
        this.comments = comments;
    }
}
