import java.util.Arrays;

public class FindMIssingNumber {

	public static void main(String[] args) {
		
		int[] a = {2,3,1,5};
		//int[] a = {4,2,3,8,1,6,7,5,10,11};
		Arrays.sort(a);
		System.out.println(new FindMIssingNumber().whatNumberMissing(a));

	}
	
	public int whatNumberMissing(int[] arr){
		int arrSize = arr.length;
		int missingNumber = 0;
		
		for(int g=0; g < arrSize; g++){
			int shouldBeNext = arr[g] + 1;
			if(arr[g + 1] != shouldBeNext){
				missingNumber = shouldBeNext;
				break;
			}
		}
		return missingNumber;
	}

}

/* A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
Your goal is to find that missing element.
Write a function:
class Solution { public int solution(int[] A); }
that, given a zero-indexed array A, returns the value of the missing element.
For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
Assume that:
N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
*/