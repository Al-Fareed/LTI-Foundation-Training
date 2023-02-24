/*
 * The relationship between Celsius (C) and Fahrenheit (F) degrees for measuring temperature is linear. Find an equation relating C and F if 0 C corresponds to 32 F and 100 C corresponds to 212 F.
Write a program to simulate Celsius to Fahrenheit Converter.


Input Format:


Input consists of a single integer which corresponds to a measure of temperature in Celsius.


Output Format:

The output is an integer indicates the Fahrenheit for the given Celsius.
All floating-point values are displayed correctly to 1 decimal place.
Refer to Sample Input and Output for exact formatting specifications.

 

Sample Input and Output:

[All text in bold corresponds to input and the rest corresponds to output.]


Temperature in Celsius:

12

Temperature in Fahrenheit is 53.6F
 */
import java.util.*;
class CelsiustoFahrenheitConverter {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Temperature in Celsius:");
            float temp = sc.nextFloat();
            float fah =(float) ((temp*1.8) + 32);
            System.out.printf("Temperature in Fahrenheit is %.1fF",fah);
        }
     }
}
