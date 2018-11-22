package edu.unca.csci201.QuizProject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Quiz implements Question {
	private int arraysize = 25;
	public String QuestionText;
	public String CorrectAnswer;
	protected int QuestionAMT;
	protected int scoreCount;
	protected int choice;
	private int qAdd = 0;
	private int index;
	private String userName;
	private Scanner scan = new Scanner(System.in);
	protected String answer;
	private Calendar cal = Calendar.getInstance();
	protected DecimalFormat fmt = new DecimalFormat("##0.00");
	private long startTime;
	public Question[] qList = new Question[arraysize];;
	protected FileWriter fw; 
	protected BufferedWriter bw; 
	protected PrintWriter myOutput; 

	public Quiz() {

	}

	// This accepts a question object and adds it to it's list of questions(qList)
	public void addQuestion(Question q) {

		if (qAdd <= arraysize) {

			qList[qAdd] = q;
		}
		qAdd++;

	}

	/*
	 * This presents each question, one by one, to the user and asks for their
	 * answer. After each answer, it checks if the answer is correct and keeps track
	 * of the results. Finally, it returns the score the user got.
	 */

	public double giveQuiz() throws IOException {

		index = 0;

		System.out.println("Welcome! I have created a wonderful quiz for you. Are you ready? (y or n)");

		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("y")) {

			System.out.println("Excellent! Lets get started.");
			// index++;
		} else if (answer.equalsIgnoreCase("n")) {

			System.out.println("I realize you'd rather be doing something else \n"
					+ "but please amuse me for the sake of this project. Here we go!");

		}
		if (!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"))) {

			do {
				System.out.println("I realize you'd rather be doing something else \n"
						+ "but please amuse me for the sake of this project.\n" + "Please enter (y or n)");
				answer = scan.nextLine();

			} while (answer.isEmpty() || !(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")));

		}

		startTime = System.currentTimeMillis();// start time for the quiz

		System.out.println();

		do {
			System.out.println("Please enter your username for this quiz session");
			userName = scan.nextLine();// takes in a userName string and stores it for later use

		} while (userName.isEmpty());

		 fw = new FileWriter("YourQuizQandA1.txt");
		 bw = new BufferedWriter(fw);
		 myOutput = new PrintWriter(bw);
		 
		myOutput.println(" Thanks again for playing! As a thank you gift, we have created this snapshot of \n "+
		"your quiz results for your viewing pleasure. Enjoy! ");
		myOutput.println();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		quizLoop();
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		do {
			System.out.println("Question amount so far is: " + QuestionAMT + ", and your scoreCount is: " + scoreCount);
			System.out.println("Would you like to keep going? (y or n)");
			answer = scan.nextLine();

			if (answer.equalsIgnoreCase("y") && index < qList.length-1) {

				System.out.println("Great!");
				quizLoop();
				
				answer = "";
				
			} else if (answer.equalsIgnoreCase("n")) {
				System.out.println(" Sigh....I realize you'd rather be doing something else.");
				System.out.println();
				//quizEnd();

			}

		} while (!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n"))); // add onto that it needs to stop if
																					// the qList array hits its length.

		System.out.println();

	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		/*
		 * This body of code act as the closing statements of the quiz. It calculates
		 * the total time of the quiz, as well as the day the quiz was taken.
		 */
		
		quizEnd();

		scan.close();

		return 0;

	}

	

	@Override
	public String getTheQuestionText() {
		// TODO Auto-generated method stub
		return QuestionText;
	}

	public boolean isCorrectAnswer(String answer) {
		CorrectAnswer = getCorrectAnswer();
		if (CorrectAnswer.equalsIgnoreCase(answer)) {
			return true;
		} else

			return false;

	}

	@Override
	public String getCorrectAnswer() {
		// TODO Auto-generated method stub
		return CorrectAnswer;
	}

	public int getScoreCount() {

		int result = scoreCount;

		return result;
	}

	public int getChoice() {
		return choice;
	}

	public String getAnswers() {

		return answer;
	}

	public int getQuestionAmt() {
		return QuestionAMT;
	}

	public String getQuestion() {
		return QuestionText;
	}

	private String getDay() {

		int date = cal.get(Calendar.DAY_OF_WEEK);

		String day = "day";

		switch (date) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;
		}
		return day;
	}

	private void quizEnd() {
		long EndTime = System.currentTimeMillis();// end time for the quiz
		long TotalTimeSec = ((EndTime - startTime) / 1000) % 60;
		long TotalTimeMin = ((EndTime - startTime) / 1000) / 60;

		double endScore = ((double) scoreCount / QuestionAMT) * 100;
		System.out.println("Thanks for playing! Your final score was " + fmt.format(endScore) + "%\n" + "you took "
				+ TotalTimeMin + " minutes and " + TotalTimeSec + " seconds to complete the quiz.\n" + "Thanks "
				+ userName + ", I hope you have a great " + getDay());
		
		myOutput.println("Thanks for playing! Your final score was " + fmt.format(endScore) + "%\n" + "you took "
				+ TotalTimeMin + " minutes and " + TotalTimeSec + " seconds to complete the quiz.\n" + "Thanks "
				+ userName + ", I hope you have a great " + getDay());
		
		myOutput.close();
	}

	private void quizLoop() throws IOException {

		
		
		
		
		for (int i = 0; i < 5; i++) {// the amount i is true needs to cap at the maximum amount of cases for one of
			// the question objects.
			choice = ((Quiz) qList[index]).getChoice();// increases switch option for each instance.
			System.out.println(qList[index].getTheQuestionText());
			myOutput.println("Question: " + ((Quiz) qList[index]).getQuestion());
			QuestionAMT += ((Quiz) qList[index]).getQuestionAmt();

			myOutput.println("Your answer was: " + ((Quiz) qList[index]).getAnswers());
			myOutput.println("The correct answer was: " + qList[index].getCorrectAnswer());
			myOutput.println();
			scoreCount += ((Quiz) qList[index]).getScoreCount();

			System.out.println();
			index++;
		}
		System.out.println();
		
	}

}// class closing bracket
