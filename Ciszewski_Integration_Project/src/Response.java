// Brian Ciszewski
// Part of Number Guessing Game Program, Ciszewski_Integration_Project package
public class Response {
  // the strings higher and lower are used to reduce repetitive typing of phrases.
  String higher = "Guess a higher number.";
  String lower = "Guess a lower number.";

  // if the guessed number is lower than the randomly generated one, the program will prompt the
  // user to enter a higher number and vice versa. The program continues to loop.
  public boolean respond(double randomNum, double guessNum) {
    if (randomNum == guessNum) {
      return true;
    } else if (randomNum != guessNum) {
      if (guessNum < randomNum) {
        System.out.println("\t" + higher + "\n");
      } else if (guessNum > randomNum) {
        System.out.println("\t" + lower + "\n");
      }
      return false;
    }
    return false;
  }

  // prints a message to the user letting them know that they have solved the game
  // prompts user if they would like to play again, only accepts 'yes' responses and variations
  // to play again
  public static void displayWinnerMessage(int counter) {
    System.out.println("\n\nCongragulations!!");
    int i;
    for (i = 3; i > 0; i--) {
      System.out.println("\tWinner!");
    }
    int overLoad = 1;
    SPI3.setScore(counter, overLoad);
    SPI3.setScore(counter, overLoad);
    // Overloading Example, the method 'setScore' is written twice, once to accept an int only and
    // one to accept 2 int's.
    System.out.println("Your score is " + SPI3.getScore() + " points.");
  }
}
