/*Write a program in JAVA to convert temperature in Celsius to Fahrenheit.   
Sample Output:
Convert temperature in Celsius to Fahrenheit :
---------------------------------------------------
Input the temperature in Celsius : 35
The temperature in Celsius : 35
The temperature in Fahrenheit : 95
 */
 
 import java.util.Scanner;
public class CelsiusToFahrenheit
 {  
   public static void main (String args[])  
    { 
      System.out.println("Convert temperature in celsius to Fahrenheit");
         System.out.println("-----------------------------------------------");
         float Fahrenheit, Celsius;  
          Scanner sc=new Scanner(System.in);
          System.out.print("Input the temperature in celsius :");
          Celsius = sc.nextInt();
          Fahrenheit =((Celsius*9)/5)+32;
          System.out.println("The temperature in celsius  : " +Celsius);
          System.out.println("The temperature in Fahrenheit is: "+Fahrenheit);  
    }
 }