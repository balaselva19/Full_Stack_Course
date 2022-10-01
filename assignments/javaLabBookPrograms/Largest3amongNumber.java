package JavaOpenLabBookAssignment;
public class Largest3amongNumber {
	public static void main(String[] args) {
		int a = 12,b = 34, c= 45;
		if(a >= b && a >= c) {
			System.out.println(a+" is largest number");
		} else if (b >= a && b >= c){
			System.out.println(c+" is largest number");
		} else {
			System.out.println(c+" is largest number");
		}
	}
}
/*
OUTPUT: 
	45 is largest number
*/