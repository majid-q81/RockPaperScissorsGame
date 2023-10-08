class Computer_Vs_Computer {
    fun start() {
        print("How many rounds do you want the game to be played(default: 5)? : ")
        var round = readLine()?.toIntOrNull() ?: 5
        val computer1Name = arrayOf("Jorge", "martin", "carlos", "anna").random()
        val computer2Name = arrayOf("robot", "iran", "korosh", "messi").random()
        println("Computer1 name is $computer1Name.")
        println("Computer2 name is $computer2Name.")
        for (i in 1..round) {
            println(terminalPrint().sepraitor() + "\nRound $i")
            val computer1Choose = arrayOf("rock", "paper", "scissors").random()
            val computer2Choose = arrayOf("rock", "paper", "scissors").random()
            val result = Comparison().start(computer1Choose, computer2Choose)
            if (result == 1) {
                score_player_1++
                println(
                    terminalPrint().roundResult(
                        computer1Name,
                        computer2Name,
                        computer1Choose,
                        computer2Choose,
                        computer1Name
                    )
                )
            } else if (result == 2) {
                score_player_2++
                println(
                    terminalPrint().roundResult(
                        computer1Name,
                        computer2Name,
                        computer1Choose,
                        computer2Choose,
                        computer2Name
                    )
                )
            } else {
                score_player_1++
                score_player_2++
                println(
                    terminalPrint().roundResult(
                        computer1Name,
                        computer2Name,
                        computer1Choose,
                        computer2Choose,
                        true
                    )
                )
            }
        }
        println(terminalPrint().finalResult(computer1Name, computer2Name))
        if (score_player_1 > score_player_2) {
            play_again().start(computer1Name)
        } else if (score_player_1 < score_player_2) {
            play_again().start(computer2Name)
        } else {
            play_again().equal()
        }
    }
}