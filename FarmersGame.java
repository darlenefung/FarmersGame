/** 
 * Farmers Game, in which the player has to bring cabbage, wolf, sheep, and 
 * human to the other side of the river, given some restrictions.  
 * @author Darlene Fung 
 */ 

public class FarmersGame
{	
	// global scope 
	public static boolean cabb; 
	public static boolean wolf;
	public static boolean sheep; 
	public static boolean human; 
	
	public static void main(String[] args)
	{
		welcome(); 	
		displayGameStatus();	
	}
	
	/** 
	* 
	*/
	public static void welcome()
	{
		System.out.println("Farmer's Game"); 
		System.out.println("Your goal is to bring the cabbage, wolf, sheep, and human safely to the other side of the river. You have one boat, that can only be operated by the human. The sheep and cabbage cannot be on the same bank because the sheep will eat the cabbage, and the wolf cannot be on the same bank as the sheep because the wolf will eat the sheep.");
		System.out.print("Good luck!");
	}
	
	/** 
	 * 
	 */
	 public static void displayGameStatus()
	 {
	 	String bank0 = "   ";
	 	String bank1 = "   ";
	 	
	 	// do the same for the other 3 variables 
	 	if (!cabb) 
	 		bank0 += "cabbage    "; 
	 	else
	 		bank1 += "cabbage    ";  
	 		
	 	if (!wolf) 
	 		bank0 += "wolf    "; 
	 	else
	 		bank1 += "wolf    ";
	 		
	 	if (!sheep) 
	 		bank0 += "sheep    "; 
	 	else
	 		bank1 += "sheep    ";
	 		
	 	if (!human) 
	 		bank0 += "human    "; 
	 	else
	 		bank1 += "human    ";	 		
	 		
	 	System.out.println(bank0);
	 	System.out.println("----------------------------------------"); 
	 	System.out.println("\n \n"); 
	 	System.out.println("----------------------------------------"); 
	 	System.out.println(bank1);

	 }
	 
	 public static void userInput()
	 {
	 	Scanner kb = new Scanner(System.in); // getting information from keyboard
		System.out.print("Which object would you like to move?");

	 }

}