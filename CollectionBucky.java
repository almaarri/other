package tutorials;
import java.util.*;

public class CollectionBucky {

	public static void main(String[] args) {
		String[] things = {"salad", "chicken", "brown", "potato"};
		List<String> list1 = new ArrayList<String>();
		
		//add array items to list
		for(String x: things)
			list1.add(x);
		
		String[] morethings = {"salad", "chicken"};
		List<String> list2 = new ArrayList<String>();

		//add array items to list
		for(String y: morethings)
			list2.add(y);
		
		//print list1
		for(int i = 0; i<list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
		
		editList(list1,list2);
		System.out.println();
		
		//print list1
		for(int i = 0; i<list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
	}

		public static void editList(Collection<String> l1, Collection<String> l2) {
			Iterator<String> it = l1.iterator();
			while (it.hasNext()) {
				if(l2.contains(it.next()))
					it.remove();
			}
		}
}
