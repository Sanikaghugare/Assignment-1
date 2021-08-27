/*Write a program in JAVA to convert temperature in Fahrenheit to Celsius.   
Sample Output:
Convert temperature in Fahrenheit to Celsius :
---------------------------------------------------
Input the temperature in Fahrenheit : 95
The temperature in Fahrenheit : 95
The temperature in Celsius : 35
 */
 
import java.util.Scanner;
public class FahrenheitToCelsius 
{
    public static void main(String[] args) 
    {
        System.out.println("Convert temperature in Fahrenheit to Celsius :");
        System.out.println("----------------------------------------");
        double celsius, fahrenheit;
        Scanner s = new Scanner(System.in);
        System.out.print("Input the temperature in Fahrenheit:");
        fahrenheit = s.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        System.out.println("The temperature in Fahrenheit :"+fahrenheit );            
        System.out.println("The temperature in Celsius:"+celsius);        
    }
}