package com.example.moducoffee.post.application.port.out

import com.example.moducoffee.post.domain.Post
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface PostRepositoryUseCase {
    fun findAll() : Flux<Post>
    fun findById(id : Long) : Mono<Post>
    fun save(post : Post) : Mono<Post>
}