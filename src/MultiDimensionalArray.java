
public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int multi[][][]= {{{1,2,3},{4,5,6},{7,8,9}}, {{10,20,30},{40,50,60}, {70,80,90}}, {{100,200,300},{400,500,600}, {700,800,900}}};
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				for (int k=0; k<3; k++) {
					System.out.print(multi[i][j][k]);
				}
			}
			System.out.println();
		}
//		System.out.println("I'm here");
	}

}
