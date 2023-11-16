package org.ditod.config;

import org.ditod.proxies.CommentNotificationProxy;
import org.ditod.proxies.EmailCommentNotificationProxy;
import org.ditod.repositories.CommentRepository;
import org.ditod.repositories.DBCommentRepository;
import org.ditod.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    @Bean
    public CommentService commentService(CommentRepository commentRepository,
                                         CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }
}
