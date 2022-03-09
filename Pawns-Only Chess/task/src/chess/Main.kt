package chess

import java.util.*

fun main() {
    val linha18 = "Pawns-Only Chess"
    val linha17 = "  +---+---+---+---+---+---+---+---+"
    val linha16 = "8 |   |   |   |   |   |   |   |   |"
    val linha15 = "  +---+---+---+---+---+---+---+---+"
    val linha14 = "7 | B | B | B | B | B | B | B | B |"
    val linha13 = "  +---+---+---+---+---+---+---+---+"
    val linha12 = "6 |   |   |   |   |   |   |   |   |"
    val linha11 = "  +---+---+---+---+---+---+---+---+"
    val linha10 = "5 |   |   |   |   |   |   |   |   |"
    val linha9 = "  +---+---+---+---+---+---+---+---+"
    val linha8 = "4 |   |   |   |   |   |   |   |   |"
    val linha7 = "  +---+---+---+---+---+---+---+---+"
    val linha6 = "3 |   |   |   |   |   |   |   |   |"
    val linha5 = "  +---+---+---+---+---+---+---+---+"
    val linha4 = "2 | W | W | W | W | W | W | W | W |"
    val linha3 = "  +---+---+---+---+---+---+---+---+"
    val linha2 = "1 |   |   |   |   |   |   |   |   |"
    val linha1 = "  +---+---+---+---+---+---+---+---+"
    val linha0 = "    a   b   c   d   e   f   g   h  "

    val board = mutableListOf(
        linha17, linha16, linha15, linha14, linha13, linha12, linha11, linha10, linha9,
        linha8, linha7, linha6, linha5, linha4, linha3, linha2, linha1, linha0
    )

    //ask for names
    println(linha18)
    println("First Player's name:")
    val scanner = Scanner(System.`in`)
    val player1 = scanner.next()
    println("Second Player's name:")
    val player2 = scanner.next()

    //print board
    printBoard(board)

    var player1Input: String
    var player2Input: String

    var isValid = false
    var isTheEnd = false
    do {
        do {
            println("$player1\'s turn:")
            player1Input = scanner.next()
            val isExit = validateExitInput(player1Input)
            if (isExit) {
                isValid = false
                isTheEnd = true
            }
            if (!isExit) {
                isValid = validatePlayerInput(player1Input)
                if (isValid) {

                } else {
                    println("Invalid Input")
                }
            }
        } while (!isValid && !isExit)

        if (!isTheEnd) {
            do {
                println("$player2's turn:")
                player2Input = scanner.next()
                val isExit = validateExitInput(player2Input)
                if (isExit) {
                    isValid = false
                    isTheEnd = true
                }
                if (!isExit) {
                    isValid = validatePlayerInput(player2Input)
                    if (isValid) {

                    } else {
                        println("Invalid Input")
                    }
                }
            } while (!isValid && !isExit)
        }
    } while (!isTheEnd)
    println("Bye!")

}

fun validateExitInput(input: String): Boolean {
    if (input.equals("exit", true)) {
        return true
    }
    return false
}

fun validatePlayerInput(input: String): Boolean {

    if (input.length != 4) return false

    val firstLetter = input.substring(0, 1).single()
    val firstNumber = input.substring(1, 2).toInt()
    val secondLetter = input.substring(2, 3).single()
    val secondNumber = input.substring(3, 4).toInt()

    val isFirstLetterWithin = firstLetter in 'a'..'h'
    val isSecondLetterWithin = secondLetter in 'a'..'h'
    val isFirstNumberWithin = firstNumber in 1..8
    val isSecondNumberWithin = secondNumber in 1..8

    if (isFirstLetterWithin && isSecondLetterWithin && isFirstNumberWithin && isSecondNumberWithin) {
        return true
    }
    return false
}

fun printBoard(board: MutableList<String>) {
    for (line in board) {
        println(line)
    }
}
