class terminalPrint {
    fun start(): String {
        return sepraitor() + "\nWelcome to Rock✊, Paper✋, Scissor ✂ game!\n" + "Choose an options : \n" + "1. Player vs. Player\n" + " 2. Player vs. Computer\n" + "  3. Computer vs. Computer"
    }

    fun wrongError(): String {
        return "Wrong: Please choose from the available options!"
    }

    fun point(name1: String, name2: String): String {
        return "Points : $name1 Points: $score_player_1 | $name2 Points: $score_player_2"
    }

    fun sepraitor(): String {
        return "--------------------------------------------------------------------------"
    }

    fun finalResult(name1: String, name2: String): String {
        return sepraitor() + "\nGame over!\n" + point(name1, name2)
    }

    fun roundResult(name1: String, name2: String, chose1: String, chose2: String, winner: String): String {
        return "$name1 chose $chose1.\n" + "$name2 chose $chose2.\n" + "Round : $winner won this round\n" + point(
            name1,
            name2
        )
    }

    fun roundResult(name1: String, name2: String, chose1: String, chose2: String, point: Boolean): String {
        if (point == true) {
            return "$name1 chose $chose1.\n" + "$name2 chose $chose2.\n" + "Round : $name1 and $name2 are equal and one point is added to both.\n" + point(
                name2,
                name1
            )
        } else {
            return "$name1 chose $chose1.\n" + "$name2 chose $chose2.\n" + "Round : $name1 and $name2 are equal, no points will be awarded!.\n" + point(
                name2,
                name1
            )
        }
    }

    fun incorrectly(): String {
        return "You entered incorrectly, no points will be awarded!"
    }
}