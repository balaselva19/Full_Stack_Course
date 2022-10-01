package JavaOpenLabBookAssignment;
import java.util.Scanner;
public class whileloop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number(below 10): ");
		int a = sc.nextInt();
		int sum = 0;
		while(a <= 10) {
			sum = sum + a;
			a++;
		}
		System.out.println("The result is: "+sum);
	}
}
/*
Enter the number(below 10): 1
The result is: 55
*/