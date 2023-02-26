package com.example.moducoffee.post.application.service

import com.example.moducoffee.post.application.port.`in`.PostWebUseCase
import com.example.moducoffee.post.application.port.out.PostRepositoryUseCase
import com.example.moducoffee.post.domain.*
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@Service
class PostService(private val postRepositoryUseCase: PostRepositoryUseCase) : PostWebUseCase {
    override fun getAll(): Mono<List<PostRes>> {
        return postRepositoryUseCase.findAll().map(Post::toDto).collectList()
    }

    override fun getOne(id : Long): Mono<PostRes> {
        return postRepositoryUseCase.findById(id).map(Post::toDto)
    }

    override fun save(post : PostReq): Mono<PostRes> {
        return postRepositoryUseCase.save(post.toEntity()).map(Post::toDto)
    }
}