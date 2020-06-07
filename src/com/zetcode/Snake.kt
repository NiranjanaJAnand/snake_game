package com.zetcode
import javax.swing.JFrame

class Snake : JFrame() {

    init {

        initUI()
    }

    private fun initUI() {
        add(Board())
        title = "Snake Game"
        isResizable = false
        pack()

        setLocationRelativeTo(null)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }
}