
public class ArithmeticOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 1 + 2;
		System.out.println("Result value is: "+result);
		
		int org_result = result;
		result = result - 1;
		System.out.println("Orig. Result value is: "+org_result);
		System.out.println("Subtracted result now is: "+result);
		
		org_result = result;
		result = result+2;
		System.out.println("Updated Org Result value is: "+org_result);
		System.out.println("Addition: "+result);
	}

}
