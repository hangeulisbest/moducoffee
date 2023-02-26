package com.example.moducoffee.post.adapter.out.persistence

import com.example.moducoffee.post.domain.Post
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface PostRepository : ReactiveCrudRepository<Post,Long>