package org.ditod.repositories;

import org.ditod.models.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
