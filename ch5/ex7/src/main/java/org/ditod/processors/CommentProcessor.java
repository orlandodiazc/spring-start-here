package org.ditod.processors;

import org.ditod.models.Comment;
import org.ditod.repositories.CommentRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {
    private final CommentRepository commentRepository;
    private Comment comment;

    public CommentProcessor(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }

    public void processComment(Comment comment) {
    }

    public void validateComment(Comment comment) {
    }


}