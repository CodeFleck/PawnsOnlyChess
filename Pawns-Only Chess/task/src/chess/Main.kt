package chess

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

    val board = mutableListOf(linha18, linha17, linha16, linha15, linha14, linha13, linha12, linha11, linha10, linha9,
        linha8, linha7, linha6, linha5, linha4, linha3, linha2, linha1, linha0)

    for(line in board) {
        println(line)
    }


}