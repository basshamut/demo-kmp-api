package com.kmp.api.demo.controller

import com.kmp.api.demo.service.GreetingService
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun Application.moduleController() {
    routing {
        get("/") {
            call.respondText("Ktor: ${GreetingService().greet()}")
        }
        get("/hour") {
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
            val current = LocalDateTime.now().format(formatter)
            call.respondText("Ktor: $current")
        }
    }
}