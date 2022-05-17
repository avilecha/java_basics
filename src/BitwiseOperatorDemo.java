
public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initial value
		int i = 5;
		int k = 7;
		
		//bitwise AND
		// 0101 & 0111 = 0101 = 5
		// compared bit by bit. since this is AND, therefore any clash in bits makes it 0 (FALSE)
		
		System.out.println("i&k ="+(i&k));
		// compared bit by bit. since this is OR, therefore any clash in bits makes it 1 (TRUE)
		
		//bitwise OR
		// 0101 | 0111 = 0111 = 7

		System.out.println("i|k ="+(i|k));


	}

}
