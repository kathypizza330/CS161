import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

// P2
// Author: Lingyang Zhu
// Date:   2/3/2016
// Class:  CS161
// Email:  lyzhu@rams.colostate.edu

public class TwitterDB {
	private Tweet[] tweets = new Tweet[0]; // stores all the tweets, and
											// initially there are none
	private int numberOfTweets = 0; // stores the number of tweets in the
									// atweets array

	// Constructor
	public TwitterDB(String fileName) {
		File file = new File(fileName);
		try {
			Scanner s = new Scanner(file);
			while (s.hasNextLine()){
				s.nextLine();
				numberOfTweets++;
			}
			s.close();
			tweets = new Tweet[numberOfTweets];
			// String [] id = new String [numberOfTweets], t = new String
			// [numberOfTweets];
			// Date [] date = new Date [numberOfTweets];
			Scanner input = new Scanner(file);
			for (int i = 0; i < numberOfTweets; i++) {
				String[] line = input.nextLine().split("\t");
				tweets[i] = new Tweet(line[0], line[1], line[2]);
			}
			input.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	// Methods
	public void addTweet(Tweet tweet) {
		Tweet[] newTweet = tweets;
		numberOfTweets++;
		tweets = new Tweet[numberOfTweets];
		for (int i = 0; i < numberOfTweets - 1; i++) {
			tweets[i] = newTweet[i];
		}
		tweets[numberOfTweets - 1] = tweet;
	}

	public int getNumberOfTweets() {
		return numberOfTweets;
	}

	public Tweet earliestTweet() {
		Tweet early = tweets[0];
		for (int i = 1; i < numberOfTweets; i++) {
			if (tweets[i].isBefore(early))
				early = tweets[i];
		}
		return early;
	}

	public Tweet[] tweetsBy(String userID) {
		int length = 0;
		boolean check = false;
		Tweet[] yes = new Tweet[0];
		if (tweets.length == 0)
			return yes;
		else if (tweets == null)
			return yes;
		else {
			for (int i = 0; i < numberOfTweets; i++) {
				if (tweets[i].getUserID().equals(userID)) {
					length++;
					check = true;
				}
			}
			if (check) {
				yes = new Tweet[length];
				int index = 0;
				for (int i = 0; i < numberOfTweets; i++) {
					if (tweets[i].getUserID().equals(userID)) {
						yes[index] = tweets[i];
						index++;
					}
				}
			}
		}
		return yes;
	}

	public Tweet[] tweetsBefore(String dateTime) {
		int length = 0;
		boolean check = false;
		Date d = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try {
		    d = sdf.parse(dateTime);
		} catch(ParseException e) {
		    System.exit(0);
		}
		Tweet[] yes = new Tweet[0];
		if (tweets.length == 0)
			return yes;
		else if (tweets == null)
			return yes;
		else {
			for (int i = 0; i < numberOfTweets; i++) {
				if (tweets[i].getDate().before(d)) {
					length++;
					check = true;
				} 
			}
			if (check) {
				yes = new Tweet[length];
				int index = 0;
				for (int i = 0; i < numberOfTweets; i++) {
					if (tweets[i].getDate().before(d)) {
						yes[index] = tweets[i];
						index++;
					}
				}
			}
		}

		return yes;
	}

	public Tweet[] tweetsBefore(Tweet tweet) {
		int length = 0;
		boolean check = false;
		Tweet[] yes = new Tweet[0];
		if (tweets.length == 0)
			return yes;
		else if (tweets == null)
			return yes;
		else {
			for (int i = 0; i < numberOfTweets; i++) {
				if (tweets[i].getDate().before(tweet.getDate())) {
					length++;
					check = true;
				} 
			}
			if (check) {
				yes = new Tweet[length];
				int index = 0;
				for (int i = 0; i < numberOfTweets; i++) {
					if (tweets[i].getDate().before(tweet.getDate())) {
						yes[index] = tweets[i];
						index++;
					}
				}
			}
		}

		return yes;
		//return tweetsBefore(tweet.getDate().toString());
	}

	public Tweet getTweet(int i) {
		return tweets[i];
	}

	public String toString() {
		return Arrays.toString(tweets);
	}
	
    public static void main(String[] args) {
        TwitterDB tdb = new TwitterDB(args[0]); 

        Tweet t = tdb.earliestTweet();
        System.out.println("Earliest tweeted message:" + t.getTweet());

        Tweet[] tweets = tdb.tweetsBy("USER_989b85bb");
        System.out.println("Number of tweets by USER_989b85bb: " + tweets.length);

        tweets = tdb.tweetsBefore("2010-03-07T18:26:13");
        System.out.println("Number of tweets before 2010-03-07T18:26:13: " + tweets.length);
        

        tweets = tdb.tweetsBefore(tdb.tweets[0]);
        System.out.println("Number of tweets before test tweet: " + tweets.length);
    }

}