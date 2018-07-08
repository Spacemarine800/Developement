import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ReturnLowestInt {

	public static void main(String[] args) {
		
		//5
		int[] A = {1,3,6,4,1,2};
		//4
		//int[] A = {1,2,3};
		//1
		//int[] A = {-3,-1};
		//1
		//int[] A = {2,5,6,8,100};
		
		ReturnLowestInt rLi = new ReturnLowestInt();
		System.out.println(rLi.solution(A));

	}

	public int solution(int[] A){
		int lowest=1; //Excludes 0
		
		//Sort array
		Arrays.sort(A);
		
		//Remove duplicates
		int[]noDuplicatesArray = removeDuplicates(A);
		
		//Find Lowest possible not existing
		for(int g=0; g < noDuplicatesArray.length; g++){
			if(noDuplicatesArray[g] == lowest){
				//Exists
				lowest++;
			}
		}
		return lowest;
	}

	public int[] removeDuplicates(int[] arrayN){
		Set<Integer> tmpSet = new HashSet<Integer>();
		
		for(int a=0; a < arrayN.length; a++){
			tmpSet.add(arrayN[a]);
		}

		int[] tmpArray = new int[arrayN.length];
		Iterator itr = tmpSet.iterator();
		for(int d=0; d < tmpSet.size(); d++){
			if(itr.hasNext()){
				tmpArray[d] = (int) itr.next();
			}
		}
		
		return tmpArray;
	}
	
}

/*This is a demo task.

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

//Given A = [−1, −3], the function should return 1.

Assume that:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].

Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N) (not counting the storage required for input arguments).*/