/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*

1. Fill out the table for the loop below

| ITERATION 		 | VARIABLE NAME	 | VARIABLE NAME	 | VARIABLE NAME	 |
| initialization	 | MAX			     | count			 |		number		 | 
| 1					 |		5		     |			5	     |		26		     |
| 2                  |      6            |          6        |      38           |
| 3                  |      6            |          6        |      39           |
| 10                 |      6            |          6        |      46           |

*/

public class FollowTheLoop {

	   public static final int MAX = 6;
	   public static void loopDeDoop() {
	      int number = 10;
	      for( int count = MAX; count >= 1; count-- ) {
	         int product = count * 2 - 1;
	         number = number + product;
	      }
	      System.out.println("The result is: " + number);
	   }

	   public static void main( String[] args ) {
		   loopDeDoop();
	   }

}
