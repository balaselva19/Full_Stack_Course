package JavaOpenLabBookAssignment;

public class NestedSwitchCase {

	public static void main(String[] args) {
		int a = 2,b = 1;
		switch(a){
		case 1: {
			System.out.println("first case: 1");
		}
		case 2: {
			switch(b) {
				case 1: 
					System.out.println("case 2 switch case 1");
					break;
				case 2: 
					System.out.println("case 2 switch case 2");
					break;
			}
		}
		}
	}
}
/*
OUTPUT: 
case 2 switch case 1
*/
