import java.util.Random;

public class RandomSearch implements Searching{
	Random n = new Random();
	
	public int search(int[] numbersToSearch, int numberToSearchFor) {
		if (numbersToSearch.length == 0 || numbersToSearch == null)
			return -1;
		for (int i = 0; i<5; i++){
			int number = n.nextInt(numbersToSearch.length);
			if (numbersToSearch[number] == numberToSearchFor)
				return number;
		}
		return -1;
	}

}
