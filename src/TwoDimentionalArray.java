
public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int multiarray[][] = {{2,7,9}, {1,4,6}, {12,34,56}};
		
		for (int i=0; i<3; i++) {
			//System.out.println("Values is Initial Loops are: "+multiarray[i][i]);
			for (int k=0; k<3; k++) {
				System.out.print(multiarray[i][k]+" ");
			}
			System.out.println();
		}
		System.out.println(multiarray[0][0]);
	}

}
