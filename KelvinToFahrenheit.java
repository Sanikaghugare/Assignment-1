/*Write a program in JAVA to convert temperature in Kelvin to Fahrenheit.   
Sample Output:
Convert temperature in Kelvin to Fahrenheit :
---------------------------------------------------
Input the temperature in Kelvin : 300
The temperature in Kelvin : 300
The temperature in Fahrenheit : 80.33
 */
 
import java.util.Scanner;
public class KelvinToFahrenheit 
 {  
   public static void main (String args[])  
    { 
      System.out.println("Convert temperature in Kelvin to Fahrenheit :");
         System.out.println("-----------------------------------------------");
         double Fahrenheit, Kelvin;  
         Scanner sc=new Scanner(System.in);
          System.out.print("Input the temperature in Kelvin :");
          Kelvin= sc.nextInt();   
          Fahrenheit= (9.0 / 5) * (Kelvin- 273.15) + 32;
          System.out.println("The temperature in Kelvin : " +Kelvin);
          System.out.println("The temperature in Fahrenheit is: "+Fahrenheit);  
    }}