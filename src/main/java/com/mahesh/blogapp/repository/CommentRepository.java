package com.mahesh.blogapp.repository;

import com.mahesh.blogapp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
