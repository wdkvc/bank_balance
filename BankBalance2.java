// Chapter 6 Example (Page 291)

import java.util.Scanner;

public class BankBalance2 
{
	public static void main(String[] args) 
	{
		 // Variables and constants
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);

		// Input phase
		System.out.print("Please enter your starting bank balance >> ");
		balance = keyboard.nextDouble();
		

		// Processing and output phases 
		do
		{
           balance = balance + (balance * INT_RATE);
           double roundBal = (double) Math.round(balance * 100d) / 100d;

           System.out.println("After year " + year + " at " + INT_RATE + " interest rate, your balance is $" + roundBal);
           year = year + 1;   
           System.out.println("Do you want to see the balance at the end of another year?");
		   System.out.print("Enter 1 for YES or any other number for NO >> ");
		   response = keyboard.nextInt();

		} while(response == 1); // End of DO...WHILE loop

		System.out.println("\nExiting program, have a great day!");

	}// End of main()

}// end of class