package org.ditod.main;

import org.ditod.config.ProjectConfig;
import org.ditod.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.stream.events.Comment;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService cs1 = context.getBean("commentService", CommentService.class);
        CommentService cs2 = context.getBean("commentService", CommentService.class);

        boolean isSameReference = cs1 == cs2;
        System.out.println(isSameReference);
    }
}
