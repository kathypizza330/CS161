import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TwitterDB {
	//Declare variables
	private String comment; // describes the contents of the tweets database
	private ArrayList<Tweet> tweets; // stores all the tweets
	
	//Constructor
	public TwitterDB(String comment){
		this.comment = comment;
		tweets = new ArrayList<Tweet> (0);
	}
	
	//Methods
	public void addTweet(Tweet tweet){
		tweets.add(tweet);
	}
	
	public int getNumberOfTweets(){
		return tweets.size();
	}
	
	public Tweet getTweet(int i){
		return tweets.get(i);
	}
	
	public Tweet earliestTweet(){
		if (tweets.size() == 0)
			return null;
		else{
			Tweet t = tweets.get(0);
			for (int i = 1; i<tweets.size(); i++){
				if (tweets.get(i).isBefore(t))
					t = tweets.get(i);
			}
			return t;
		}
	}
	
	public TwitterDB tweetsBy(String userID){
		TwitterDB t = new TwitterDB ("tweets by "+ userID);
		t.tweets = new ArrayList<Tweet>(0);
		for (Tweet t1 : this.tweets){
			if (t1.getUserID().equals(userID)){
				t.addTweet(t1);
			}
		}
		return t;
	}
	
	public TwitterDB tweetsBefore(String dateTime){
		TwitterDB t = new TwitterDB ("tweets before "+ dateTime);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try {
		    Date d = sdf.parse(dateTime);
			t.tweets = new ArrayList<Tweet>(0);
		for (Tweet t1 : this.tweets){
			if (t1.getDate().before(d)){
				t.addTweet(t1);
			}
		}
		} catch(ParseException e) {
		    System.exit(0);
		}
		return t;
	}
	
	public TwitterDB tweetsBefore(Tweet tweet){
		TwitterDB t = new TwitterDB ("tweets before this tweet: "+ tweet);
		t.tweets = new ArrayList<Tweet>(0);
		for (Tweet t1 : this.tweets){
			if (t1.isBefore(tweet)){
				t.addTweet(t1);
			}
		}
		return t;
	}
	
	public String toString(){
		String s = comment+"\n";
		for (Tweet t1 : this.tweets)
			s += t1+"\n";
		return s;
	}
	
	public String whoTweetedThat(String tweet){
		for (Tweet t1 : this.tweets){
			if (t1.getTweet().equals(tweet)){
				return t1.getUserID();
			}
		}
		return null;
	}
}
