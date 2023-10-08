class Player_Vs_Computer {
    fun start() {
        var round = 1
        print("Enter the desired score (default: 5) : ")
        val score_input = readLine()?.toIntOrNull() ?: 5
        print("player choose your name : ")
        val player_Name = readLine().toString()
        val computer_Name = arrayOf("Jorge", "martin", "carlos", "anna").random()
        println("Computer name is $computer_Name.")
        while (score_player_1 != score_input && score_player_2 != score_input) {
            println(terminalPrint().sepraitor())
            println("Round $round")
            round++
            print("$player_Name: Choose rock, paper or scissors? ")
            val player_Choose = readLine()?.trim()?.lowercase().toString()
            val computer_Choose = arrayOf("rock", "paper", "scissors").random()
            if (player_Choose !in arrayOf("rock", "paper", "scissors")) {
                println(terminalPrint().incorrectly())
                println(terminalPrint().point(player_Name, computer_Name))
            } else {
                val result = Comparison().start(computer_Choose, player_Choose)
                if (result == 1) {
                    score_player_1++
                    println(
                        terminalPrint().roundResult(
                            computer_Name,
                            player_Name,
                            computer_Choose,
                            player_Choose,
                            computer_Name
                        )
                    )
                } else if (result == 2) {
                    score_player_2++
                    println(
                        terminalPrint().roundResult(
                            computer_Name,
                            player_Name,
                            computer_Choose,
                            player_Choose,
                            player_Name
                        )
                    )
                } else {
                    println(
                        terminalPrint().roundResult(
                            computer_Name,
                            player_Name,
                            computer_Choose,
                            player_Choose,
                            false
                        )
                    )
                }
            }
        }
        println(terminalPrint().finalResult(player_Name, computer_Name))
        if (score_player_1 > score_player_2) {
            play_again().start(computer_Name)
        } else if (score_player_1 < score_player_2) {
            play_again().start(player_Name)
        }
    }
}