
public class DiceArray 
{
	public static void main(String[] args) 
	{
		Dice dice1= new Dice();
		Dice dice2= new Dice();
		
		int[] rolls= new int[11];
		
		for (int i=0; i<1000; i++)
			rolls[(dice1.roll()+dice2.roll())-2]++;
		 
		for (int i=0;i<11; i++)
			System.out.println((i+2)+" was rolled: "+ rolls[i]+ " times");
	}
}
