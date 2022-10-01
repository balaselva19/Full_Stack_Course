package JavaOpenLabBookAssignment;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = sc.nextDouble();
		double area = Math.PI * (radius * radius);
		System.out.println("The area of circle: "+area);
		double circumference = Math.PI * 2 * radius;
		System.out.println("The circumference of circle: "+circumference);
	}
}
/*
OUTPUT: 
Enter the radius: 2
The area of circle: 12.566370614359172
The circumference of circle: 12.566370614359172
*/