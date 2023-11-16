package org.ditod.proxies;

import org.ditod.models.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
