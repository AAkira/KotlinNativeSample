package com.github.aakira.kotlinnativesample.common

expect fun platformName(): String

fun createApplicationScreenMessage() : String {
    return "Kotlin Rocks on ${platformName()}"
}