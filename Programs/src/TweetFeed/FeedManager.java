package TweetFeed;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

import TweetFeed.UserData.TwitterUser;

public class FeedManager {

	public FeedManager() {
	}

	private boolean result = false;
	
	public boolean execute(){
		
		BufferedReader br = null;
		
		Map<String, TwitterUser> twitterUsers = new HashMap<String, TwitterUser>();
		
		try{
			// Open the file
			br = new BufferedReader(new InputStreamReader(new FileInputStream("../Programs/src/TweetFeed/DataInput/user.txt")));
	
			String strLine;
	
			//Read File Line By Line
			while ((strLine = br.readLine()) != null)   {
				Map<String, TwitterUser> tempTwitterUsers = new HashMap<String, TwitterUser>();	 
				
			   String [] lineRead =  strLine.split("follows"); 

			   //User read
			   String user =  lineRead[lineRead.length - 1].trim();
			   
			   StringTokenizer st = new StringTokenizer(user, ",");
			   String userName = "";
			   if(st.countTokens() > 1){
				   //Multiple Users being followed
				   while(st.hasMoreTokens()){
					   userName = st.nextToken();
					   TwitterUser twUser = new TwitterUser();
					   twUser.setUserDisplayName(userName);
					   tempTwitterUsers.put(userName, twUser);
				   }
			   }else{
				   //Single User being followed
				   userName = st.nextToken();
				   TwitterUser twUser = new TwitterUser();
				   twUser.setUserDisplayName(userName);
				   tempTwitterUsers.put(userName, twUser);
			   }
			   
			   
			   //Follower read, Remember, Follower is a Twitter User and needs to be stored as well
			   String userFollower = lineRead[lineRead.length - 2];
			   TwitterUser fwUser = new TwitterUser();
			   fwUser.setUserDisplayName(userFollower);
			   
			   tempTwitterUsers.put(userFollower, fwUser);
			   
			   //Store Follower on User being followed
			   Iterator itr = tempTwitterUsers.keySet().iterator();
			   while(itr.hasNext()){
				   TwitterUser twUser = tempTwitterUsers.get(itr.next());
				   if(!twUser.getUserDisplayName().equalsIgnoreCase(fwUser.getUserDisplayName())){
					   twUser.getFollowers().add(fwUser);
				   }
				   twitterUsers.put(twUser.getUserDisplayName(), twUser);
			   }
			   
			   result = true;
			   
			   System.out.println(strLine);	
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			if(br != null){
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
}
