package com.js.service;

import com.js.pojo.Comment;

import java.util.List;

public interface CommentService {
    /*获取评论列表*/
    List<Comment> listCommentByBlogId(Long blogId);

    /*保存Comment方法*/
    Comment saveComment(Comment comment);
}
