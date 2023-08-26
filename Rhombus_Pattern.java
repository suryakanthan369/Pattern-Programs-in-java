package Com.PatternPrograms;

import java.util.Scanner;

public class Rhombus_Pattern {
	 public static void Pattern(int n)
	    {
	        int i, j;
	        int num = 1;
	      
	        for (i = 1; i <= n; i++) {
	          
	            for (j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	  
	           
	            for (j = 1; j <= n; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	  
	    
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        Pattern(n);
	    }
}

//input = 5
//output
//
//     *****
//    *****
//  *****
// *****
//*****
