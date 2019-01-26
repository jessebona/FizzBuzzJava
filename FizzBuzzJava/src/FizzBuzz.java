//A Java implementation of the fizzbuzz interview question
/* Counts from 1 to 100 and outputs fizz if the number is divisible by 3, buzz if the number is divisible by 5,
 * fizzbuzz if the number is divisible by 3 and 5 or the number itself if it is divisible by neither 3 or 5.
 */
public class FizzBuzz 
{
	public static void main(String args[])
	{
		String fizz = "fizz";
		String buzz = "buzz";
		
		for(int i = 1; i <= 100; i++)
		{
			if(i % 3 == 0 && i % 5 == 0)
			{
				System.out.println(fizz + buzz);
			}
			else if(i % 3 == 0)
			{
				System.out.println(fizz);
			}
			else if(i % 5 == 0)
			{
				System.out.println(buzz);
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}
