
public class BinarySearch implements Searching{
	
	public int search(int[] numbersToSearch, int numberToSearchFor) {
		if (numbersToSearch.length == 0 || numbersToSearch == null)
			return -1;
		return search(0,numbersToSearch.length, numbersToSearch, numberToSearchFor);
	}
	
	public int search(int start, int end, int[] numbersToSearch, int numberToSearchFor){
		//System.out.println(start+" "+" "+end);
		int index = (start+end)/2;
		if (numbersToSearch[start] == numberToSearchFor)
			return start;
		if (end - start == 1) return -1;
		if (numbersToSearch[index] == numberToSearchFor)
			return index;
		if (numbersToSearch[index]<numberToSearchFor)
			return search(index, end, numbersToSearch, numberToSearchFor);
		return search(start, index, numbersToSearch, numberToSearchFor);
	}

}
