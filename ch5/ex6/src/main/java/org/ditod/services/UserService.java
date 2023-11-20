package org.ditod.services;

import org.ditod.repositories.CommentRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final CommentRepository commentRepository;

    public UserService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
