package com.meridiansoc

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("com.meridiansoc")
                .mainClass(Application.javaClass)
                .start()
    }
}
