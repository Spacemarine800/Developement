
public class FrogLeapTime {

	public static void main(String[] args) {
		int X = 5;
		int[] A = {1,3,1,4,2,3,5,4};
		
		System.out.println("Earliest Time to leap: "+ new FrogLeapTime().whichMinute(X, A));
		
	}

	private int whichMinute(int x, int[] a) {
		int arraySize = a.length;
		int earliestMinute = 0;		
		
		for(int c=0; c < arraySize; c++){
			if(a[c] == x){
				if(earliestMinute == 0){
					earliestMinute = c;
				}
			}
		}
		
		return earliestMinute;		
	}

}
