
public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Define string in reusable manner, str can be called and used anywhere in the program, and it is memory efficient
		String str = "Test";
		System.out.println("String 1 value is: "+str);
		
		//String is defined as new object, and need to be instantiated everytime
		String str1 = new String("Test");
		System.out.println("Another String value is: "+str1);
		
		int arr[];
		arr = new int[3];
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		
		System.out.println(arr); //prints memory hash code for array store location
		System.out.println(arr[1]);

	}

}
