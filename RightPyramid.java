package Com.PatternPrograms;
import java.util.*;
public class RightPyramid {
	public static void pyramidPattern(int n) {
		for(int i=0;i<n;i++) {
			System.out.print(" ");
		
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	}

public static void main(String ... args) {
	Scanner sc = new Scanner (System.in);
	int n =sc.nextInt();
	pyramidPattern(n);
	
}
}

//input = 5
//output
//
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 