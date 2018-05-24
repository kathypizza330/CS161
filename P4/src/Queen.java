import java.util.ArrayList;

public class Queen extends ChessPiece {

	public Queen(ChessBoard board, Color color) {
		super(board, color);
	}

	public String toString() {
		if (this.getColor().equals(Color.WHITE))
			return "\u2655";
		else
			return "\u265B";
	}

	public ArrayList<String> legalMoves() {
		ArrayList<String> s= new ArrayList<String>(0);
		return s;
	}

}
