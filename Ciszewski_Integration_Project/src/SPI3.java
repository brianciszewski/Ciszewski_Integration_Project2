// Brian Ciszewski
// getters and setters are used for calculating the player's score based on their number of
// attempts stored in the 'counter' variable.
public class SPI3 {
  // creates an integer variable 'score' to be used in class
  static int score;

  // sets the value of 'score' to the passed arguments of 'x' and 'y'.
  public static void setScore(int x, int y) {
    score = x;
  }

  // returns the score times 6. The counter variable is passed along, multiply by 6 for a score that
  // is based on points rather than turns taken.
  public static int getScore() {
    return (score * 6);
  }

  // displays the value of 'score'
  public static void information() {
    System.out.println(score);

  }
}


