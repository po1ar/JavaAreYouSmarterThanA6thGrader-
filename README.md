# JavaAreYouSmarterThanA6thGrader-
Do you think you're smarter than a 6th Grader? Let's find out!

Contents of this ZIP:
	- Main.java
	- Quiz.java
	- README.txt

Goal of the software:

The goal of this is for anyone to be able to see if they can answer a simple quiz with questions that 6th graders learn as a part of the their curriculum. It also displays the leaderboard of all the players who played and their name & score.

Main.java is a class that states the questions and if the user answers the correct question, it will update their score. At the end, you will see a leaderboard of the highest score, in order.

Quiz.java is a class that creates the ArrayList and helps make the arrayList and the leaderboard to work.


Main.java Specs:

	Scanners:
		 Scanner scanStr - helps capture the users response that involves a String.
		 
		 Scanner scanNum - helps capture the users response that involves a int.

	Objects:
		  Quiz num - object that helps record the user's name and score to the arrayList
	
	Variables:
		  int AmountOfQuestions - the amount of questions the quiz contains
		  
		  int name - user's name
		  
		  int score - the user's score/how many they got right
		  
		  int/String userAnswerOne,Two,Three... - these variables captured the user's response to the answer
		  
		  int/String answerOne,Two,Three... - these variables were the correct answer to the quiz
		  
		  String PlayAgain - cpatured the user's response if they wanted to play again
		  
		  

Quiz.java Specs:

	Fields
		ArrayList<String> leaderboards - a list of the names and their score
		
	Constructors
		public Quiz() - initializes the leaderboard arrayList

	Methods
		void addScoreAndName(String name, int score) - adds the name and score to the list leaderboard

		static void printQuiz() - returns the leaderboard in order from highest score to lowest score
