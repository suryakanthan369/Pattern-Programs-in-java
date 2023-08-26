package Com.PatternPrograms;
import java.util.Scanner;

public class Hollow_Triangle_Pattern {
	 public static void Pattern(int n)
	    {
	        int i, j, k;
	  
	       
	        for (i = 1; i <= n; i++) {
	            
	  
	            for (j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            
	            for (k = 1; k <= (2 * i - 1); k++) {
	               
	                if (k == 1 || i == n || k == (2 * i - 1)) {
	                    System.out.print("*");
	                }
	                
	                else {
	                    System.out.print(" ");
	                }
	            }
	  
	            System.out.println("");
	        }
	    }
	  
	 
	    public static void main(String ... args)
	    {
	    	Scanner sc = new Scanner (System.in);
	    	int n =sc.nextInt();
	        Pattern(n);
	    }

}
