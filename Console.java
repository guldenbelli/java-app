package assessment2;

import java.util.Scanner;
/**
*Develop console class for scanner input
*Input for String, Integer, Double and Char
*/
public class Console 
{
    public static Scanner console = new Scanner(System.in);
    
    public static String askString(String aPrompt) // method for string input
    {
		System.out.print(aPrompt);  // aPrompt is a request for string input
		String reply = console.nextLine(); // input held in a variable called reply
		return reply;
    }
    public static int askInt(String aPrompt)  // method for integer input
    {
		String reply = askString(aPrompt);
		return Integer.parseInt(reply); // parseInt converts string to integer
    }
    public static double askDouble(String aPrompt)  // method for double input
    {
		String reply = askString(aPrompt);
		return Double.parseDouble(reply);  // parseDouble converts string to double
    }
    public static char askChar(String aChar)  // method for one character input
    {
  	  String reply = askString(aChar);
     // Take first character of string and convert to Uppercase
	  return Character.toUpperCase(reply.trim().charAt(0));
     }
	public static char askOption(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}