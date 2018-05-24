import java.util.ArrayList;

public class Rook extends ChessPiece {

	public Rook(ChessBoard board, Color color) {
		super(board, color);
	}

	public String toString() {
		if (this.getColor().equals(Color.BLACK))
			return "\u265C";
		else
			return "\u2656";
	}

	public ArrayList<String> legalMoves() {
		ArrayList<String> stringList = new ArrayList<String>();
		/////// Move in same column
		String s = "";
		// Alphabet part of the position string
		s += this.getPosition().charAt(0);
		// Row of the position string
		int right = this.getRow();
		/// Move forward
		for (int i = right+1; i <= 7; i++) {
			String st = s;
			int number = i + 1;
			st += number;
			if (board.getPiece(st) != null){
				if (board.getPiece(st).getColor()==this.color)
					break;
				else{
					stringList.add(st);
					break;
				}				
			}
			else
				stringList.add(st);
		}
		/// Move backward
		for (int i = right-1; i >= 0; i--) {
			String st = s;
			int number = i + 1;
			st += number;
			if (board.getPiece(st) != null){
				if (board.getPiece(st).getColor()==this.color)
					break;
				else{
					stringList.add(st);
					break;
				}	
			}
			else
				stringList.add(st);
		}
		///// Move in the same row
		// Number part of the position string
		int n = this.getRow()+1;
		// Column of the position string
		int pCol = this.getColumn();
		/// Move left
		for (int i = pCol-1; i>=0; i--){
			String st = "";
			int number = i;
			switch (number){
			case 0: st+='a';break;
			case 1: st+='b';break;
			case 2: st+='c';break;
			case 3: st+='d';break;
			case 4: st+='e';break;
			case 5: st+='f';break;
			case 6: st+='g';break;
			case 7: st+='h';break;
			}
			st+=n;
			if (board.getPiece(st) != null){
				if (board.getPiece(st).getColor()==this.color)
					break;
				else{
					stringList.add(st);
					break;
				}	
			}
			else
				stringList.add(st);
		}
		///Move right
		for (int i = pCol; i<=7; i++){
			String st = "";
			int number = i+1;
			switch (number){
			case 0: st+='a';break;
			case 1: st+='b';break;
			case 2: st+='c';break;
			case 3: st+='d';break;
			case 4: st+='e';break;
			case 5: st+='f';break;
			case 6: st+='g';break;
			case 7: st+='h';break;
			}
			st+=n;
			if (board.getPiece(st) != null){
				if (board.getPiece(st).getColor()==this.color)
					break;
				else{
					stringList.add(st);
					break;
				}	
			}
			else
				stringList.add(st);
		}
		System.out.println(stringList);
		return stringList;
	}

}
