/*Write a program in JAVA to convert temperature in Kelvin to Celsius.   
Sample Output:
Convert temperature in Kelvin to Celsius :
------------------------------------------------
Input the temperature in Kelvin : 300
The temperature in Kelvin : 300
The temperature in Celsius : 26.85
*/

import java.util.Scanner;
public class KelvinToCelsius
{
    public static void main(String[] args) 
    {
        System.out.println("Convert temperature in Kelvin to Celsius :");
        System.out.println("----------------------------------------");
        double celsius, kelvin;
        Scanner s = new Scanner(System.in);
        System.out.print("Input the temperature in Kelvin:");
        kelvin = s.nextDouble();
        celsius= kelvin-273.15;
        System.out.println("The temperature in Kelvin:"+kelvin);            
        System.out.println("The temperature in Celsius:"+celsius);        
    }
}