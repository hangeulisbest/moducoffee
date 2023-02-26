package com.example.moducoffee.post.adapter.out.persistence

import com.example.moducoffee.post.application.port.out.PostRepositoryUseCase
import com.example.moducoffee.post.domain.Post
import org.springframework.stereotype.Component
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Component
class PostR2dbcRepositoryAdapter(private val postRepository: PostRepository) : PostRepositoryUseCase {
    override fun findAll(): Flux<Post> {
        return postRepository.findAll()
    }

    override fun findById(id: Long): Mono<Post> {
        return postRepository.findById(id)
    }

    override fun save(post: Post): Mono<Post> {
        return postRepository.save(post)
    }
}
