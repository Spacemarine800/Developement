import java.util.ArrayList;

public class Task1 {

	public static void main(String[] args) {
		
		//A occurrs in B
		
		int A = 53;
		int B = 1953786;

		System.out.println(new Task1().findOccurs(A, B));
		
	}

	private int findOccurs(int a, int b) {
		
		String aVal = String.valueOf(a);
		String bVal = String.valueOf(b);
		int position = -1;
		
		if(bVal.contains(aVal)){
			position = bVal.indexOf(aVal);
		}
		 return position;
	}

}
