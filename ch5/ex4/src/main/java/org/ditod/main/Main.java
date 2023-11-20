package org.ditod.main;

import org.ditod.config.ProjectConfig;
import org.ditod.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService s = context.getBean(CommentService.class);
        System.out.println("Retrieved CommentService");
    }
}
