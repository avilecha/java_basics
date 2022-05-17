import java.util.Map.Entry;
import java.util.HashMap;

public class hashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 10);
		hashMap.put("B", 20);
		hashMap.put("C", 30);
		hashMap.put("D", 30);
		hashMap.replace("D", 30, 40);
		
		System.out.println("Size is: "+hashMap.size());
		System.out.println(hashMap);
		
		if(hashMap.containsKey("A")) {
			Integer a = hashMap.get("A");
			System.out.println("Value for Key A is: "+a);	
		}
		
		for (String key: hashMap.keySet()) {
			System.out.println("Key is: "+key+" & Value for given key is: "+hashMap.get(key));
		}
		
		for (Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("Key is: "+entry.getKey()+" Value is: "+entry.getValue());
		}
	}

}
