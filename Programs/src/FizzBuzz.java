
public class FizzBuzz {

	public static void main(String[] args) {
		
		int fizzNum = 3;
		int buzzNum = 5;
		
		String outPut = "";
		
		for(int i=1; i <= 100; i++){
			outPut = "";
			if((i % fizzNum == 0) && (i % buzzNum == 0)){
				outPut += "FizzBuzz";
			}else if(i % fizzNum == 0){
				outPut += "Fizz";
			}else if(i % buzzNum == 0){
				outPut += "Buzz";
			}
			if("".equalsIgnoreCase(outPut)){
				System.out.println(i);
			}else{
				System.out.println(outPut);
			}
			
		}
	}

}
