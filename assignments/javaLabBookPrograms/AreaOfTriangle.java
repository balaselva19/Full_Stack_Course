package JavaOpenLabBookAssignment;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base of square: ");
		double base = sc.nextDouble();
		System.out.print("Enter the height of square: ");
		double height = sc.nextDouble();
		double result = (base * height) / 2;
		System.out.println("area of square is: "+result);
	}
}
/*
OUTPUT: 
Enter the base of square: 5
Enter the height of square: 5
area of square is: 12.5
*/