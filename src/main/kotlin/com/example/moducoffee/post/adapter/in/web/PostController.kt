package com.example.moducoffee.post.adapter.`in`.web

import com.example.moducoffee.post.application.port.`in`.PostWebUseCase
import com.example.moducoffee.post.domain.PostReq
import com.example.moducoffee.post.domain.PostRes
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/v1/posts")
class PostController(private val postUseCase: PostWebUseCase) {

    @PostMapping
    fun createPost(@RequestBody post : PostReq) : Mono<PostRes> {
        return postUseCase.save(post)
    }

    @GetMapping("/{id}")
    fun getPostOne(@PathVariable id : Long) : Mono<PostRes> {
        return postUseCase.getOne(id)
    }

    @GetMapping
    fun getPostAll() : Mono<List<PostRes>> {
        return postUseCase.getAll()
    }


}