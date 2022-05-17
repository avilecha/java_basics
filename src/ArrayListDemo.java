import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LHS as INTERFACE & RHS as IMPLEMENTATION OF THE INTERFACE and Integer donating class type of implementation
		List<Integer> arrayList = new ArrayList<Integer>(5);
		int k=0;
		for (int i = 1; i<=5; i++) {
			arrayList.add(i);
			}

		System.out.println(arrayList);
			
		
		arrayList.remove(3);
		
		System.out.println(arrayList);
			
		
		for(int i=0;i<arrayList.size(); i++) {
			System.out.print(arrayList.get(i)+" ");
			k = k + arrayList.get(i);
			
		}
		System.out.println();
		System.out.println(k);

	}

}
