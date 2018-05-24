import java.util.ArrayList;

public abstract class ChessPiece {
	public enum Color {WHITE, BLACK};
	protected ChessBoard board; // the board it belongs to, default null
	protected int row; // the index of the horizontal rows 0..7
	protected int column; // the index of the vertical column 0..7
	protected Color color; // the color of the piece
	
	//Constructor
	public ChessPiece(ChessBoard board, Color color){
		this.board=board;
		this.color=color;
	}
	
	//Methods
	public int getRow(){
		return row;
	}
	
	public int getColumn(){
		return column;
	}
	
	public void setRow(int i){
		if (i<0)
			row = 0;
		else if (i>7)
			row = 7;
		else
		    row=i;
	}
	
	public void setColumn(int i){
		if (i<0)
		    column = 0;
		else if (i>7)
			column = 7;
		else
		    column=i;
	}
	
	public Color getColor(){
		return color;
	}
	
	public String getPosition(){
		String s = "";
		switch (column){
		case 0: s+='a';break;
		case 1: s+='b';break;
		case 2: s+='c';break;
		case 3: s+='d';break;
		case 4: s+='e';break;
		case 5: s+='f';break;
		case 6: s+='g';break;
		case 7: s+='h';break;
		}
		switch (row){
		case 7: s+='8';break;
		case 6: s+='7';break;
		case 5: s+='6';break;
		case 4: s+='5';break;
		case 3: s+='4';break;
		case 2: s+='3';break;
		case 1: s+='2';break;
		case 0: s+='1';break;
		}
		return s;
	}

	public void setPosition(String position){
		switch (position){
		case "a8": row=7; column=0;break;
		case "a7": row=6; column=0;break;
		case "a6": row=5; column=0;break;
		case "a5": row=4; column=0;break;
		case "a4": row=3; column=0;break;
		case "a3": row=2; column=0;break;
		case "a2": row=1; column=0;break;
		case "a1": row=0; column=0;break;
		case "b8": row=7; column=1;break;
		case "b7": row=6; column=1;break;
		case "b6": row=5; column=1;break;
		case "b5": row=4; column=1;break;
		case "b4": row=3; column=1;break;
		case "b3": row=2; column=1;break;
		case "b2": row=1; column=1;break;
		case "b1": row=0; column=1;break;
		case "c8": row=7; column=2;break;
		case "c7": row=6; column=2;break;
		case "c6": row=5; column=2;break;
		case "c5": row=4; column=2;break;
		case "c4": row=3; column=2;break;
		case "c3": row=2; column=2;break;
		case "c2": row=1; column=2;break;
		case "c1": row=0; column=2;break;
		case "d8": row=7; column=3;break;
		case "d7": row=6; column=3;break;
		case "d6": row=5; column=3;break;
		case "d5": row=4; column=3;break;
		case "d4": row=3; column=3;break;
		case "d3": row=2; column=3;break;
		case "d2": row=1; column=3;break;
		case "d1": row=0; column=3;break;
		case "e8": row=7; column=4;break;
		case "e7": row=6; column=4;break;
		case "e6": row=5; column=4;break;
		case "e5": row=4; column=4;break;
		case "e4": row=3; column=4;break;
		case "e3": row=2; column=4;break;
		case "e2": row=1; column=4;break;
		case "e1": row=0; column=4;break;
		case "f8": row=7; column=5;break;
		case "f7": row=6; column=5;break;
		case "f6": row=5; column=5;break;
		case "f5": row=4; column=5;break;
		case "f4": row=3; column=5;break;
		case "f3": row=2; column=5;break;
		case "f2": row=1; column=5;break;
		case "f1": row=0; column=5;break;
		case "g8": row=7; column=6;break;
		case "g7": row=6; column=6;break;
		case "g6": row=5; column=6;break;
		case "g5": row=4; column=6;break;
		case "g4": row=3; column=6;break;
		case "g3": row=2; column=6;break;
		case "g2": row=1; column=6;break;
		case "g1": row=0; column=6;break;
		case "h8": row=7; column=7;break;
		case "h7": row=6; column=7;break;
		case "h6": row=5; column=7;break;
		case "h5": row=4; column=7;break;
		case "h4": row=3; column=7;break;
		case "h3": row=2; column=7;break;
		case "h2": row=1; column=7;break;
		case "h1": row=0; column=7;break;
		default: row=0;column=0;
		}
	}
	
	abstract public String toString();
	
	abstract public ArrayList<String> legalMoves();

}
