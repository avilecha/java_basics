import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hashset = new HashSet<String>(5);
		
		boolean r1 = hashset.add("A");
		System.out.println(r1);
		hashset.add("B");
		hashset.add("C");
		hashset.add("D");
		boolean r2 = hashset.add("A");
		System.out.println(r2);
		System.out.println("HashSet size is: "+hashset.size()+" & Values are: "+hashset);
		System.out.println("HashSet contains C or not: "+hashset.contains("C"));
		
		hashset.remove("A");
		
		System.out.println("HasSet value is: "+hashset);
		
		
		for (String item:hashset) {
			System.out.println(item);
		}
	}

}
