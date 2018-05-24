import java.util.ArrayList;

public class Pawn extends ChessPiece {

	public Pawn(ChessBoard board, Color color) {
		super(board, color);
	}

	public String toString() {
		if (this.getColor().equals(Color.BLACK))
			return "\u265F";
		else
			return "\u2659";
	}

	public ArrayList<String> legalMoves() {
		ArrayList<String> stringList = new ArrayList<String>();
		// Initial place, move one or two forward
		if (this.getColor() == Color.BLACK) {
			if (this.getPosition().charAt(1) == '7') {
				String s1 = "", s2 = "";
				s1 += this.getPosition().charAt(0);
				s1+='6';
				stringList.add(s1);
				if (board.getPiece(s1) == null) {
					s2 += this.getPosition().charAt(0);
					s2+='5';
					stringList.add(s2);
				}
			}
			// Not initial place, move only one forward
			else {
				String s = "";
				s += this.getPosition().charAt(0);
				int a = this.getRow();
				if (a >= 2) {
					int c1 = a - 1;
					s += c1;
					stringList.add(s);
				}
			}
			String left = "";
			String right = "";
			left+=(char)((int)this.getPosition().charAt(0)-1);
			left+=(char)(this.getPosition().charAt(1)-1);
			right+= (char)((int)this.getPosition().charAt(0)+1);
			right+=(char)(this.getPosition().charAt(1)-1);
			
			if (board.getPiece(left)!=null){
			if (!board.getPiece(left).getColor().equals(this.color))
				stringList.add(left);
			}
			if (board.getPiece(right)!=null){
			if (!board.getPiece(right).getColor().equals(this.color))
				stringList.add(right);
			}
		}
		// Initial place, move one or two forward
		if (this.getColor() == Color.WHITE) {
			if (this.getPosition().charAt(1) == '2') {
				String s1 = "", s2 = "";
				s1 += this.getPosition().charAt(0);
				s1+='3';
				stringList.add(s1);
				if (board.getPiece(s1) == null) {
					s2 += this.getPosition().charAt(0);
					s2+='4';
					stringList.add(s2);
				}
			}
			// Not initial place, move only one forward
			else {
				String s = "";
				s += this.getPosition().charAt(0);
				int a = this.getRow();
				if (a <= 7) {
					int c = a + 2;
					s += c;
					stringList.add(s);
				}
			}
			String left = "";
			String right = "";
			left+=(char)((int)this.getPosition().charAt(0)-1);
			left+=(char)(this.getPosition().charAt(1)+1);
			right+= (char)((int)this.getPosition().charAt(0)+1);
			right+=(char)(this.getPosition().charAt(1)+1);
			
			if (board.getPiece(left)!=null){
			if (!board.getPiece(left).getColor().equals(this.color))
				stringList.add(left);
			}
			if (board.getPiece(right)!=null){
			if (!board.getPiece(right).getColor().equals(this.color))
				stringList.add(right);
			}
		}
		System.out.println(stringList);
		return stringList;
	}
}
