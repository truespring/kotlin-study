package com.example.kotlinpractice.api.member

import com.example.kotlinpractice.api.member.domain.Member
import com.example.kotlinpractice.api.member.repository.MemberRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/members")
class MemberController(
    val memberRepository: MemberRepository
) {
    @GetMapping()
    fun getMembers(): ResponseEntity<*> {
        val users = memberRepository.findAll()

        return ResponseEntity.ok(users)
    }

    @PostMapping
    fun setMember(@RequestBody member: Member): ResponseEntity<*> {
        val res = memberRepository.save(member)

        return ResponseEntity.ok(res)
    }

}