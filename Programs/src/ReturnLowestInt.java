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
