import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDominantNumber {

	public static void main(String[] args) {
		int[] A = {3, 67, 23, 67, 67};
		System.out.println(new FindDominantNumber().findDominant(A));
		int[] B = {3, 67, 23, 67, 67, 4, 1, 32, 56, 101, 101, 97, 101, 3001, 101};
		System.out.println(new FindDominantNumber().findDominant(B));
	}

	public int findDominant(int[] arrayN){
		int arraySize = arrayN.length;
		Set<Integer> tmpset = new HashSet<Integer>();
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		
		for(int a=0; a < arraySize; a++){
			tmpset.add(arrayN[a]);
		}
		
		Iterator<Integer> itr = tmpset.iterator();
		while(itr.hasNext()){
			int value = itr.next();
			int countOfNumber = 0;
			for(int b=0; b < arraySize; b++){
				if(arrayN[b] == value){
					countOfNumber++;
				}
			}
			hMap.put(value, countOfNumber);
		}
		
		int dominant = 0;
		int highestCount = 0;
		
		Iterator<Integer> itrMap = hMap.keySet().iterator();
		while(itrMap.hasNext()){
			Integer hMapKey = itrMap.next();
			if(hMap.get(hMapKey) > highestCount){
				highestCount = hMap.get(hMapKey);
				dominant = hMapKey;
			}
		}
		
		return dominant;
		
	}
	
}

/*The problem is as follows: A dominant member in the array is one that occupies over half the positions in the array, for example:

{3, 67, 23, 67, 67}

67 is a dominant member because it appears in the array in 3/5 (>50%) positions.

Now, you are expected to provide a method that takes in an array and returns an index of the dominant member if one exists and -1 if there is none.

Easy, right? Well, I could have solved the problem handily if it were not for the following constraints:

    Expected time complexity is O(n)
    Expected space complexity is O(1)

I can see how you could solve this for O(n) time with O(n) space complexities as well as O(n^2) time with O(1) space complexities, but not one that meets both O(n) time and O(1) space. */