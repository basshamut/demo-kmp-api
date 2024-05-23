package com.kmp.api.demo

import com.kmp.api.demo.constants.SERVER_PORT
import com.kmp.api.demo.controller.moduleController
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = SERVER_PORT, host = "0.0.0.0", module = Application::moduleController)
        .start(wait = true)
}