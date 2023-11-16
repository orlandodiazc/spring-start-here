package org.ditod.main;

import org.ditod.models.Comment;
import org.ditod.config.ProjectConfig;
import org.ditod.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var commentService = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Task test");
        comment.setAuthor("ditod");
        commentService.publishComment(comment);
    }
}
