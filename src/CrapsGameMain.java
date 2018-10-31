/**
 * 
 * @author Parth Awasthi
 *
 */
import java.util.Scanner;
public class CrapsGameMain 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		boolean replay = true;
		
		//Dice Objects
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int roll1;
		int roll2;
		int sum;

		//Replay
		while (replay)
		{
			System.out.print("Welcome to CrapsGame. Press enter to roll.");
			in.nextLine();
			roll1 = dice1.roll();
			roll2 = dice2.roll(); 
			sum = roll1 + roll2;
			System.out.println("You rolled: " + sum);
			
			//First Roll
			if (sum == 2 || sum == 12)
			{
				System.out.println("You loose.");
			}
			if (sum == 7 || sum == 11)
			{
				System.out.println("You win.");
			}
			else
			{
				System.out.println("Your point is: " + sum);
				int point = sum;
				sum = 0;
				while(sum != 7 && sum != point) 				
				{
					//Subsequent Roll
					System.out.print("Press enter to roll again.");
					in.nextLine();
					roll1 = dice1.roll();
					roll2 = dice2.roll();
					sum = roll1 + roll2;
					System.out.println("You rolled: " + sum);
				}
				if(sum == 7)
				{
					System.out.println("You loose.");
				}
				if(sum == point)
				{
					System.out.println("You win.");
				}
			}
			//Prompting Replay
			System.out.println("Do you want to replay? Say yes or no.");
			String i = in.nextLine();
		    if(i.equals("yes")) 
		    {
		        replay = true;
		    }
		    else if(i.equals("no")) 
			{
			    replay = false;
			}			
		}
	}
}