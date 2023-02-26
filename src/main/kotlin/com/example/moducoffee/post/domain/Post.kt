package com.example.moducoffee.post.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDateTime

@Table("Post")
data class Post(
    @Id val id: Long?,
    var title : String,
    var content : String,
    @CreatedDate val createdAt : LocalDateTime,
    @LastModifiedDate var updatedAt : LocalDateTime,
)

data class PostRes(
    val id: Long?,
    val title: String,
    val content: String,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
)

data class PostReq(
    val title: String,
    val content: String,
)

// entity to PostRes
fun Post.toDto() = PostRes(id,title,content,createdAt,updatedAt)

// PostReq to entity
fun PostReq.toEntity() = Post(null,title,content, LocalDateTime.now(), LocalDateTime.now())



