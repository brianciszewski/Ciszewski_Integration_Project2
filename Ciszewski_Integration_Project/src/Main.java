/*
 * Author: Brian Ciszewski Date: 2/5/2019
 * 
 * Number Guessing Game This program welcomes and prompts the user for the gamemode. The user is to
 * input a number in between the given interval. If the guess is too high or too low, the program
 * prompts a guess from the user of the appropriate direction towards the randomly generated number.
 * 
 * variable == a location in memory scope == the use of a variable is local to the class/method it
 * is defined in, other classes/methods cannot see these variables unless passed as arguments.
 */


// name and description of code per class /////////////////////////////
import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Main {


  // main class declaration
  public static void main(String[] args) {
    boolean playAgain = false;
    // FF33FF
    do {
      // declares and initializes variables for win and random number
      // final is used for the lower limit variable. This variable cannot be changed and does not
      // need to be changed in this code because it is used as a lower boundary for the random
      // number
      final int lowerLimit = 1;
      double randomNum = 1;
      Boolean win = false;
      // initialized the greeting() class and returns an integer value for the gameMode variable
      System.out.println("Welcome to the Number Guessing Game!!");
      Greeting getGreetIntro = new Greeting();
      int gameMode = getGreetIntro.greetIntro();

      // Tests which game mode the user entered, defines the random number appropriately for the
      // easy
      // and
      // hard game modes. The random class is used and the double is parsed to an integer in easy
      // mode.
      // CC0000
      // 00CC00
      if (gameMode == 1) {
        // the random number is casted to an integer from its default double type for this gamemode
        randomNum = (int) ThreadLocalRandom.current().nextInt(lowerLimit, 100 + 1);
        System.out.println(randomNum);
        Greeting.greet();
        // 330000
      } else if (gameMode == 2) {
        randomNum = (Math.round(ThreadLocalRandom.current().nextDouble(lowerLimit, 9 + 1) * 100.0)
            / 100.0);
        System.out.println(randomNum);
        Greeting.greet2();

      } else if (gameMode == 3) {
        SPI3.information();
        break;
      }
      // declares and initializes a counter for the number of guesses made by the user
      // loops while the correct number has not been guess. Guessing the correct number returns a
      // true
      // value for the win boolean.
      int counter = 0;
      // 66CC00
      while (win == false) {

        double guessNum = 0;


        // initializes the getInput class. User input is parsed from a string to a double.
        // calls the method for user input and returns the result from the input scanner class.
        // CCFFE5
        if (gameMode == 1) {
          guessNum = getGreetIntro.guessGameMode1();
        } else if (gameMode == 2) {
          guessNum = getGreetIntro.guessGameMode2();
        }


        // initializes the Response class. This class tests the guessed number against the randomly
        // generated one.
        Response userResponse = new Response();
        boolean winner = userResponse.respond(randomNum, guessNum);
        win = winner;
        // FF8000
        // 66FFFF
        double secretNum = Math.PI;
        DecimalFormat secretNumValue = new DecimalFormat("##.##");
        if (guessNum == 0) {
          break;
          // 9999FF
        } else if (guessNum == Double.parseDouble(secretNumValue.format(secretNum))) {
          System.out.println("You found the secret code!");
          counter -= 3;
          continue;
        }

        // adds one to the counter variable for each loop of not guessing the correct number.
        counter++;
      }
      // The while-loop is broken when the correct number is guessed and the boolean win is set
      // equal
      // to true. A congratulations message is given to the user along with the number of guesses.
      // calls to displays the winning message and the score derived from the counter.
      // FFCCFF
      // 0000FF
      if (win == true) {
        Response.displayWinnerMessage(counter);
      } else {
        System.out.println("Thanks for playing  :)");
      }
      System.out.println("Would You like to play again?");
      GetInput userInput = new GetInput();
      String answer = userInput.input();
      // ternary constructor acts as a shortcut for an if statement.
      // 990099
      // 66FFFF
      playAgain = (answer.equals("yes") || answer.equals("y") || answer.contentEquals("Yes")) 
          ? true : false;
    } while (playAgain == true);
  }

}



/*
 * PSI 1 Add your name as a comment at top of every file Add a description of the program as a
 * comment at top Add a list and description of Java built-in data types within the user interface
 * or in comments Add a greeting / introduction to the user Use a boolean variable with an
 * appropriate name (singular noun, lowerCamelCase) Use an int variable with an appropriate name
 * (singular noun, lowerCamelCase) Use an double variable with an appropriate name (singular noun,
 * lowerCamelCase) Use a String object with an appropriate name (singular noun, lowerCamelCase)
 * Define (in English) the term "variable" as it relates to computer programming in a comment or the
 * user interface Define (in English) the term "scope" as it relates to computer programming in a
 * comment or the user interface Use final with a variable and describe what it means in a comment
 * Use casting and describe what it means in a comment Format strings using escape sequences
 * 
 * // // only need compareTo() //
 *** 
 * COPY/PASTE THE HEX VALUES TO FIND EACH ELEMENT ***
 * 
 * PSI 2 CCFFE5 -- Create a method with arguments and return values FFCCFF -- Identify a method call
 * and argument in comments CCFFE5 -- Identify a header and parameter in comments // LOCATED IN
 * RESPONSE CLASS CC0000 -- Use the Random class 330000 -- Use the Math class FF8000 -- Create
 * if/else constructs 990099 -- Create ternary constructs 00CC00 -- Use a switch statement 66FFFF --
 * Compare two String objects by using the compareTo and equals methods and make a comment
 * describing how == works with objects Located throughout Main/Response classes*** -- Use +, -, *,
 * /, %, ++, --, += 0000FF -- Use relational operators 009999 -- Use conditional operators //
 * LOCATED IN RESPONSE CLASS 009999 -- Describe operator precedence as a comment 66CC00 -- Create
 * and use while loops FFE5CC -- Create and use for loops // LOCATED IN THE RESPONSE CLASS FF33FF --
 * Create and use do/while loops 66FFFF -- Use break in a loop with a comment describing what it
 * does 9999FF -- Use continue in a loop with a comment describing what it does
 * 
 * 
 * 
 * PSI 3 Make a class in a separate file with private fields, public getters and setters, a
 * constructor with and without parameters // SEE SPI3 Overload a method // SEE SPI3 Describe
 * inheritance and its benefits // Inheritance- a subclass will inherit the properties, fields and
 * methods, of its parent class // when using a subclass that has extra unique properties,
 * inheritance is beneficial Develop code that makes use of polymorphism // SEE POLYMORPHISM Use
 * super and this to access objects and constructors // SEE SPI3
 * 
 * 
 * // SEE ArrayCrazy for remaining quests. Declare, instantiate, initialize and use a
 * one-dimensional array Manually find the smallest value in an array Get a sum of the values in an
 * array using an accumulator. Search an array and identify the index where a value was found.
 * Create and use the enhanced for loop Declare, instantiate, initialize and use multi-dimensional
 * arrays Declare and use an ArrayList of a given type Search a two-dimensional array and identify
 * the coordinates where a value was found Effectively utilize exception handling for user input of
 * an int // SEE GetInput
 * 
 * 
 */
