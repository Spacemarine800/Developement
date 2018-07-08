import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SortNumbers {

	public static void main(String[] args) {
		SortNumbers sN = new SortNumbers();
		sN.sortArray();
		sN.sortArrayList();
	}
	
	public void sortArray(){
		
		int[] unsortedNumbers = {3,5,1,4,1,2};
		
		System.out.println("Unsorted");
		for(int c=0; c < unsortedNumbers.length; c++){
			System.out.println(unsortedNumbers[c]);
		}
		
		Arrays.sort(unsortedNumbers);
		
		System.out.println("Sorted");
		for(int c=0; c < unsortedNumbers.length; c++){
			System.out.println(unsortedNumbers[c]);
		}
		
		System.out.println("Sorted without duplicates");
		Set<Integer> numSet = removeDuplicates(unsortedNumbers);
		Iterator<Integer> itr = numSet.iterator();
		int[] tmp = new int[numSet.size()];
		for(int c=0; c < tmp.length; c++){
			if(itr.hasNext()){
				tmp[c] = itr.next();
			}			
		}
		
		for(int c=0; c < tmp.length; c++){
			System.out.println(tmp[c]);			
		}
		
	}
	
	public Set<Integer> removeDuplicates(int[] numsWithDupl){
		Set<Integer> numberSet = new HashSet<Integer>();
		for(int c=0; c < numsWithDupl.length; c++){
			numberSet.add(numsWithDupl[c]);
		}
		return numberSet;
	}
	
	public void sortArrayList() {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(1);
		numbers.add(4);
		numbers.add(1);
		numbers.add(2);
		
		System.out.println("Unsorted");
		for(int c=0; c < numbers.size(); c++){
			System.out.println(numbers.get(c));
		}
		
		numbers.sort(new NumberComparator());
		System.out.println("Sorted");
		for(int c=0; c < numbers.size(); c++){
			System.out.println(numbers.get(c));
		}
		
		System.out.println("Sorted without duplicates");
		Iterator<Integer> itr = removeDuplicatesArrayList(numbers).iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
	
	public Set<Integer> removeDuplicatesArrayList(ArrayList<Integer> numsWithDupl){
		Set<Integer> numberSet = new HashSet<Integer>();
		for(int c=0; c < numsWithDupl.size(); c++){
			numberSet.add(numsWithDupl.get(c));
		}
		return numberSet;
	}
	
	public class NumberComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {
			return o1.compareTo(o2);
		}
	}
	
}
