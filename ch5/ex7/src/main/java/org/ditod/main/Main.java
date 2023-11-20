package org.ditod.main;

import org.ditod.config.ProjectConfig;
import org.ditod.models.Comment;
import org.ditod.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = context.getBean(CommentService.class);

        commentService.sendComment(new Comment());
        commentService.sendComment(new Comment());
    }
}
