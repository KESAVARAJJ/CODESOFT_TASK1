package codesoft_programs;
import java.util.Random;
import java.util.Scanner;

public class Guess_number
{
     public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int MAX_ATTEMPTS = 10;
	        int totalScore = 0;

 // Range is now directly specified here (1 to 100)	   
 do{
	 int targetNumber = random.nextInt(100) + 1; 
	 int attempts = 0;
	 boolean guessedCorrectly = false;
	 System.out.println("Guess the number between 1 to 100");
	     
while (attempts < MAX_ATTEMPTS && !guessedCorrectly) 
   {
	   System.out.print("Your guess: ");
       int guess = scanner.nextInt();
       attempts++;
       if (guess == targetNumber)
       {
         guessedCorrectly = true;
         System.out.println("Correct! You guessed in " + attempts + " attempts.");
         totalScore += MAX_ATTEMPTS - attempts + 1;
	    }
	    else
	     {
	      System.out.println(guess < targetNumber ? "Too low!" : "Too high!");
	      }
	 }

if (!guessedCorrectly)
	    {
	        System.out.println("Out of attempts! The number was " + targetNumber);
	     }

	     System.out.print("Play again? (yes/no): ");
	   } 
 while (scanner.next().equalsIgnoreCase("yes"));
 System.out.println("Total score: " + totalScore);
 System.out.println("Thank you for playing!");
 scanner.close();
	    }
}
