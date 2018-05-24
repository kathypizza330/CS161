

public class ChessBoard {
	
	private ChessPiece[][] board;
	//ChessBoard b = new ChessBoard();



	
	//Constructor
	public ChessBoard(){
		board = new ChessPiece[8][8];
	}
	
	//Methods
	public void initialize(){
		ChessPiece wPawn0 = new Pawn(this, ChessPiece.Color.WHITE);
		ChessPiece wPawn1 = new Pawn(this, ChessPiece.Color.WHITE);
		ChessPiece wPawn2 = new Pawn(this, ChessPiece.Color.WHITE);
		ChessPiece wPawn3 = new Pawn(this, ChessPiece.Color.WHITE);
		ChessPiece wPawn4 = new Pawn(this, ChessPiece.Color.WHITE);
		ChessPiece wPawn5 = new Pawn(this, ChessPiece.Color.WHITE);
		ChessPiece wPawn6 = new Pawn(this, ChessPiece.Color.WHITE);
		ChessPiece wPawn7 = new Pawn(this, ChessPiece.Color.WHITE);
		ChessPiece bRook1 = new Rook(this, ChessPiece.Color.BLACK);
		ChessPiece bRook2 = new Rook(this, ChessPiece.Color.BLACK);
		ChessPiece bKnight1 = new Knight(this, ChessPiece.Color.BLACK);
		ChessPiece bKnight2 = new Knight(this, ChessPiece.Color.BLACK);
		ChessPiece bBishop1 = new Bishop(this, ChessPiece.Color.BLACK);
		ChessPiece bBishop2 = new Bishop(this, ChessPiece.Color.BLACK);
		ChessPiece bKing = new King(this, ChessPiece.Color.BLACK);
		ChessPiece bQueen = new Queen(this, ChessPiece.Color.BLACK);
		ChessPiece bPawn0 = new Pawn(this, ChessPiece.Color.BLACK);
		ChessPiece bPawn1 = new Pawn(this, ChessPiece.Color.BLACK);
		ChessPiece bPawn2 = new Pawn(this, ChessPiece.Color.BLACK);
		ChessPiece bPawn3 = new Pawn(this, ChessPiece.Color.BLACK);
		ChessPiece bPawn4 = new Pawn(this, ChessPiece.Color.BLACK);
		ChessPiece bPawn5 = new Pawn(this, ChessPiece.Color.BLACK);
		ChessPiece bPawn6 = new Pawn(this, ChessPiece.Color.BLACK);
		ChessPiece bPawn7 = new Pawn(this, ChessPiece.Color.BLACK);
		ChessPiece wRook1 = new Rook(this, ChessPiece.Color.WHITE);
		ChessPiece wRook2 = new Rook(this, ChessPiece.Color.WHITE);
		ChessPiece wKnight1 = new Knight(this, ChessPiece.Color.WHITE);
		ChessPiece wKnight2 = new Knight(this, ChessPiece.Color.WHITE);
		ChessPiece wBishop1 = new Bishop(this, ChessPiece.Color.WHITE);
		ChessPiece wBishop2 = new Bishop(this, ChessPiece.Color.WHITE);
		ChessPiece wKing = new King(this, ChessPiece.Color.WHITE);
		ChessPiece wQueen = new Queen(this, ChessPiece.Color.WHITE);
		
		placePiece(bRook1, "a8");
		placePiece(bKnight1, "b8");
		placePiece(bBishop1, "c8");
		placePiece(bKing, "e8");
		placePiece(bQueen, "d8");
		placePiece(bBishop2, "f8");
		placePiece(bKnight2, "g8");
		placePiece(bRook2, "h8");
		placePiece(bPawn0, "a7");
		placePiece(bPawn1, "b7");
		placePiece(bPawn2, "c7");
		placePiece(bPawn3, "d7");
		placePiece(bPawn4, "e7");
		placePiece(bPawn5, "f7");
		placePiece(bPawn6, "g7");
		placePiece(bPawn7, "h7");
		placePiece(wRook1, "a1");
		placePiece(wKnight1, "b1");
		placePiece(wBishop1, "c1");
		placePiece(wKing, "e1");
		placePiece(wQueen, "d1");
		placePiece(wBishop2, "f1");
		placePiece(wKnight2, "g1");
		placePiece(wRook2, "h1");
		placePiece(wPawn0, "a2");
		placePiece(wPawn1, "b2");
		placePiece(wPawn2, "c2");
		placePiece(wPawn3, "d2");
		placePiece(wPawn4, "e2");
		placePiece(wPawn5, "f2");
		placePiece(wPawn6, "g2");
		placePiece(wPawn7, "h2");
	}
	
