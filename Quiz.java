import java.util.ArrayList;
import java.util.*;

public class Quiz {
  //the array list
  private static ArrayList<String> leaderboards;

  public Quiz() {
    //cheese constructor
    leaderboards = new ArrayList<String>();
  }
  //method to add the person's score and name to the arrayList
  public void addScoreAndName(String name, int score) {
    leaderboards.add(name + " Scored: " + score + "/5");
  }
  //prints the leaderboards and organizes it by highest score to lowest
  public static void printQuiz() {
    Collections.sort(leaderboards);
    System.out.println("Leaderboards: ");
    for (int i = 0; i < leaderboards.size(); i++) {
      System.out.println(leaderboards.get(i));
    }
  }
}
