package org.ditod.proxies;

import org.ditod.models.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notification for: " + comment.getText());
    }
}
