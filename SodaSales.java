package Chapter6Assingmnet.Chapter7Assingment;
import java.util.Scanner;

public class SodaSales {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numSodaTypes;
    do {
      System.out.println("How many types of soda would you like to enter: ");
      numSodaTypes = input.nextInt();
    } while(numSodaTypes < 0);
    String[] sodaNames = new String[numSodaTypes];
    int[] sodaSales = new int[numSodaTypes];
    int totalSales = 0;
    int highestSales = 0;
    int lowestSales = 0;
    String highestName = "";
    String lowestName = "";
    
    for(int i = 0; i < numSodaTypes; i++) {
      System.out.println("Enter the name of soda type " + (i + 1) + ": ");
      sodaNames[i] = input.next();
      do {
        System.out.println("Enter the number of " + sodaNames[i] + " bottles sold: ");
        sodaSales[i] = input.nextInt();
      } while(sodaSales[i] < 0);
      totalSales += sodaSales[i];
      if(sodaSales[i] > highestSales) {
        highestSales = sodaSales[i];
        highestName = sodaNames[i];
      }
      if(i == 0) {
        lowestSales = sodaSales[i];
        lowestName = sodaNames[i];
      } else if(sodaSales[i] < lowestSales) {
        lowestSales = sodaSales[i];
        lowestName = sodaNames[i];
      }
    }
    System.out.println("------------------------------------------");
    System.out.println("Total Sold: " + totalSales);
    System.out.println("Highest Sold: " + highestName);
    System.out.println("Lowest Sold: " + lowestName);
  }
}

