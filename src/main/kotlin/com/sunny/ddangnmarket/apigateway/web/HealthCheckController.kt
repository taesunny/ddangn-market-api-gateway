package com.sunny.ddangnmarket.apigateway.web

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HealthCheckController {
    @RequestMapping(value = ["/api/v1/available"])
    fun available(): String? {
        return "It's available - api controller"
    }

    @RequestMapping(value = ["/api/vi/checked-out"])
    fun checkedOut(): String? {
        return "Checked out - api controller"
    }
}