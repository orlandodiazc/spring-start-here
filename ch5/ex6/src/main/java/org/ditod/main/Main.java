package org.ditod.main;

import org.ditod.config.ProjectConfig;
import org.ditod.services.CommentService;
import org.ditod.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService s1 = context.getBean(CommentService.class);
        UserService s2 = context.getBean(UserService.class);
        boolean isSameReference = s1.getCommentRepository() == s2.getCommentRepository();
        System.out.println(isSameReference);
    }
}
