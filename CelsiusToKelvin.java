/*Write a program in JAVA to convert temperature in Celsius to Kelvin.   
Sample Output:
Convert temperature in Celsius to Kelvin :
---------------------------------------------------
Input the temperature in Celsius : 26.85
The temperature in Celsius : 26.85
The temperature in Kelvin : 300
 */
 
import java.util.Scanner;
public class CelsiusToKelvin
 {  
   public static void main (String args[])  
    { 
        System.out.println("Convert temperature in celsius to Kelvin :");
         System.out.println("-----------------------------------------------");
         double Kelvin, Celsius;  
         Scanner sc=new Scanner(System.in);
          System.out.print("Input the temperature in celsius :");
          Celsius = sc.nextInt();
          Kelvin= Celsius + 273.15;
          System.out.println("The temperature in celsius  : " +Celsius);
          System.out.println("The temperature in  Kelvin : "+ Kelvin);  
    }}