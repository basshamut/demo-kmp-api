package com.kmp.api.demo.service

import com.kmp.api.demo.utils.getPlatform

class GreetingService {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}