package Com.PatternPrograms;

import java.util.Scanner;

public class Triangle_0and1_Pattern {
	public static void Pattern(int n) {
		int i, j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print(1 + " ");
				}
				else {
					System.out.print(0 + " ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String ... args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		Pattern(n);
	}

}

//input= 5
//output   
//  1 
//  0 1 
//  1 0 1 
//  0 1 0 1 
//  1 0 1 0 1 
