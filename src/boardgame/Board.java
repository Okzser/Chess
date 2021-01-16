package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Piece piece(int row, int column) {
		return pieces[row][column];
	}

	public Piece piece(Position p) {
		return pieces[p.getRow()][p.getColumn()];
	}

	public void placePiece(Piece pic, Position pos) {
		pieces[pos.getRow()][pos.getColumn()] = pic;
		pic.position = pos;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
}
