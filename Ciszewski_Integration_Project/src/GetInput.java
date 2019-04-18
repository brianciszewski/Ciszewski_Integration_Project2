// Brian Ciszewski
// Part of Number Guessing Game Program, Ciszewski_Integration_Project package
// The Scanner class is imported and used for all input gathering.
import java.util.Scanner;

public class GetInput {

  // function input() is created to be called by the main program. Reads line of user input.
  public String input() {
    Scanner sc = new Scanner(System.in);
    String input1 = sc.nextLine();
    return input1;
  }
}
