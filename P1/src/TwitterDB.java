import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class TwitterDB implements TwitterDBInterface {

	private String[] tweets; // stores the tweets loaded from a file containing
								// tweets.

	public void loadTweets(String fileName) {
		File input = new File(fileName);
		try {
			Scanner read = new Scanner(input).useDelimiter("[ *\\-,!?.]+");
			String t = "";
			while (read.hasNextLine()) {
				String line = read.nextLine();
				String[] element = line.split("\t");
				t += element[2] + "\t";
			}
			read.close();
			tweets = t.split("\t");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String mostCommonWord() {
		// Deal with symbols
		Scanner s = new Scanner(tweets[0]).useDelimiter("[ *\\-,!?.]+");
		// Store the first line
		String[] newWords = new String[1];
		int[] times = new int[1];
		int length = 1;

		// Store the first word
		newWords[0] = s.next().toLowerCase();
		times[0] = 1;
		while (s.hasNext()) {
			String word = s.next();
			boolean check = false;
			for (int a = 0; a < newWords.length; a++) {
				// Same word as before
				if (newWords[a].equalsIgnoreCase(word)) {
					times[a]++;
					check = true;
					break;
				}
			}
			// Different word
			if (check == false) {
				String[] oldWords = newWords;
				int[] oldTimes = times;
				length++;
				newWords = new String[length];
				times = new int[length];
				for (int b = 0; b < length - 1; b++) {
					newWords[b] = oldWords[b];
					times[b] = oldTimes[b];
				}
				newWords[length - 1] = word.toLowerCase();
				times[length - 1] = 1;
			}
		}
		s.close();

		// Store the other lines
		for (int i = 1; i < tweets.length; i++) {
			Scanner s1 = new Scanner(tweets[i]).useDelimiter("[ *\\-,!?.]+");
			while (s1.hasNext()) {
				String word = s1.next();
				// process the word
				boolean checkAgain = false;
				for (int a = 0; a < newWords.length; a++) {
					// Same word as before
					if (newWords[a].equalsIgnoreCase(word)) {
						times[a]++;
						checkAgain = true;
						break;
					}
				}
				// Different word
				if (checkAgain == false) {
					String[] oldWords = newWords;
					int[] oldTimes = times;
					length++;
					newWords = new String[length];
					times = new int[length];
					for (int b = 0; b < length - 1; b++) {
						newWords[b] = oldWords[b];
						times[b] = oldTimes[b];
					}
					newWords[length - 1] = word.toLowerCase();
					times[length - 1] = 1;
				}
			}
			s1.close();
		}

		// Find the most common word
		int number = times[0];
		int count = 0;
		for (int c = 1; c < length; c++)

		{
			if (times[c] > number) {
				number = times[c];
				count = c;
			}
		}
		return newWords[count];
	}

	public int[] tweetLengths() {
		int[] tweetLength = { 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 0; i < tweets.length; i++) {
			int count = 0;
				count += tweets[i].length();
			if (count>=1 && count <= 20)
				tweetLength[0]++;
			if (count >= 21 && count <= 40)
				tweetLength[1]++;
			if (count >= 41 && count <= 60)
				tweetLength[2]++;
			if (count >= 61 && count <= 80)
				tweetLength[3]++;
			if (count >= 81 && count <= 100)
				tweetLength[4]++;
			if (count >= 101 && count <= 120)
				tweetLength[5]++;
			if (count >= 121 && count <= 140)
				tweetLength[6]++;
		}
		return tweetLength;
	}

	public int frequency(String word) {
		int count = 0;
		for (int i = 0; i < tweets.length; i++) {
			Scanner s = new Scanner(tweets[i]).useDelimiter("[ *\\-,!?.]+");
			while (s.hasNext()) {
				String tWord = s.next();
				if (word.equalsIgnoreCase(tWord))
					count++;
			}
			s.close();
		}
		return count;
	}

	public static void main(String[] args) {
		TwitterDB tdb = new TwitterDB();
		tdb.loadTweets("tweets.txt");
		System.out.println(tdb.mostCommonWord());
		System.out.println(Arrays.toString(tdb.tweetLengths()));
		System.out.println(tdb.frequency("Radio"));		
		

	}

}
