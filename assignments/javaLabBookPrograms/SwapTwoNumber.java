package JavaOpenLabBookAssignment;

public class SwapTwoNumber {

	public static void main(String[] args) {
		float a = 12.1f, b = 23.1f;
		System.out.println("---before swap---");
		System.out.println("First number: "+a);
		System.out.println("second number: "+b);
		float c = a;
		a = b;
		b = c;
		System.out.println("---after swap---");
		System.out.println("First number: "+a);
		System.out.println("second number: "+b);
	}
}
/*
OUTPUT: 
---before swap---
First number: 12.1
second number: 23.1
---after swap---
First number: 23.1
second number: 12.1
*/