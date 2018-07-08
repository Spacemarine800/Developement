import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortAlphabets {

	public static void main(String[] args) {
		SortAlphabets sA = new SortAlphabets();
		sA.sortArrayListOfNames();
	}

	public void sortArrayListOfNames(){
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Manuel");
		names.add("Sindig");
		names.add("Brett");
		names.add("Will");
		names.add("Alan");
		names.add("Jake");
		
		System.out.println("Unsorted Names");
		names.forEach(name->System.out.println(name));
		
		Collections.sort(names, new NameComparator());
		
		System.out.println("Sorted Names");
		names.forEach(name->System.out.println(name));
				
	}
	
	public class NameComparator implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			return o1.compareTo(o2);
		}
	}
}
