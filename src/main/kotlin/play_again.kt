class play_again {
    fun start(winer: String) {
        println("Great, $winer won this game!")
        print("Do you want to play again? (yes or no) : ")
        var play_again = readLine()?.trim()?.lowercase().toString()
        if (play_again == "yes") {
            score_player_1 = 0
            score_player_2 = 0
            main()
        } else {
            println("Good bye")
        }
    }

    fun equal() {
        println("You are equal")
        print("Do you want to play again? (yes or no) : ")
        var play_again = readLine()
        if (play_again == "yes") {
            score_player_1 = 0
            score_player_2 = 0
            main()
        } else {
            println("Good bye")
        }
    }
}
