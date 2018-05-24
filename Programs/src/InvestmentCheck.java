import java.util.logging.Logger;

public class InvestmentCheck {

	//private static Logger log = Logger.getLogger("InfoLogging");
	
	public static void main(String[] args) {
		
		//ScenarioRun();
		Homeloan();

	}
	
	public static void Homeloan(){
		
		double remainingMonths = 199;
		double remainingAmount = 1601524;
		double monthlyAmount = 15956;
		double monthlyInterest = 11400;
		double extra = 10000;
		
		for(double i=1; i <= remainingMonths; i++){
			System.out.println("Month: "+i+" Remaining Amount Before debit: "+Math.round(remainingAmount));
			remainingAmount = ((remainingAmount - extra) + monthlyInterest) - monthlyAmount;
			if(remainingAmount < 0){
				System.exit(0);
			}
			System.out.println("Month: "+i+" Remaining Amount: "+Math.round(remainingAmount)+" Interest: "+Math.round(monthlyInterest)+" Monthly Amount: "+Math.round(monthlyAmount)+" Extra: "+extra);
		}
		
	}
	
	public static void ScenarioRun(){
		
		double currentAmount = 1143550;
		double montlyAmount = 7600;
		double periodInMonths = 60;
		double roiRate = 8.75;
		
		for(int i=1; i <= periodInMonths; i++){
			System.out.println("Month: "+i);
			currentAmount = currentAmount + montlyAmount;
			System.out.println("Current Amount: "+Math.round(currentAmount));
			if(0 == (i % 12)){
				double interest = currentAmount * (roiRate / 100);
				System.out.println("Reached "+i+" Months, Interest "+Math.round(interest));
				currentAmount = currentAmount + interest;
				System.out.println("Current Amount After Interest: "+Math.round(currentAmount));
			}
			
		}
	}
	

}
