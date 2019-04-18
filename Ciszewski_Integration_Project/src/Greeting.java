// Brian Ciszewski
// Part of Number Guessing Game Program, Ciszewski_Integration_Project package
// Multiple methods are made with similar names for each game mode. An introduction greeting
// method also calls to the input-Scanner class to get user input on first picking the game mode.
// prints the parameters of the guessing game. Asks the user to type an input for the random
// number. The escape sequences, \n or \t, are used to format the output with new, blank lines
// and tab-spacing to make the output messages easier to read.

public class Greeting {
  public static void greet() {
    System.out.println("I'm thinking of a number between 1 and 100.");
    System.out.println("What is my number?\n");
  }

  public static void greet2() {
    System.out.println("I'm thinking of a double-number between 1 and 10 with 2 decimal places.");
    System.out.println("What is my number?\n");
  }

  // Prompts the user to pick which game mode, calls input scanner class for input from user,
  // returns
  // user choice stored in game mode.
  int gameMode = 0;
  // int guess = 0;

  public int greetIntro() {
    while (true) {
      try {
        // System.out.print("Created by: ");
        // Polymorphism.sayName();
        System.out.println("\n");
        System.out.println("Select your Game Mode:\n1: Easy\n2: Hard\n ");

        GetInput userInput = new GetInput();
        String guess = userInput.input();
        gameMode = Integer.parseInt(guess);
        break;
        // return gameMode;
      } catch (NumberFormatException e) {
        // catch (NumberFormatException ex) {
        System.out.println("Invalid Input. Please enter a number.");
      }
    }
    if (gameMode <= 0 || gameMode >= 3) {
      System.out.println("Please enter 1 or 2.");
      Greeting getGreetIntro = new Greeting();
      int gameMode = getGreetIntro.greetIntro();
      return gameMode;
    }
    return gameMode;
  }

  // tests if the user-input is within bounds of the randomly generated number and that only the
  // proper data-type can be accepted to prevent crashes
  public int guessGameMode1() {
    int guessNum = 0;
    while (true) {
      try {
        GetInput userInput = new GetInput();
        String guess = userInput.input();
        guessNum = Integer.parseInt(guess);
        break;
      } catch (NumberFormatException e) {
        System.out.println("Invalid Input. Please enter a number.");
      }
    }
    if (guessNum <= 0 || guessNum > 100) {
      System.out.println("Please enter a number 1-100.");
      // Greeting getGreetIntro = new Greeting();
      // int guessNum1 = getGreetIntro.guessGameMode1();
      // return guessNum1;
    }
    return guessNum;
  }

  // tests if the user-input is within bounds of the randomly generated number and that only the
  // proper data-type can be accepted to prevent crashes
  public double guessGameMode2() {
    double guessNum = 0;
    while (true) {
      try {
        GetInput userInput = new GetInput();
        String guess = userInput.input();
        guessNum = Double.parseDouble(guess);
        break;
      } catch (NumberFormatException e) {
        System.out.println("Invalid Input. Please enter a number.");
      }
    }
    if (guessNum <= 0 || guessNum > 10) {
      System.out.println("Please enter a number between 1-10");
      // Greeting getGreetIntro = new Greeting();
      // double guessNum1 = getGreetIntro.guessGameMode1();
      // return guessNum1;
    }
    return guessNum;
  }
}
