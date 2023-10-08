class gth {
    fun start() {
        print("Select game mode 1. Easy | 2. Medium | 3. hard (enter number) : ")
        var hard_normal_easy = readLine()?.trim()?.toIntOrNull()
        if (hard_normal_easy !in 1..3) {
            start()
        }

        if (hard_normal_easy == 1) {
            easy()
        } else if (hard_normal_easy == 2) {
            medium()
        } else if (hard_normal_easy == 3) {
            hard()
        }


    }

    fun easy() {
        var chanse_easy = 3
        var number_easy = (1..10).random()
        for (chanse_game in 1..chanse_easy) {
            println("You has $chanse_easy chanse")
            print("The computer has chosen a number from 1 to 10. Guess it : ")
            var chose_number_easy = readLine()?.trim()?.toInt()
            println("--------------------------------------------------------------------------")
            if (chose_number_easy == number_easy) {
                println("You won")
                println("The computer number was $number_easy |The your number was $chose_number_easy")
                print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                var play_again = readLine()?.trim()?.lowercase()?.toInt()
                if (play_again == 1) {
                    main()
                } else if (play_again == 2) {
                    println("Good bye")
                }
                if (play_again !in 1..2) {
                    print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                    var play_again = readLine()?.trim()?.lowercase()?.toInt()
                    if (play_again == 1) {
                        main()
                    } else if (play_again == 2) {
                        println("Good bye")
                    }
                    break
                }
            }
            if (chose_number_easy != number_easy) {
                chanse_easy -= 1
            }
            if (number_easy >= chose_number_easy!!) {
                println("Your number is smaller than the computer number !!")
            }
            if (number_easy <= chose_number_easy!!) {
                println("Your number is greater than the computer number !!")
            }
            if (chanse_easy == 0) {
                println("You lose")
                println("The computer number was $number_easy")
                print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                var play_again = readLine()?.trim()?.lowercase()?.toInt()
                if (play_again == 1) {
                    main()
                } else if (play_again == 2) {
                    println("Good bye")
                }
                if (play_again !in 1..2) {
                    print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                    var play_again = readLine()?.trim()?.lowercase()?.toInt()
                    if (play_again == 1) {
                        main()
                    } else if (play_again == 2) {
                        println("Good bye")
                    }
                }
            }
        }
    }

    fun medium() {
        var chanse_medium = 5
        var number_medium = (1..50).random()
        for (chanse_game in 1..chanse_medium) {
            println("You has $chanse_medium chanse")
            print("The computer has chosen a number from 1 to 25. Guess it : ")
            var chose_number_medium = readLine()?.trim()?.toInt()
            println("--------------------------------------------------------------------------")
            if (chose_number_medium == number_medium) {
                println("You won")
                println("The computer number was $number_medium |The your number was $chose_number_medium")
                print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                var play_again = readLine()?.trim()?.lowercase()?.toInt()
                if (play_again == 1) {
                    main()
                } else if (play_again == 2) {
                    println("Good bye")
                }
                if (play_again !in 1..2) {
                    print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                    var play_again = readLine()?.trim()?.lowercase()?.toInt()
                    if (play_again == 1) {
                        main()
                    } else if (play_again == 2) {
                        println("Good bye")
                    }
                    break
                }
            }
            if (chose_number_medium != number_medium) {
                chanse_medium -= 1
                if (number_medium >= chose_number_medium!!) {
                    println("Your number is smaller than the computer number !!")
                }
                if (number_medium <= chose_number_medium!!) {
                    println("Your number is greater than the computer number !!")
                }
            }
            if (chanse_medium == 0) {
                println("You lose")
                println("The computer number was $number_medium")
                print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                var play_again = readLine()?.trim()?.lowercase()?.toInt()
                if (play_again == 1) {
                    main()
                } else if (play_again == 2) {
                    println("Good bye")
                }
                if (play_again !in 1..2) {
                    print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                    var play_again = readLine()?.trim()?.lowercase()?.toInt()
                    if (play_again == 1) {
                        main()
                    } else if (play_again == 2) {
                        println("Good bye")
                    }
                }

            }

        }
    }

    fun hard() {
        var chanse_hard = 10
        var number_hard = (1..100).random()
        for (chanse_game in 1..chanse_hard) {
            println("You has $chanse_hard chanse")
            print("The computer has chosen a number from 1 to 100. Guess it : ")
            var chose_number_hard = readLine()?.toInt()
            println("--------------------------------------------------------------------------")
            if (chose_number_hard == number_hard) {
                println("You won")
                println("The computer number was $number_hard |The your number was $chose_number_hard")
                print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                var play_again = readLine()?.trim()?.lowercase()?.toInt()
                if (play_again == 1) {
                    main()
                } else if (play_again == 2) {
                    println("Good bye")
                }
                if (play_again !in 1..2) {
                    print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                    var play_again = readLine()?.trim()?.lowercase()?.toInt()
                    if (play_again == 1) {
                        main()
                    } else if (play_again == 2) {
                        println("Good bye")
                    }
                    break
                }
            }
            if (chose_number_hard != number_hard) {
                chanse_hard -= 1
                if (number_hard >= chose_number_hard!!) {
                    println("Your number is smaller than the computer number !!")
                }
                if (number_hard <= chose_number_hard!!) {
                    println("Your number is greater than the computer number !!")
                }
            }
            if (chanse_hard == 0) {
                println("You lose")
                println("The computer number was $number_hard")
                print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                var play_again = readLine()?.trim()?.lowercase()?.toInt()
                if (play_again == 1) {
                    main()
                } else if (play_again == 2) {
                    println("Good bye")
                }
                if (play_again !in 1..2) {
                    print("Do you want to play again? (1.yes or 2.no)? (enter number): ")
                    var play_again = readLine()?.trim()?.lowercase()?.toInt()
                    if (play_again == 1) {
                        main()
                    } else if (play_again == 2) {
                        println("Good bye")
                    }
                }
            }

        }
    }
}