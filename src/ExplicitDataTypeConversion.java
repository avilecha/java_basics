
public class ExplicitDataTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double d = 100.10001;
		System.out.println("DOUBLE: "+d);
		
		float f = (float)d;
		System.out.println("FLOAT: "+f);
		
		long l = (long)d;
		System.out.println("LONG: "+l);
		
		int i = (int)d;
		System.out.println("INT: "+i);

	}

}
