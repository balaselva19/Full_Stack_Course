#include <stdio.h>
int main()
{
 int testInteger = 5;
 printf("Number = %d", testInteger);
 return 0;
}
#include <stdio.h>
int main()
{
 float number1 = 13.5;
 double number2 = 12.4;
 printf("number1 = %f\n", number1);
 printf("number2 = %lf", number2);
 return 0;
}
#include <stdio.h>
int main()
{
 char chr = 'a';
 printf("character = %c", chr);
 return 0;
}

#include <stdio.h>
int main()
{
 int testInteger;
 printf("Enter an integer: ");
 scanf("%d", &testInteger);
 printf("Number = %d",testInteger);
 return 0;
} 


#include <stdio.h>
int main() {
 float num1;
 double num2;
 printf("Enter a number: ");
 scanf("%f", &num1);
 printf("Enter another number: ");
 scanf("%lf", &num2);
 printf("num1 = %f\n", num1);
 printf("num2 = %lf", num2);
 return 0;
} 
Character I/O
#include <stdio.h>
int main()
{
 char chr;
 printf("Enter a character: ");
 scanf("%c",&chr);
 printf("You entered %c.", chr);
 return 0;
}
ASCII I/O
#include <stdio.h>
int main()
{
 char chr;
 printf("Enter a character: ");
 scanf("%c", &chr);
 // When %c is used, a character is displayed
 printf("You entered %c.\n",chr);
 // When %d is used, ASCII value is displayed
 printf("ASCII value is %d.", chr);
 return 0;
}