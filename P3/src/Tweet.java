import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tweet {
	//Declare variables
	private String userID; // stores the user id (column 1 in tweets file)
	private Date date; // convert the date-time string (column 2 in the tweets file) to a java.util.Date format
	private String tweet; // stores the tweeted message (column 3 in the tweets file)
	
	//Constructor
	public Tweet (String userID, String dateTime, String tweet){
		this.userID = userID;
		this.tweet = tweet;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try {
		    this.date = sdf.parse(dateTime);
		} catch(ParseException e) {
		    System.exit(0);
		}
	}
	
	//Methods
	public String getUserID (){
		return userID;
	}
	
	public Date getDate (){
		return date;
	}
	
	public String getTweet (){
		return tweet;
	}
	
	public boolean isBefore (Tweet other){
		if (date.before(other.getDate()))
			return true;
		else
			return false;
	}
	
	public String toString (){
		return userID + "\t" + date.toString() + "\t" + tweet;
	}
	
	public boolean equals(Object other){
		if (!(other instanceof Tweet))
			return false;
		Tweet t = (Tweet) other;
		if (tweet.equals(t.getTweet()))
			return true;
		else
			return false;
	}
	
	

}
