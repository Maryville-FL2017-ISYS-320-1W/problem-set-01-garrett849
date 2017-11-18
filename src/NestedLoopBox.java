/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 4. Your pseudocode algorithm here
     Write a loop that will produce 6 stars in a line.
     Write another loop that will produce the above loop 6 times on 6 separate lines below. 
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
