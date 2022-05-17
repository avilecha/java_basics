
public class NestedIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 50;
		if (i == 50) {
			System.out.println("i == 50");
			if (i < 75) {
				System.out.println("i < 75");
				if (i < 55 ){
					System.out.println("i < 55");
				}
			}
		}

	}

}
