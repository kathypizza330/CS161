
public class LinearSearch implements Searching{

	public int search(int[] numbersToSearch, int numberToSearchFor) {
		if (numbersToSearch.length == 0 || numbersToSearch == null)
			return -1;
		for (int i = 0; i<numbersToSearch.length; i++){
			if (numbersToSearch[i] == numberToSearchFor)
				return i;
		}
		return -1;
	}

}
