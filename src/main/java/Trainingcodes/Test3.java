package Trainingcodes;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("@ ");
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
	}
}


	


