package example28;
import java.util.Scanner;
/*   
    Author: Chan In Kou
    Purpose: The Display will show social security validation
*/
public class Example28
{ 
    public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner in = new Scanner(System.in);
		
		//A social security number has the form DDD-DD-DDDD where D is a digit
        String correct = "[0-9]{3}-[0-9]{2}-[0-9]{4}";
		
		//Enter the correct security number
		System.out.print("Enter a social security number: ");
		String socialNumber = in.nextLine();
		
		//display whether or not a given social security number is valid or not
		if (socialNumber.matches(correct))
	    {
			System.out.print(socialNumber + " is a valid number.");
		}
		else
		{
			System.out.print(socialNumber + " is not a valid number.");
		}

	} 
}