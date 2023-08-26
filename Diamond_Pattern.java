package Com.PatternPrograms;

import java.util.Scanner;

public class Diamond_Pattern {
	 public static void Pattern(int n)
	    {
	        int i, j;
	        int num = 1;
	
	        for (i = 1; i <= n; i++) {
	      
	            for (j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	
	            for (j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	  

	        for (i = n-1; i >= 1; i--) {
	          
	            for (j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	        
	            for (j = 1; j <= 2 * i - 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	  
	    // Driver Function
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        Pattern(n);
	    }

}

//input = 5
//output

//     *
//    ***
//   *****
//  *******
// *********
//  *******
//   *****
//    ***
//     *


