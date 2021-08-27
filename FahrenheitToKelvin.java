/*Write a program in JAVA to convert temperature in Fahrenheit to Kelvin.   
Sample Output:
Convert temperature in Fahrenheit to Kelvin :
---------------------------------------------------
Input the temperature in Fahrenheit : 80
The temperature in Fahrenheit : 80
The temperature in Kelvin : 300
 */
 
import java.util.Scanner;
public class FahrenheitToKelvin 
 {  
   public static void main (String args[])  
    { 
      System.out.println("Convert temperature in Fahrenheit to Kelvin :");
         System.out.println("-----------------------------------------------");
          double Kelvin,Fahrenheit;
          Scanner sc=new Scanner(System.in);
          System.out.print("Input the temperature in Fahrenheit :");
          Fahrenheit= sc.nextInt();   
          Kelvin= 273.5 + ((Fahrenheit - 32.0) * (5.0/9.0));
          System.out.println("The temperature in    Fahrenheit : " +Fahrenheit);
          System.out.println("The temperature in Kelvin: "+Kelvin);  
    }}