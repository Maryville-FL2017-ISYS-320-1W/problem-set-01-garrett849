/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*

1. Fill out the table for the loop below

| ITERATION 		 | VARIABLE NAME	 | VARIABLE NAME	 | VARIABLE NAME	 |
| initialization	 |     MAX			 |     count	     |		number		 | 
| 1				     |		4            |		 4           |		 7		     |
| 2                  |      4            |       3           |      12           |
| 3                  |      4            |       2           |      15           |
| 4                  |      4            |       1           |      16           |

*/

public class FollowTheLoop {

	   public static final int MAX = 4;
	   public static void loopDeDoop() {
	      int number = 0;
	      for( int count = MAX; count >= 1; count-- ) {
	         int product = count * 2 - 1;
	         number = number + product;
	         System.out.printf("%d\t%d\t%d\n",MAX,count,number);
	      }
	      System.out.println("The result is: " + number);
	   }

	   public static void main( String[] args ) {
		   loopDeDoop();
	   }

}
