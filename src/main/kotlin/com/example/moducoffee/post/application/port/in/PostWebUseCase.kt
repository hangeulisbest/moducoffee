package com.example.moducoffee.post.application.port.`in`


import com.example.moducoffee.post.domain.PostReq
import com.example.moducoffee.post.domain.PostRes
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

interface PostWebUseCase {
    fun getAll() : Mono<List<PostRes>>
    fun getOne(id : Long) : Mono<PostRes>
    fun save(post : PostReq) : Mono<PostRes>
}
