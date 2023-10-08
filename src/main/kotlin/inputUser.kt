class inputUser {
    fun start(playerName: String): String {
        while (true) {
            print("$playerName: Choose rock, paper or scissors? ")
            val playerInput = readLine()?.trim()?.toLowerCase().toString()
            if (playerInput in arrayOf("rock", "paper", "scissors")) {
                return playerInput
            } else {
                println(terminalPrint().wrongError())
            }
        }
    }
}