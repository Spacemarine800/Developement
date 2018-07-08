import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		
		//int[] A = {6,10,6,9,7,8};
		//int[] A = {5,8,9,10,6,8,7,11};
		//int[] A = {4,5,8,9,4,10,6,8,7,4,11};
		//int[] A = {6,10,1,2,6,6,7};
		//int[] A = {5,5,3,3,9};
		//int[] A = {5,6,1,3,2,4};
		int[] A = {6,10,7,7,9,8};
		Arrays.sort(A);
		
		System.out.println(new Task2().findLongestSubSeq(A));

	}

	private int findLongestSubSeq(int[] arr) {
		int longestSubSq = 0;
	    int counter = 0;
	    int val = -1;
	    for (int i = 0; i < arr.length - 1; i++) {
	        if (val == -1 && arr[i + 1] - arr[i] < 2) {
	            counter = 2;
	            val = arr[i + 1] - arr[i];
	        } else if (val == 0 && arr[i + 1] - arr[i] <= 1) {
	            counter++;
	            val = arr[i + 1] - arr[i];
	        } else if (val == 1 && arr[i + 1] - arr[i] == 0) {
	            counter++;
	        } else {
	            val = -1;
	            longestSubSq = Math.max(longestSubSq, counter);
	            counter = 0;
	        }
	    }
		return longestSubSq;
		
	}

}
