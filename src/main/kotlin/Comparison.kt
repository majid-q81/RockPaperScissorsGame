class Comparison {
    fun start(player1Input: String, player2Input: String): Int {
        when (player1Input) {
            "rock" -> if (player2Input == "paper") {
                return 2
            } else if (player2Input == "scissors") {
                return 1
            } else {
                return 0
            }

            "paper" -> if (player2Input == "rock") {
                return 1
            } else if (player2Input == "scissors") {
                return 2
            } else {
                return 0
            }

            "scissors" -> if (player2Input == "rock") {
                return 2
            } else if (player2Input == "paper") {
                return 1
            } else {
                return 0
            }
        }
        return -1
    }
}