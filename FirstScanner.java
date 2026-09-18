import java.utils.Scanner;
    public class FirstScanner{
        public static void main(String[]args){
Scanner input = new Scanner (System.in); 

System.out.print("Enter an integer:");
int number1 = input.nextInt();
System.out.print("Enter an integer:"); 
int number2 = input.nextInt();
int sum = number1 + number2;
System.out.print("Sum is %d%n", sum);

}
}


import java.util.Scanner;
    public class Financials{
        public static void main{
Scanner input = new Scanneer (System.in);
System.out.print("Enter the subtotal and a gratuity rate:");

double sub total = input.nextInt();
double gratuity rate = input.nextInt();
double gratuity = sub total* (gratuity rate/100);
double total = subtotal + gratuity; 

System.out.print("The gratuity is # is"+ gratuity + "and total is # " + total);

}
}







/*(Cost of driving) Write a program that prompts the user to enter the distance to drive,
 the fuel efficiency of the the car in miles per gallon and the price per gallon and displays the cost of the trip.*/

//gallons = distance/miles per gallon
//cost = gallons * price per gallon

import java.util.Scanner;
    public class CostOfDriving{
        public static void main{
Scanner input = new Scanner(System.in);
System.out.print("Enter distance to drive:");
double distanceToDrive = input.nextDouble();
System.out.print("Enter miles per gallon:");
double milesPerGallons = input.nextDouble();
System.out.print(" Enter price per gallon:");
double pricePerGallon input.nextDouble();

gallon = distance/miles per gallon
cost = gallons * price per gallon
System.out.printf("The cost of the trip is % .2f%n ", cost); 

}
}




/*(physics: find runway length) Given an airplane's acceleration(a) and take-off speed(v), you can compute the minimum runway length needed for an airplane to take-off using the following formula:

            Length = v^2/2a
Write a program that prompts the user to enter v in meters/second (m/s) and the acceleration(a) in meters/second squared (m/s^2) and display the minimum runway length.*/



import java.utils.Scanner;
public class RunwayLength{
    public static void main(String[]args){

Scanner input = new Scanner(System.in); 
System.out.print(" Enter speed: ");
System.out.print(" Enter acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();
double length = (speed * speed)/ (2 * acceleration );

System.out.print(" The minimunm runway length for the airplane is %.3f%, length ");


}

}

//write a program that reads a set of integers, and then prints the sum of the even and odd integers. 



import java.utils.Scanner;
public class EvenOddSum{
    public static void main(String[]args){
Scanner input = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;


System.out.print(" Enter a set of integers: ");

        for(int count = 0; count is < number; count ++){
            int number = input.nextInt();

if (number % 2 ==0){
        evenSum += number;

 else {

oddSum += number;

System.out.println("Sum of even integers: " + evenSum);
System.out.println("Sum of even integers: " + oddSum);
    }
}
}
}
}





















