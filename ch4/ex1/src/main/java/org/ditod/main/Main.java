package org.ditod.main;

import org.ditod.models.Comment;
import org.ditod.proxies.EmailCommentNotificationProxy;
import org.ditod.repositories.DBCommentRepository;
import org.ditod.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();
        var commentService = new CommentService(commentRepository, commentNotificationProxy);
        Comment comment = new Comment();
        comment.setText("Task test");
        comment.setAuthor("ditod");
        commentService.publishComment(comment);
    }
}
