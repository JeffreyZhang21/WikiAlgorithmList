package brentsAlgorithm;

/**
 * https://en.wikipedia.org/wiki/Cycle_detection#Brent's_algorithm
 * @author Jeffr
 *
 */
public class BrentsAlgorithm 
{
	public static void main (String[] args)
	{
		int[] list = new int[] { 1,  2,  3,  4,  5,  6,  7,  8, 9, 10, 11, 12, 13, 14, 15, 9};
		System.out.println(Brent(0,list));
	}
	
	public static String Brent(int startPos, int[] list)
	{
		int power = 1;
		int lam = 1;
		int turtle = startPos;
		int hare = list[startPos];
		while(turtle != hare)
		{
			if(power == lam)
			{
				turtle = hare;
				power *= 2;
				lam = 0;
			}
			hare = list[hare];
			lam += 1;
		}
		
		hare = startPos;
		turtle = startPos;
		
		for(int i=0; i<lam; i++)
		{
			hare = list[hare];
		}
		
	
		
		int mu=0;
		
		while(turtle != hare)
		{
			turtle = list[turtle];
			hare = list[hare];
			mu += 1;
		}

		return "Lam: " + lam + " Mu: " + mu;
	}
}
