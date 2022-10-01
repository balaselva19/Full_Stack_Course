package JavaOpenLabBookAssignment;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the single character: ");
		char c =  sc.next().charAt(0);
		if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u' ) {
			System.out.println(c +" is vowel");
		} else {
			System.out.println(c +" is consonant");
		}
	}
}
/*
OUTPUT: 
	Enter the single character: w
	w is consonant
*/