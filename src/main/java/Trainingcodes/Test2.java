package Trainingcodes;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the age");
		int age= sc.nextInt();
		if(age<18)
		{
			System.out.println("you r still a minor");
		}
		else if(age>65) {
			System.out.println("u r asenior citizen");
		}
		else {
			System.out.println("congratulations u r eligible ");
		}
		}
		}


	
