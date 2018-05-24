package TweetFeed.UserData;

import java.util.ArrayList;

public class TwitterUser {

	public TwitterUser() {
	}

	String userDisplayName = "";
	
	ArrayList<TwitterUser> followers = new ArrayList<TwitterUser>();
	
	ArrayList<String> tweets = new ArrayList<String>();

	public String getUserDisplayName() {
		return userDisplayName.trim();
	}

	public void setUserDisplayName(String userDisplayName) {
		this.userDisplayName = userDisplayName.trim();
	}

	public ArrayList<TwitterUser> getFollowers() {
		return followers;
	}

	public void setFollowers(ArrayList<TwitterUser> followers) {
		this.followers = followers;
	}

	public ArrayList<String> getTweets() {
		return tweets;
	}

	public void setTweets(ArrayList<String> tweets) {
		this.tweets = tweets;
	}
	
}
