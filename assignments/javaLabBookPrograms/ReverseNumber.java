package JavaOpenLabBookAssignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int a = 0;
		while(num != 0){
			a = a * 10;
			a = a + num % 10;
			num = num / 10;
		}
		System.out.println("The reverse number is: "+a);
	}
}
/*
Enter the number: 1235
The reverse number is: 5321
*/
