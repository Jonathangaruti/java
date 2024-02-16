package loops;

public class testeBidimensional {

	public static void main(String[] args) {
		
		int [] [] quadr = {{2, 4, 6, 8, 10,}, {1, 3, 5, 7, 9}};
		
		for (int i = 0; i < quadr.length; i++) {
			
			for(int j = 0; j < quadr[i].length; j++) {
				System.out.println(quadr[i][j]);
			}
		}
		

	}

}
