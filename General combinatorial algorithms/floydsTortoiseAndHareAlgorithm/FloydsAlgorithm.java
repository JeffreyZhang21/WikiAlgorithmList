package floydsTortoiseAndHareAlgorithm;

/**
 * https://en.wikipedia.org/wiki/Cycle_detection
 * @author Jeffr
 *
 */
public class FloydsAlgorithm 
{

	public static void main(String[] args)
	{
		
		//this list acts like a looped linked list. It works because the position at 0 contains 1 
		//so this means the node at position 0 points to the value at 1.
		int[] list = new int[] { 1,  2,  3,  4,  5,  6,  7,  8, 9, 10, 11, 12, 13, 14, 15, 9};
		                      
		System.out.println(Floyd(0,list));
		//mu tells you how many nodes you need to travel until you reach the start of the cycle
		//lam tells you how many nodes are inside the cycle

	}
	
	public static String Floyd(int startPos, int[] list)
	{
		//looping cycle
		int turtle = list[startPos];
		int hare = list[list[startPos]];
		while(turtle != hare)
		{
			turtle = list[turtle];
			hare = list[list[hare]];
		}
		
		//determining mu
		int mu = 0;
		turtle = startPos;
		
		while(turtle != hare)
		{
			turtle = list[turtle];
			hare = list[hare];
			mu++;
		}
		
		//determining lam
		int lam = 1;
		hare = list[turtle];
		while(turtle != hare)
		{
			hare = list[hare];
			lam++;
		}
		
		return "Lam: " + lam + " Mu: " + mu;
	}
}
