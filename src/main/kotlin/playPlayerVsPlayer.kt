class Player_Vs_Player {
    fun start() {
        print("Please enter a name for player 1 : ")
        val name_player_1 = readLine().toString()
        print("Please enter a name for player 2 : ")
        val name_player_2 = readLine().toString()
        print("How many rounds do you want to play (default: 5) ? : ")
        val round = readLine()?.toIntOrNull() ?: 5
        for (round_game in 1..round) {
            println(terminalPrint().sepraitor())
            println("Round $round_game")
            val player_1_Input = inputUser().start(name_player_1)
            val player_2_Input = inputUser().start(name_player_2)
            val result = Comparison().start(player_1_Input, player_2_Input)
            if (result == 1) {
                score_player_1++
                println(
                    terminalPrint().roundResult(
                        name_player_1,
                        name_player_2,
                        player_1_Input,
                        player_2_Input,
                        name_player_1
                    )
                )
            } else if (result == 2) {
                score_player_2++
                println(
                    terminalPrint().roundResult(
                        name_player_1,
                        name_player_2,
                        player_1_Input,
                        player_2_Input,
                        name_player_2
                    )
                )
            } else {
                score_player_1++
                score_player_2++
                println(terminalPrint().roundResult(name_player_1, name_player_2, player_1_Input, player_2_Input, true))
            }
        }
        println(terminalPrint().finalResult(name_player_1, name_player_2))
        if (score_player_1 > score_player_2) {
            play_again().start(name_player_1)
        } else if (score_player_1 < score_player_2) {
            play_again().start(name_player_2)
        } else {
            play_again().equal()
        }
    }
}