import java.util.Scanner;

public class GuessingGame {
  public static void main(String[] args) {
    int randomNumber = (int) (Math.random() * 100) + 1;
    Scanner input = new Scanner(System.in);
    int guess;
    int numGuesses = 0;
    boolean correct = false;

    while (!correct) {
      System.out.println("Guess a number between 1 and 100: ");
      guess = input.nextInt();
      numGuesses++;

      if (guess == randomNumber) {
        correct = true;
        System.out.println("Congratulations! You guessed the number in " + numGuesses + " guesses.");
      } else if (guess < randomNumber) {
        System.out.println("Too low! Try again.");
      } else {
        System.out.println("Too high! Try again.");
      }
    }
  }
}
