package JavaOpenLabBookAssignment;
import java.util.Scanner;
public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of rectangle: ");
		double length = sc.nextDouble();
		System.out.print("Enter the width of rectangle: ");
		double width = sc.nextDouble();
		double result = length * width;
		System.out.println("area of rectangle is: "+result);
	}
}
/*
OUTPUT: 
Enter the length of rectangle: 12
Enter the width of rectangle: 2
area of rectangle is: 24.0
*/
