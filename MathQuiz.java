import java.util.Scanner; 


public class MathQuiz2 {
     public static void main(String[] args) { 
      Scanner input = new Scanner(System.in); 
      
      // Prompt the user for the number of math equations they would like to solve 
      System.out.print("How many math equations would you like to solve? "); 
      int numEquations = input.nextInt(); 
      
      // Validate that the number of math equations entered by the user is 0 or greater 
      while (numEquations < 0) { 
         System.out.print("Please enter a positive number of equations: "); 
         numEquations = input.nextInt(); 
      } 
      
      // Initialize the tally for correct answers 
      int correctAnswers = 0; 
      
      // Use a loop to generate the number of math equations that the user specified 
      for (int i = 1; i <= numEquations; i++) { 
         // Generate 2 random numbers from 1-50 for each equation 
         int num1 = (int)(Math.random() * 50 + 1); 
         int num2 = (int)(Math.random() * 50 + 1); 
         
         // Display an equation that adds the 2 random numbers together and prompt the user for an answer 
         System.out.print("What is " + num1 + " + " + num2 + "? "); 
         int answer = input.nextInt(); 
         
         // Use conditionals to determine if the user is correct or incorrect 
         if (answer == num1 + num2) { 
            System.out.println("Correct!"); 
            correctAnswers++; 
         } 
         else { 
            System.out.println("Incorrect."); 
         } 
      } 
      
      // Display how many questions were answered correctly out of how many questions were given 
      System.out.println("You answered " + correctAnswers + " out of " + numEquations + " questions correctly."); 
      
      // Calculate the percentage of questions that the user entered correctly 
      double percentage = (double)correctAnswers / (double)numEquations * 100; 
      System.out.println("You answered " + percentage + "% of the questions correctly."); 
      
      // Determine a message to display that will tell the user if they passed or failed 
      if (percentage >= 70) { 
         System.out.println("You passed!"); 
      } 
      else { 
         System.out.println("You failed. Please try again."); 
      } 
   } 
}
