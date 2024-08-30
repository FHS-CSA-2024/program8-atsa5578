//import stuff here
import java.util.Scanner;
//Your code here
public class Program8 {
    public static void main(String[] args){
        //ints!
        int int1 = 0;
        int int2 = 0;
        //scanner
        Scanner operations = new Scanner (System.in);
        //userInput
        System.out.println("Enter an integer: ");
        int1 = operations.nextInt();
        System.out.println("Enter another integer: ");
        int2 = operations.nextInt();
        //formulas
        int sum = int1+int2;
        int difference = int1-int2;
        int product = int1 * int2;
        double average = (double) (int1 + int2)/2.0;
        int distance = Math.abs(int1-int2);
        double maximum = (distance + int1 + int2)/2.0;
        double minimum = (-(distance)+int1+int2)/2.0;
        //print
        System.out.println("Original numbers are " + int1 + " and " + int2);
        System.out.println("The sum of your two integers is: " + sum);
        System.out.println("The difference of your two integers is: " + difference);
        System.out.println("The product of your two integers is: " + product);
        System.out.println("The average of your two integers is: " + average);
        System.out.println("The distance between the two numbers is: " + distance);
        System.out.println("The maximum of the two numbers is: " + maximum);
        System.out.println("The minimum of the two numbers is: " + minimum);
    }
}
//Paste console output below:
/*
Enter an integer: 
13
Enter another integer: 
20
Original numbers are 13 and 20
The sum of your two integers is: 33
The difference of your two integers is: -7
The product of your two integers is: 260
The average of your two integers is: 16.5
The distance between the two numbers is: 7
The maximum of the two numbers is: 20.0
The minimum of the two numbers is: 13.0

*/
