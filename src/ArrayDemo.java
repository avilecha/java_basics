
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrInt;
		
		arrInt = new int[5];
		
		arrInt[0]=100;
		arrInt[1]=200;
		arrInt[2]=300;
		arrInt[3]=400;
		arrInt[4]=500;
		
		System.out.println(arrInt);
		System.out.println(arrInt[1]);
		System.out.println(arrInt.length);

		
		
		String[] arrString;
		
		arrString = new String[5];
		
		arrString[0]="This is Amit";
		arrString[1]="This is Aman";
		arrString[2]="This is Tanvi";
		arrString[3]="This is Raynell";
		arrString[4]="This is our family";
		
		System.out.println(arrString);
		System.out.println(arrString[4]);
		System.out.println(arrString.length);

	}

}
