import java.util.Scanner;
/**
 * gets heights from user and tells them average and above averages
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets amount of heights user wants to enter
    System.out.println("How many heights would you like to enter");
    int heightAmount = input.nextInt();

    //creates array with user input
    int heights[] = new int[heightAmount];

    //prompts user to enter heights
    System.out.println("Please enter the heights on separate lines");

    //puts user heights into array
    for(int i = 0; i < heights.length; i++){
      heights[i] = input.nextInt();
    }

    //creates sum variable
    int sum = 0;

    //adds all grades into sum
    for(int i = 0; i < heights.length; i++){
      sum = sum + heights[i];
    }

    //tells usr average
    double average = sum / heights.length;
    System.out.println("The average height is " + average + "cm");

    //tells user the heights above average
    System.out.println("The heights above average are");
    //gets and prints numbers above average
    for(int i = 0; i < heights.length; i++){
      if(heights[i] > average){
        System.out.println(heights[i]);
      }
    }  
  }
}
