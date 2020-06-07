package com.zetcode

import java.awt.EventQueue

fun main() {

    EventQueue.invokeLater {
        val ex = Snake()
        ex.isVisible = true
    }
}