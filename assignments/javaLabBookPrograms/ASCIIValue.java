package JavaOpenLabBookAssignment;

public class ASCIIValue {

	public static void main(String[] args) {
		char c = 'a';
		int a = c;
		int b = (int)a;
		System.out.println("The ascii value of "+c+" is: "+a);
		System.out.println("The ascii value of "+c+" is: "+b);

	}

}
/*
OUTPUT: 
	The ascii value of a is: 97
	The ascii value of a is: 97
*/