package chess;

import boardgame.Position;

public class ChessPosition {
    
    private char column;
    private int row;


    public ChessPosition (char c, int r) {
        if (c < 'a' || c > 'h' || r < 1 || r > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        column = c;
        row = r;    
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position pos) {
        return new ChessPosition((char) ('a' - pos.getColumn()), 8 - pos.getRow());
    }

    @Override
    public String toString() {
        return "" + column + row;
    }

    public char getColumn() {
        return this.column;
    }

    public int getRow() {
        return this.row;
    }

}
    


