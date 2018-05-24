

import java.util.ArrayList;

import com.ibm.as400.access.AS400;
import com.ibm.as400.access.AS400Message;
import com.ibm.as400.access.CommandCall;


public class Scrap {
   
	
	
	
	
	
    /**
     * @param args
     */
    public static void main(String[] args) {
    	
    	String host = "172.20.53.90";
    	String username = "EBANKOFR";
    	String password = "OFREBANK";
    	
    	String targetUserName = "f3516091";
    	String defaultPassword = "P@ssword1";
    	String status = "*ENABLED";
    	
    	boolean isSuccessful = false;
    	
    	ArrayList<String> as400Users = new ArrayList<String>(); 
        AS400 as400 = new AS400(host, username, password);
        
        CommandCall cmdC = new CommandCall(as400);
        
        StringBuilder cmdStr = null;
        try{
        	//cmdStr = new StringBuilder().append("CHGUSRPRF USRPRF(" + targetUserName + ") STATUS(" + new String(status) + ")");
        	//cmdStr = new StringBuilder().append("RUNSQL SQL('Select count(*) from ibptablepf')");
        	//cmdStr = new StringBuilder().append("RUNSQL SQL('Insert into inbbnkbdb/ibptablepf values(''test.properties'',''testKey'',''testVal'',''atest'',''btest'',''ctest'')') COMMIT(*NONE)");
        	cmdStr = new StringBuilder().append("RUNSQL SQL('Delete from inbbnkbdb/ibptablepf where ptfilename = ''test.properties'' and ptpropkey =''testKey''') COMMIT(*NONE)");
        	isSuccessful = cmdC.run(cmdStr.toString());

            System.out.println("Command status is = " + isSuccessful);
            // getMessageList returns an array of AS400Message objects
            for(AS400Message msg : cmdC.getMessageList()){
            	System.out.println("Msg: " + msg.getID() + ": " + msg.getText()+" : "+msg.getLibraryName());
            }
        	
            
            
        	//cmdStr = new StringBuilder().append("CHGUSRPRF USRPRF(" + targetUserName + ") PASSWORD(" + new String(defaultPassword) + ")");
        	//cmdC.run(cmdStr.toString());
        }catch (Exception e) {
			e.printStackTrace();
		}
        
//        try{
//        	as400.connectService(AS400.SIGNON); 
//        	as400.changePassword("", "Edcnji@ui1");
//        }catch (Exception e) {
//			e.printStackTrace();
//		}
       
//        try{
//        //Retrieving Users
//        UserList users = new UserList(as400);
//        Enumeration io = users.getUsers();
//
//        while (io.hasMoreElements()) {
//        	com.ibm.as400.access.User u = (com.ibm.as400.access.User)io.nextElement();
//        	String userName = u.getName();
//        	System.out.println(userName);
//        	
//        	if (u.getStatus().equalsIgnoreCase("*ENABLED")) {
//        		as400Users.add(userName);
//        	}
//
//        }
//        }catch(Exception e){
//        	e.printStackTrace();
//        }
  }
   
    

}