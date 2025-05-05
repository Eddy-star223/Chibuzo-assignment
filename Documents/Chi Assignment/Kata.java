public class Kata {

public static boolean isEven(int number) {

return (number % 2 == 0); 
 

}


public static boolean isPrime(int number) {
Math.sqrt(number); 
return (number % 2 == 0); 

}



public static int subtract(int num1, int num2) {
if(num1 > num2) 
return (num1 - num2);
else return (num2 - num1);

 }



public static float divide(float num1, float num2) {

if (num2 == 0) 
return (0);
else return (num1 / num2);

}


public static int factorOf(int number) {
int counter = 0;
for (int i = 1; i <= number; i++) { 
 if (number % i == 0) {
	counter++;
	}

}
	return counter;

}



public static boolean isSquare(int number) {
int square = (int) Math.sqrt(number);
return square * square == number;

}


public static boolean isPalindrome(int number) {

int e = (number / 10000) % 10;
int d = (number / 1000) % 10;
int c = (number / 100) % 10;
int b = (number / 10) % 10;
int a = number % 10;

return (a == e);

}


public static long factorialOf(long number) {
long factorial = 1;

for (long count = 1; count <= number; count++) {
factorial *= count;

    }
return factorial;
	
}


public static long squareOf(long number) {

return (number * number);
}








}