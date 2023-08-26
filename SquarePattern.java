// Java Program to print pattern
// Square hollow pattern
package Com.PatternPrograms;
import java.util.*;

public class SquarePattern {
	public static void printPattern(int n)
	{
		int i, j;
	
		for (i = 0; i < n; i++) {
			
			for (j = 0; j < n; j++) {
				
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}


	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern(n);
	}
}

//input = 5
//output

//*****
//*   *
//*   *
//*   *
//*****

