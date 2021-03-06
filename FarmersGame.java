// import Scanner class
import java.util.Scanner;

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
	public static boolean win;
	
	public static void main(String[] args)
	{
		welcome(); 	
		displayGameStatus();
		while (win == false)
			{
			userInput();
			displayGameStatus();
			checkWin();
			}
		if (win == true)
			System.out.println("You won! You got all the objects safely to the other side!");
	}	
	
	/** 
	* prints out welcome message to let user know how game works
	*/
	public static void welcome()
	{
		System.out.println("FARMER'S GAME"); 
		System.out.println("Your goal is to bring the cabbage, wolf, sheep, and human safely to the other side of the river. You have one boat, and it can only be operated by the human. The sheep and cabbage cannot be on the same bank because the sheep will eat the cabbage, and the wolf cannot be on the same bank as the sheep because the wolf will eat the sheep.");
		System.out.println("~~~~~~~~~~~~~~ GOOD LUCK! ~~~~~~~~~~~~~~");
		System.out.println();
	}
	
	/** 
	 * controls the image displayed on the screen showing which objects are on what side of the river
	 * @param global variables cabb, wolf, sheep, human
	 * @return none
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
	 	System.out.println("~~  ~     ~   ~  ~~   ~   ~ ~  ~   ~ ~ ");
	 	System.out.println("  ~   ~    ~   ~   ~ ~     ~   ~   ~ ~ ");
	 	System.out.println("~   ~   ~  ~    ~ ~~ ~  ~  ~   ~  ~ ~ ");
	 	System.out.println("----------------------------------------"); 
	 	System.out.println(bank1);

	 }
	 /**
	  * this method takes user input, and moves objects accordingly 
	  * @param global variables cabb, wolf, sheep, human
	  */ 
	 public static void userInput()
	 {
	 	Scanner kb = new Scanner(System.in); // getting information from keyboard
		System.out.print("Which object would you like to move? ");
		String object = kb.nextLine();
		if (!(object.equals("cabbage") || object.equals("wolf") || object.equals("sheep") || object.equals("human")))
		{
			System.out.println("What you entered was invalid, please enter 'cabbage', 'wolf', 'sheep', or 'human'");
			userInput();
		}
		if (object.equals("cabbage") && human == cabb)
			{
			cabb = !cabb;
			human = !human;
			}
		else if (object.equals("wolf") && human == wolf)
			{
			wolf = !wolf;
			human = !human;
			}
		else if (object.equals("sheep") && human == sheep)
			{
			sheep = !sheep;
			human = !human;
			}
		else if (object.equals("human"))
			{
			human = !human;
			}	
			
		else
			System.out.println("~~~The object cannot move without the human operating the boat. Please move the human first. ~~~ ");

	}
			
	 /** 
	  * this method checks for wins/losses based on what objects are on what bank
	  * @param global variables cabb, wolf, sheep, human
	  */
	 public static void checkWin()
	 {
	 if ((cabb == true && sheep == true && human == false)||(cabb == false && sheep == false && human == true))
	 	{
	 	System.out.println("You lost! The sheep ate the cabbage!");
	 	System.exit(0);
	 	}
	 	
	 else if ((sheep == true && wolf == true && human == false)||(sheep == false && wolf == false && human == true))
	 	{
	 	System.out.println("You lost! The wolf ate the sheep!");
	 	System.exit(0);
	 	}
	 
	 else if (cabb == true && sheep == true && wolf == true && human == true)
	 	win = true;
	 else 
	 	win = false;
	 }

}