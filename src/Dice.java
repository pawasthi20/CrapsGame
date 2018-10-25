/**
 * 
 * @author Parth Awasthi
 *
 */
public class Dice 
{
	//Instance Variables
	private int numRolls;
	//Constructors
	public Dice()
	{
		numRolls = 0;
	}
	public int roll()
	{
		numRolls++;
		return numRolls = ((int)(Math.random()*6)+1);		
	}
	//Methods
	public void reset()
	{
		numRolls = 0;
	}
	public int getCount()
	{
		return numRolls;
	}
}