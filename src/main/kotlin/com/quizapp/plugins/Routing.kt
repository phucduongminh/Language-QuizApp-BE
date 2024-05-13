@file:Suppress("ktlint:standard:no-wildcard-imports")

package com.quizapp.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/hello") {
            call.respondText("Hello World!")
        }
    }
}