	public ChessPiece getPiece(String position){
		switch (position){
		case "a8": return board[7][0];
		case "a7": return board[6][0];
		case "a6": return board[5][0];
		case "a5": return board[4][0];
		case "a4": return board[3][0];
		case "a3": return board[2][0];
		case "a2": return board[1][0];
		case "a1": return board[0][0];
		case "b8": return board[7][1];
		case "b7": return board[6][1];
		case "b6": return board[5][1];
		case "b5": return board[4][1];
		case "b4": return board[3][1];
		case "b3": return board[2][1];
		case "b2": return board[1][1];
		case "b1": return board[0][1];
		case "c8": return board[7][2];
		case "c7": return board[6][2];
		case "c6": return board[5][2];
		case "c5": return board[4][2];
		case "c4": return board[3][2];
		case "c3": return board[2][2];
		case "c2": return board[1][2];
		case "c1": return board[0][2];
		case "d8": return board[7][3];
		case "d7": return board[6][3];
		case "d6": return board[5][3];
		case "d5": return board[4][3];
		case "d4": return board[3][3];
		case "d3": return board[2][3];
		case "d2": return board[1][3];
		case "d1": return board[0][3];
		case "e8": return board[7][4];
		case "e7": return board[6][4];
		case "e6": return board[5][4];
		case "e5": return board[4][4];
		case "e4": return board[3][4];
		case "e3": return board[2][4];
		case "e2": return board[1][4];
		case "e1": return board[0][4];
		case "f8": return board[7][5];
		case "f7": return board[6][5];
		case "f6": return board[5][5];
		case "f5": return board[4][5];
		case "f4": return board[3][5];
		case "f3": return board[2][5];
		case "f2": return board[1][5];
		case "f1": return board[0][5];
		case "g8": return board[7][6];
		case "g7": return board[6][6];
		case "g6": return board[5][6];
		case "g5": return board[4][6];
		case "g4": return board[3][6];
		case "g3": return board[2][6];
		case "g2": return board[1][6];
		case "g1": return board[0][6];
		case "h8": return board[7][7];
		case "h7": return board[6][7];
		case "h6": return board[5][7];
		case "h5": return board[4][7];
		case "h4": return board[3][7];
		case "h3": return board[2][7];
		case "h2": return board[1][7];
		case "h1": return board[0][7];
		default: return null;
		}
	}
	
	public boolean placePiece(ChessPiece piece, String position){
		if (getPiece(position)==null){
			put(piece, position);
			piece.setPosition(position);
			if (getPiece(position)==piece){
				return true;
			}
			else{
				//System.out.println(position);
				return false;
			}
		}
		else if (getPiece(position).getColor() != piece.getColor()){
			put(piece, position);
			piece.setPosition(position);
			if (getPiece(position)==piece){
				return true;
			}
			else
				return false;
		}
		else 
			return false;
		
	}
	
	public boolean move(String fromPosition, String toPosition){
		if (getPiece(fromPosition).legalMoves().contains(toPosition)){
		if (getPiece(toPosition)==null){
			ChessPiece piece = getPiece(fromPosition);
			put(piece, toPosition);
			put(null, fromPosition);
			piece.setPosition(toPosition);
			if (getPiece(toPosition)==piece){
				getPiece(toPosition).setPosition(toPosition);
				return true;
			}
			else{
				//System.out.println(position);
				return false;
			}
		}
		else if (getPiece(toPosition).getColor() != getPiece(fromPosition).getColor()){
			ChessPiece piece = getPiece(fromPosition);
			put(null, fromPosition);
			put(piece, toPosition);
			piece.setPosition(toPosition);
			if (getPiece(toPosition)==piece){
				getPiece(toPosition).setPosition(toPosition);
				return true;
			}
			else
				return false;
		}
		else
			return false;}
		else
			return false;
	}
	
