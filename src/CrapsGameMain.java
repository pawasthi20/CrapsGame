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
		
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int sum = roll1 + roll2;
		System.out.print("Press enter to roll.");
		in.nextLine();
		System.out.println(sum);
		
		//First Roll
		if (sum == 2 || sum == 12)
		{
			System.out.println("You loose. If you want to play again, press enter.");
			in.nextLine();
		}
		if (sum == 7 || sum == 11)
		{
			System.out.print("You win. If you want to play again, press enter.");
			in.nextLine();
		}
		else 
		{
			System.out.println("You get a point.");
			System.out.print("Press enter to roll.");
			in.nextLine();
			System.out.println(sum);
			int point = sum;
			roll1 = dice1.roll();
			roll2 = dice2.roll();
			sum = roll1 + roll2;
			if(sum == 7)
			{
				System.out.println("You loose. If you want to play again, press enter.");
			}
			if(sum == point)
			{
				System.out.println("You win. If you want to play again, press enter.");
			}
			while(sum != 7 && sum != point) 
			{
				//Roll Again
				System.out.print("Press enter to roll.");
				in.nextLine();
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				sum = roll1 + roll2;
				System.out.println(sum);
			}
		}
	}
}

//How do I get the game to restart?