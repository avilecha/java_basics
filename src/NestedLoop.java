
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {
				{2, 3, 4},
				{5, 6, 7},
				{8, 9, 10}
		};
		System.out.println(arr[1].length);
		for (int i = 0; i<arr.length; i++) {
//		for (int i = 0; i<3; i++) {	
//			for (int j = 0; j<arr[j].length; j++) {
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
