/*Write a program in JAVA to swap two numbers.   
Sample Output:
Swap two numbers :
-----------------------
Input 1st number : 25
Input 2nd number : 39
After swapping the 1st number is : 39
After swapping the 2nd number is : 25
 */
 
import java.util.*;  
class Swap {  
    public static void main(String[] args) {  
      System.out.println("Swap two numbers:");  
       System.out.println("--------------------------");
       int num1,num2,num3;  
       Scanner sc = new Scanner(System.in);  
       System.out.print("Input 1st number:");
       num1 = sc.nextInt();  
       System.out.print("Input 2nd number:");
       num2 = sc.nextInt();         
       num3= num1;  
       num1 = num2;
       num2 = num3;
       System.out.println("After swapping the 1st number is :"+ num1);  
        System.out.println("After swapping the 2nd number is :"+ num2);      
    }    
}