import weapon.Paper
import weapon.Rock
import weapon.Weapon
import weapon.Scissor


class App {
    private var winCondition = 0

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val app = App()
            app.printHeader()
            app.playerOneTurn()
        }
    }

    fun printHeader() {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    fun playerOneTurn() {
        println("Masukkan Pemain 1")
        val choiceOne = readLine()
        if (choiceOne.equals("gunting", ignoreCase = true)) {
            scissorChosen()
        }
        if (choiceOne.equals("kertas", ignoreCase = true)) {
            paperChosen()
        }
        if (choiceOne.equals("batu", ignoreCase = true)) {
            rockChosen()
        }

    }

    private fun scissorChosen() {
        println("Masukkan Pemain 2")
        val choiceTwo = readLine()
        if (choiceTwo.equals("gunting", ignoreCase = true)) {
            val scissorScissor = 1
            val scissorPaper = 0
            val scissorRock = 0
            checkWinner(Scissor(scissorScissor, scissorPaper, scissorRock))
        }
        if (choiceTwo.equals("kertas", ignoreCase = true)) {
            val scissorScissor = 0
            val scissorPaper = 1
            val scissorRock = 0
            checkWinner(Scissor(scissorScissor, scissorPaper, scissorRock))
        }
        if (choiceTwo.equals("batu", ignoreCase = true)) {
            val scissorScissor = 0
            val scissorPaper = 0
            val scissorRock = 1
            checkWinner(Scissor(scissorScissor, scissorPaper, scissorRock))
        }
    }

    private fun paperChosen() {
        println("Masukkan Pemain 2")
        val choiceTwo = readLine()
        if (choiceTwo.equals("gunting", ignoreCase = true)) {
            val paperScissor = 1
            val paperPaper = 0
            val paperRock = 0
            checkWinner(Paper(paperScissor, paperPaper, paperRock))
        }
        if (choiceTwo.equals("kertas", ignoreCase = true)) {
            val paperScissor = 0
            val paperPaper = 1
            val paperRock = 0
            checkWinner(Paper(paperScissor, paperPaper, paperRock))
        }
        if (choiceTwo.equals("batu", ignoreCase = true)) {
            val paperScissor = 0
            val paperPaper = 0
            val paperRock = 1
            checkWinner(Paper(paperScissor, paperPaper, paperRock))
        }
    }

    private fun rockChosen() {
        println("Masukkan Pemain 2")
        val choiceTwo = readLine()
        if (choiceTwo.equals("gunting", ignoreCase = true)) {
            val rockScissor = 1
            val rockPaper = 0
            val rockRock = 0
            checkWinner(Rock(rockScissor, rockPaper, rockRock))
        }
        if (choiceTwo.equals("kertas", ignoreCase = true)) {
            val rockScissor = 0
            val rockPaper = 1
            val rockRock = 0
            checkWinner(Rock(rockScissor, rockPaper, rockRock))
        }
        if (choiceTwo.equals("batu", ignoreCase = true)) {
            val rockScissor = 0
            val rockPaper = 0
            val rockRock = 1
            checkWinner(Rock(rockScissor, rockPaper, rockRock))
        }
    }


    private fun checkWinner(weapon: Weapon) {
        winCondition += weapon.vsScissor()
        winCondition += weapon.vsPaper()
        winCondition += weapon.vsRock()
        if (winCondition == 3) {
            println("Pemain 1 MENANG")
        } else {
            if (winCondition == 2) {
                println("Pemain 2 MENANG")
            } else {
                println("DRAW")
            }
        }

    }

}
