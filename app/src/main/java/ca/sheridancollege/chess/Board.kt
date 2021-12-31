package ca.sheridancollege.chess

class Board {
    var pieces = mutableSetOf<Piece>()

    init {
        reset()
    }

    private fun reset() {
        pieces.removeAll(pieces)
        for (i in 0..1) {
            pieces.add(Piece(0 + i * 7, 0, Player.WHITE, Rank.ROOK))
            pieces.add(Piece(0 + i * 7, 7, Player.BLACK, Rank.ROOK))

            pieces.add(Piece(1 + i * 5, 0, Player.WHITE, Rank.KNIGHT))
            pieces.add(Piece(1 + i * 5, 7, Player.BLACK, Rank.KNIGHT))

            pieces.add(Piece(2 + i * 3, 0, Player.WHITE, Rank.BISHOP))
            pieces.add(Piece(2 + i * 3, 7, Player.BLACK, Rank.BISHOP))
        }
        for (i in 0..7) {
            pieces.add(Piece(i, 1, Player.WHITE, Rank.PAWN))
            pieces.add(Piece(i, 6, Player.BLACK, Rank.PAWN))
        }

        pieces.add(Piece(3, 0, Player.WHITE, Rank.QUEEN))
        pieces.add(Piece(3, 7, Player.BLACK, Rank.QUEEN))
        pieces.add(Piece(4, 0, Player.WHITE, Rank.KING))
        pieces.add(Piece(4, 7, Player.BLACK, Rank.KING))
    }

    private fun pieceAt(col: Int, row: Int): Piece? {
        // Checks for a match in location
        for (piece in pieces) {
            if (col == piece.col && row == piece.row) {
                return piece
            }
        }
        return null;
    }

    override fun toString(): String {
        var description = " \n"
        for (row in 7 downTo 0) {
            description += "$row"
            for (col in 0..7) {
                val piece = pieceAt(col, row)
                if (piece == null) {
                    description += " ."
                } else {
                    val white = piece.player == Player.WHITE
                    description += " "
                    description += when (piece.rank) {
                        Rank.KING -> {
                            if (white) "k" else "K"
                        }
                        Rank.QUEEN -> {
                            if (white) "q" else "Q"
                        }
                        Rank.ROOK -> {
                            if (white) "r" else "R"
                        }
                        Rank.BISHOP -> {
                            if (white) "b" else "B"
                        }
                        Rank.KNIGHT -> {
                            if (white) "n" else "N"
                        }
                        Rank.PAWN -> {
                            if (white) "p" else "P"
                        }
                    }
                }
            }
            description += "\n"
        }
        description += " 0 1 2 3 4 5 6 7"

        return description
    }
}