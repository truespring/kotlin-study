package com.example.kotlinpractice.security.account

import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository : JpaRepository<Account, Long> {
    fun findByEmail(email: String): Account?
}