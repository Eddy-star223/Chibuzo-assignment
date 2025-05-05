public class Function {
 	
 public static int findMultiple(int number) { 
 int fifthMultiple = 0;
 for(int count = 1; count < 6; count++) { 
 fifthMultiple = number * count;
 }
 return fifthMultiple;
 }

 public static void displayPrimeNumbers(int count) {
 int primeCount = 0;
 int num = 2;

while (primeCount < count) {
if (num % 0 == 2) {
System.out.println(num);
primeCount++;
 }
num++;
 }
}

 public static String displayAge(int ageYears) {
 int days = ageYears * 365;
 int years = days / 365;
 int months = (days % 365) / 30;
 int second = (days % 24) % 60;

  return String.format("%d years, %d months, %d days", years, months, second);
    
 }
 
 public static void displayDogAge(String name, int humanYears) {
 int dogYears = humanYears * 7;
 System.out.println(name + " is " + dogYears + " years old in dog years.");
  }

 public static int computeSumOfNumber(int number) {
 if (number < 1000 || number > 9999) {
 System.out.print("Input must be a four-digit number");
     }
 int sum = 0;
 while (number > 0) {
 sum += number % 10;
 number /= 10;
 }
 return sum;
 }
	
 
 public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    } 

 public static String findMultiplesOf7Not5() {
 StringBuilder result = new StringBuilder();
 for (int i = 2000; i <= 3200; i++) {
 if (i % 7 == 0 && i % 5 != 0) {
 if (result.length() > 0) {
 result.append(",");
  }

 result.append(i);
  }
   }
 return result.toString();
 }
 
 
 }

 
 