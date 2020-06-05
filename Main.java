import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //Created 2 scanners for 2 the two input types
    Scanner scanStr = new Scanner(System.in);
    Scanner scanNum = new Scanner(System.in);
    boolean repeat = true;
    //object that helps with the leaderboards
    Quiz num = new Quiz();
    //bascially this loop runs until the player says they are done
    while (repeat) {
      int AmountOfQuestions = 5;
      int score = 0;
      System.out.println("Are you smarter than a 6th Grader? Lets find out!");
      System.out.println("What's your name?");
      String name = scanStr.nextLine();
      //these questions take in the answers
      System.out.println("Question 1: What's 2*5+5-3");
      int userAnswerOne = scanNum.nextInt();
      int answerOne = 12;

      if (userAnswerOne == answerOne) {
        System.out.println("Correct! Onto the next one");
        //if they get it right, it will update their score
        score++;
      } else {
        //if not, it'll just keep their grade the same
        System.out.println("Wrong! You still got 4 more!");
      }
      System.out.println("Question 2: What's the capital of New York?");
      String userAnswerTwo = scanStr.nextLine();
      String answerTwo = "Albany";

      if (userAnswerTwo.equals(answerTwo)) {
        System.out.println("Correct! Onto the next one");
        score++;
      } else {
        System.out.println("Wrong! You still got 4 more!");

      }
      System.out.println("Question 3: How long is one regular term for a U.S. Representative?");
      int userAnswerThree = scanNum.nextInt();
      int answerThree = 2;

      if (userAnswerThree == answerThree) {
        System.out.println("Correct! Onto the next one");
        score++;
      } else {
        System.out.println("Wrong! You still got 2 more!");
      }

      System.out.println(
          "Question 4: Emma has 2 yard sticks. She also has a 12-inch ruler. She laid them end-to-end in a line. How many feet long is the line? (write just the number)");
      int userAnswerFour = scanNum.nextInt();
      int answerFour = 7;

      if (userAnswerFour == answerFour) {
        System.out.println("Correct! Onto the next one");
        score++;
      } else {
        System.out.println("Wrong! You still got 1 more!");
      }

      System.out.println("Question 5: Which continent is the least populated?");
      String userAnswerFive = scanStr.nextLine();
      String answerFive = "Antartica";

      if (userAnswerFive.equals(answerFive)) {
        System.out.println("Correct! Onto the next one");
        score++;
      } else {
        System.out.println("Wrong!");
      }

      //At the end of the quiz, it will add their name and score to the arrayList and display it on the leaderboards
      num.addScoreAndName(name, score);
      //displays leaderboard
      num.printQuiz();
      System.out.println("Does another student want to play again?");
      String playAgain = scanStr.nextLine();
      //if they want to play, it will keep looping through
      if (playAgain.equals("yes")) {
        repeat = true;
      } else {
        repeat = false;
      }
    }
  }
}
