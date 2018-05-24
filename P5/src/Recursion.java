import java.util.Arrays;

public class Recursion {
	public String encrypt(String s) {
		String result = "";
		if (s.length() == 0)
			return result;
		else {
			result += (char) (s.charAt(0) - 1);
			result += (char) (s.charAt(0) + 1);
			return result + encrypt(s.substring(1));
		}
	}

	public int[] reverseCumulative(int[] numbers) {
		// System.out.println(Arrays.toString(numbers));
		if (numbers.length == 1) {
			return numbers;
		} else {
			int[] newArray = new int[numbers.length];
			helpCumulative(0, numbers, newArray);
			return newArray;
		}
	}

	private int helpCumulative(int index, int[] numbers, int[] newArray) {
		int sum = 0;
		// System.out.println("index is "+index);
		if (index == numbers.length - 1) {
			sum = numbers[index];
		} else {
			sum = numbers[index] + helpCumulative(index + 1, numbers, newArray);
		}
		newArray[index] = sum;
		// System.out.println("return index is "+index);
		return sum;
	}

	
	private class Pair {
	    private int row;
	    private int column;

	    public Pair(int row, int column) {
	        this.row = row;
	        this.column = column;
	    }
		
	    public String toString() {
	        return "(" + row + ", " + column + ")";
	    }
	}
	
	public Pair search2D(int[][] data, int element){
		return searchRow(0,data, element);
	}
	
	private Pair searchRow(int index, int[][] data, int element){
		if (data.length == 0 || data == null )
			return null;
		else if (index >= data.length)
			return null;
		else{
			int col = searchCol(0,data[index], element);
			if (col == -1)
				return searchRow(index+1, data, element);
			else{
				Pair p = new Pair(index, col);
				return p;
			}
		}
	}
	
	private int searchCol(int index, int[] data, int element){
		if (index >= data.length)
			return -1;
		else{
			if (data[index] == element)
				return index;
			else
				return searchCol(index+1, data, element);
		}
	}

	public static void main(String[] args) {
		Recursion r = new Recursion();
		System.out.println("encrypt(View!) = " + r.encrypt("View!"));
		int[] numbers = new int[] { 5, 6, 7, 2, 3, 1 };
		System.out.print("reverseCumulative(numbers) = ");
		System.out.println(Arrays.toString(r.reverseCumulative(numbers)));
		int[][] table = new int[][] { {8}, {1,1,5} };
		System.out.println(r.search2D(table, 5));
		System.out.println(r.search2D(table, 10));

	}

}
