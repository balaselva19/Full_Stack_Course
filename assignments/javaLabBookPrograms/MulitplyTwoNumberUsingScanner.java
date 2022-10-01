package JavaOpenLabBookAssignment;

import java.util.Scanner;

public class MulitplyTwoNumberUsingScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int firstnum = sc.nextInt();
		System.out.print("Enter the second number: ");
		int secondnum = sc.nextInt();
		int result = firstnum * secondnum;
		System.out.println("Mulitply of two number is: "+result);
	}
}
/*
OUTPUT: 
	Enter the first number: 2
	Enter the second number: 2
	Mulitply of two number is: 4
*/