var score_player_1 = 0
var score_player_2 = 0
fun main() {
    print("Do you want to play |1. guessing numbers or |__|2. rock paper scissor?| (Please enter number): ")
    val gtn_or_rps = readLine()?.trim()?.toIntOrNull()
    if (gtn_or_rps !in 1..2) {
        println(terminalPrint().wrongError())
        main()
    } else if (gtn_or_rps == 1) {
        gth().start()
    } else {
        rps()
    }
}

fun rps() {
    println(terminalPrint().start())
    val gameMode = readLine()?.toIntOrNull()
    if (gameMode !in 1..3) {
        println(terminalPrint().wrongError())
        rps()
    } else {
        when (gameMode) {
            1 -> Player_Vs_Player().start()
            2 -> Player_Vs_Computer().start()
            3 -> Computer_Vs_Computer().start()
        }
    }
}