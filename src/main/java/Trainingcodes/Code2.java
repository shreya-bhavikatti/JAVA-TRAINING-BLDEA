package Trainingcodes;

import java.util.Scanner;

public class Code2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 ||  j==0 || j==(n-1) ||
						i==(n/2))
					System.out.print("* ");

				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}



	


