/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/* 6. Your pseudocode algorithm here
	Print a loop that will loop 3 times.
	Print a nested loop under first loop that will produces 0 thru 9.
	Print a nested loop under second loop that produces upper loop 3 times
	Println.
	End

*/

public class NumberString {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <= 9; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(j);
				}

			}
			System.out.println();
		}
	}
}
