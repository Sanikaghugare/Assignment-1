/*Write a program to calculate the sum of first 10 natural number.
Output:
The sum of first 10 natural number  is : 55
*/

public class SumNumbers
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(int i=1; i<=10; i++)
        {
            sum += i;
        }
        System.out.println(" The sum of first 10 natural number  is : " + sum);
    }
}