	public String toString(){
	    String chess="";
	    String upperLeft = "\u250C";
	    String upperRight = "\u2510";
	    String horizontalLine = "\u2500";
	    String horizontal3 = horizontalLine + "\u3000" + horizontalLine;
	    String verticalLine = "\u2502";
	    String upperT = "\u252C";
	    String bottomLeft = "\u2514";
	    String bottomRight = "\u2518";
	    String bottomT = "\u2534";
	    String plus = "\u253C";
	    String leftT = "\u251C";
	    String rightT = "\u2524";

	    String topLine = upperLeft;
	    for (int i = 0; i<7; i++){
	        topLine += horizontal3 + upperT;
	    }
	    topLine += horizontal3 + upperRight;

	    String bottomLine = bottomLeft;
	    for (int i = 0; i<7; i++){
	        bottomLine += horizontal3 + bottomT;
	    }
	    bottomLine += horizontal3 + bottomRight;
	    chess+=topLine + "\n";

	    for (int row = 7; row >=0; row--){
	        String midLine = "";
	        for (int col = 0; col < 8; col++){
	            if(board[row][col]==null) {
	                midLine += verticalLine + " \u3000 ";
	            } else {midLine += verticalLine + " "+board[row][col]+" ";}
	        }
	        midLine += verticalLine;
	        String midLine2 = leftT;
	        for (int i = 0; i<7; i++){
	            midLine2 += horizontal3 + plus;
	        }
	        midLine2 += horizontal3 + rightT;
	        chess+=midLine+ "\n";
	        if(row>=1)
	            chess+=midLine2+ "\n";
	    }

	    chess+=bottomLine;
	    return chess;
	}
	
	public void put(ChessPiece piece, String position){
		switch (position){
		case "a8": board[7][0] = piece; break;
		case "a7": board[6][0] = piece; break;
		case "a6": board[5][0] = piece; break;
		case "a5": board[4][0] = piece; break;
		case "a4": board[3][0] = piece; break;
		case "a3": board[2][0] = piece; break;
		case "a2": board[1][0] = piece; break;
		case "a1": board[0][0] = piece; break;
		case "b8": board[7][1] = piece; break;
		case "b7": board[6][1] = piece; break;
		case "b6": board[5][1] = piece; break;
		case "b5": board[4][1] = piece; break;
		case "b4": board[3][1] = piece; break;
		case "b3": board[2][1] = piece; break;
		case "b2": board[1][1] = piece; break;
		case "b1": board[0][1] = piece; break;
		case "c8": board[7][2] = piece; break;
		case "c7": board[6][2] = piece; break;
		case "c6": board[5][2] = piece; break;
		case "c5": board[4][2] = piece; break;
		case "c4": board[3][2] = piece; break;
		case "c3": board[2][2] = piece; break;
		case "c2": board[1][2] = piece; break;
		case "c1": board[0][2] = piece; break;
		case "d8": board[7][3] = piece; break;
		case "d7": board[6][3] = piece; break;
		case "d6": board[5][3] = piece; break;
		case "d5": board[4][3] = piece; break;
		case "d4": board[3][3] = piece; break;
		case "d3": board[2][3] = piece; break;
		case "d2": board[1][3] = piece; break;
		case "d1": board[0][3] = piece; break;
		case "e8": board[7][4] = piece; break;
		case "e7": board[6][4] = piece; break;
		case "e6": board[5][4] = piece; break;
		case "e5": board[4][4] = piece; break;
		case "e4": board[3][4] = piece; break;
		case "e3": board[2][4] = piece; break;
		case "e2": board[1][4] = piece; break;
		case "e1": board[0][4] = piece; break;
		case "f8": board[7][5] = piece; break;
		case "f7": board[6][5] = piece; break;
		case "f6": board[5][5] = piece; break;
		case "f5": board[4][5] = piece; break;
		case "f4": board[3][5] = piece; break;
		case "f3": board[2][5] = piece; break;
		case "f2": board[1][5] = piece; break;
		case "f1": board[0][5] = piece; break;
		case "g8": board[7][6] = piece; break;
		case "g7": board[6][6] = piece; break;
		case "g6": board[5][6] = piece; break; 
		case "g5": board[4][6] = piece; break;
		case "g4": board[3][6] = piece; break;
		case "g3": board[2][6] = piece; break;
		case "g2": board[1][6] = piece; break;
		case "g1": board[0][6] = piece; break;
		case "h8": board[7][7] = piece; break;
		case "h7": board[6][7] = piece; break;
		case "h6": board[5][7] = piece; break;
		case "h5": board[4][7] = piece; break;
		case "h4": board[3][7] = piece; break;
		case "h3": board[2][7] = piece; break;
		case "h2": board[1][7] = piece; break;
		case "h1": board[0][7] = piece; break;
		}
	}

	public static void main(String[] args) {
	    ChessBoard board = new ChessBoard();
	    board.initialize();
	    
	    //System.out.println(board);
	    board.move("a2", "a4");
	    board.move("b2", "b4");
	    board.move("c1", "a3");
	    board.move("b4", "b5");
	    board.move("a3", "e7");
	    System.out.println(board);
	}
}
