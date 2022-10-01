package JavaOpenLabBookAssignment;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side of square: ");
		double side = sc.nextDouble();
		double result = side * side;
		System.out.println("area of square is: "+result);
	}
}
/*
OUTPUT: 
Enter the side of square: 4
area of square is: 16.0
*/