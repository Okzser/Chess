package boardgame;

public class Position {

    private int row;
    private int column;

    public Position(int r, int c) {
        row = r;
        column = c;
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return this.column;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    
    @Override
    public String toString() {
        return row + ", " + column;
    }

}
