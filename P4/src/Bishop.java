import java.util.ArrayList;

public class Bishop extends ChessPiece {

	public Bishop(ChessBoard board, Color color) {
		super(board, color);
		
	}

	public String toString() {
		if (this.getColor().equals(Color.BLACK))
			return "\u265D";
		else
			return "\u2657";
	}

	public ArrayList<String> legalMoves() {
		ArrayList<String> stringList = new ArrayList<String>();
		int row = this.getRow();
		int col = this.getColumn();
		/////Move up-left
		int i1 = row+1;
		int j1 = col-1;		
		while (true){
			if (i1>7||i1<0)break;
			if (j1>7||j1<0)break;
			String s = "";
			switch (j1){
			case 0: s+='a';break;
			case 1: s+='b';break;
			case 2: s+='c';break;
			case 3: s+='d';break;
			case 4: s+='e';break;
			case 5: s+='f';break;
			case 6: s+='g';break;
			case 7: s+='h';break;
			}
			int next = i1+1;
			s+=next;
			if (board.getPiece(s) != null){
				if (board.getPiece(s).getColor()==this.color)
					break;
				else{
					stringList.add(s);
					break;
				}
			}
			else{
				stringList.add(s);
				i1++;
				j1--;
			}
		}
//		for (int i = row+1;i<=7; i++){
//			for (int j = col-1; j>=0; j--){
//				String s = "";
//				int number = j;
//				switch (number){
//				case 0: s+='a';break;
//				case 1: s+='b';break;
//				case 2: s+='c';break;
//				case 3: s+='d';break;
//				case 4: s+='e';break;
//				case 5: s+='f';break;
//				case 6: s+='g';break;
//				case 7: s+='h';break;
//				}
//				int next = i+1;
//				s+=next;
//				if (board.getPiece(s) != null){
//					if (board.getPiece(s).getColor()==this.color)
//						break;
//					else{
//						stringList.add(s);
//						break;
//					}	
//				}
//				else
//					stringList.add(s);
//			}
//		}
		
		/////Move up-right
		int i2 = row+1;
		int j2 = col+1;
		while (true){
			if (i2>7||i2<0)break;
			if (j2>7||j2<0)break;
			String s = "";
			switch (j2){
			case 0: s+='a';break;
			case 1: s+='b';break;
			case 2: s+='c';break;
			case 3: s+='d';break;
			case 4: s+='e';break;
			case 5: s+='f';break;
			case 6: s+='g';break;
			case 7: s+='h';break;
			}
			int next = i2+1;
			s+=next;
			if (board.getPiece(s) != null){
				if (board.getPiece(s).getColor()==this.color)
					break;
				else{
					stringList.add(s);
					break;
				}
			}
			else{
				stringList.add(s);
				i2++;
				j2++;
			}
		}
//		for (int i = row+1;i<=7; i++){
//			for (int j = col+1; j<=7; j++){
//				String s = "";
//				int number = j;
//				switch (number){
//				case 0: s+='a';break;
//				case 1: s+='b';break;
//				case 2: s+='c';break;
//				case 3: s+='d';break;
//				case 4: s+='e';break;
//				case 5: s+='f';break;
//				case 6: s+='g';break;
//				case 7: s+='h';break;
//				}
//				int next = i+1;
//				s+=next;
//				if (board.getPiece(s) != null){
//					if (board.getPiece(s).getColor()==this.color)
//						break;
//					else{
//						stringList.add(s);
//						break;
//					}	
//				}
//				else
//					stringList.add(s);
//			}
//		}
		
		/////Move down-left
		int i3 = row-1;
		int j3 = col-1;
		while (true){
			if (i3>7||i3<0)break;
			if (j3>7||j3<0)break;
			String s = "";
			switch (j3){
			case 0: s+='a';break;
			case 1: s+='b';break;
			case 2: s+='c';break;
			case 3: s+='d';break;
			case 4: s+='e';break;
			case 5: s+='f';break;
			case 6: s+='g';break;
			case 7: s+='h';break;
			}
			int next = i3+1;
			s+=next;
			if (board.getPiece(s) != null){
				if (board.getPiece(s).getColor()==this.color)
					break;
				else{
					stringList.add(s);
					break;
				}
			}
			else{
				stringList.add(s);
				i3--;
				j3--;
			}
		}
//		for (int i = row-1;i>=0; i--){
//			for (int j = col-1; j>=0; j--){
//				String s = "";
//				int number = j;
//				switch (number){
//				case 0: s+='a';break;
//				case 1: s+='b';break;
//				case 2: s+='c';break;
//				case 3: s+='d';break;
//				case 4: s+='e';break;
//				case 5: s+='f';break;
//				case 6: s+='g';break;
//				case 7: s+='h';break;
//				}
//				int next = i+1;
//				s+=next;
//				if (board.getPiece(s) != null){
//					if (board.getPiece(s).getColor()==this.color)
//						break;
//					else{
//						stringList.add(s);
//						break;
//					}	
//				}
//				else
//					stringList.add(s);
//			}
//		}
		
		/////Move down-right
		int i4 = row-1;
		int j4 = col+1;
		while (true){
			if (i4>7||i4<0)break;
			if (j4>7||j4<0)break;
			String s = "";
			switch (j4){
			case 0: s+='a';break;
			case 1: s+='b';break;
			case 2: s+='c';break;
			case 3: s+='d';break;
			case 4: s+='e';break;
			case 5: s+='f';break;
			case 6: s+='g';break;
			case 7: s+='h';break;
			}
			int next = i4+1;
			s+=next;
			if (board.getPiece(s) != null){
				if (board.getPiece(s).getColor()==this.color)
					break;
				else{
					stringList.add(s);
					break;
				}
			}
			else{
				stringList.add(s);
				i4--;
				j4++;
			}
		}
//		for (int i = row-1;i>=0; i--){
//			for (int j = col+1; j<=7; j++){
//				String s = "";
//				int number = j;
//				switch (number){
//				case 0: s+='a';break;
//				case 1: s+='b';break;
//				case 2: s+='c';break;
//				case 3: s+='d';break;
//				case 4: s+='e';break;
//				case 5: s+='f';break;
//				case 6: s+='g';break;
//				case 7: s+='h';break;
//				}
//				int next = i+1;
//				s+=next;
//				if (board.getPiece(s) != null){
//					if (board.getPiece(s).getColor()==this.color)
//						break;
//					else{
//						stringList.add(s);
//						break;
//					}	
//				}
//				else
//					stringList.add(s);
//			}
//		}
		
		System.out.println(stringList);
		return stringList;
	}

}
