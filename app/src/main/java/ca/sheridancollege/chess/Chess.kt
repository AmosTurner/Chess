package ca.sheridancollege.chess

class Chess {

    override fun toString(): String {
        var description = " \n"
        for (row in 7 downTo 0) {
            description += "$row"
            for (col in 0..7){
                description += " ."
            }
            description += "\n"
        }
        description += " 0 1 2 3 4 5 6 7"

        return description
    }
}