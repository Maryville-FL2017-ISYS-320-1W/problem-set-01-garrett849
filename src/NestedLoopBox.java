/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 4. Your pseudocode algorithm here
     Create a loop that will produce 6 lines.
     Create a nested loop to produce 6 stars. 
     print *
     println
     End

*/
public class NestedLoopBox {

	public static void main(String[] args) {
		for (int line = 1; line <= 6; line++) {
			for (int star = 1; star <= 6; star++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
