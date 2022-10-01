package JavaOpenLabBookAssignment;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		if(num % 2 == 0){
			System.out.println(num+" is Even");
		} else {
			System.out.println(num+" is odd");
		}
		/*(ternary operator) 
			String result = (num%2 == 0) ? (num+" is Even") : (num+" is Odd");	
			System.out.println(result);
		*/
	}
}
/*
OUTPUT: 
	Enter the number: 26
	26 is Even
*/
