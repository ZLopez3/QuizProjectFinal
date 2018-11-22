package edu.unca.csci201.QuizProject;

import java.util.Scanner;

public class FillInTheBlank extends Quiz implements Question {

	protected int choice;
	protected String userAnswer;
	public FillInTheBlank() {

		
	}


	@Override
	public String getTheQuestionText() {
		scoreCount = 0;
		QuestionAMT =0;
		Scanner scan = new Scanner(System.in);

		choice++;

		switch (choice) {

		case 1:
			QuestionAMT++;
			QuestionText = "Fill in the Blank. \n"+
		"A stitch in __________ saves nine.";
			System.out.println(QuestionText);
			CorrectAnswer = "time";
			userAnswer = scan.nextLine();
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats! you are correct.");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer);
			}
			
			break;
		case 2:
			QuestionAMT++;
			QuestionText = "Fill in the Blank. \n"+
		"An ounce of prevention is worth a __________ of Cure.";
			System.out.println(QuestionText);
			CorrectAnswer = "pound";
			userAnswer = scan.nextLine();
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats! you are correct.");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer);
			}
			break;
		case 3:
			QuestionAMT++;
			QuestionText = "Fill in the Blank. \n"+
		"A man's __________ should exceed his grasp.";
			System.out.println(QuestionText);
			CorrectAnswer = "reach";
			userAnswer = scan.nextLine();
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats! you are correct.");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer);
			}
			break;
		case 4:
			QuestionAMT++;
			QuestionText = "Fill in the Blank. \n"+
		"A bird in the __________ is worth two in the bush.";
			System.out.println(QuestionText);
			CorrectAnswer = "hand";
			userAnswer = scan.nextLine();
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats! you are correct.");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer);
			}
			break;
		case 5:
			QuestionAMT++;
			QuestionText = "Fill in the Blank. \n"+
		"Necessity is the __________ of invention. ";
			System.out.println(QuestionText);
			CorrectAnswer = "mother";
			userAnswer = scan.nextLine();
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats! you are correct.");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer);
			}
			break;
		}//switch close
		String finish =" Variety is the spice of life!";
		
		return finish;
		
	}//method close

	@Override
	public int getQuestionAmt() {
		// TODO Auto-generated method stub
		return super.getQuestionAmt();
	}


	@Override
	public boolean isCorrectAnswer(String answer) {

		return super.isCorrectAnswer(answer);
	}

	@Override
	public String getCorrectAnswer() {
	
		return super.getCorrectAnswer();
	}

	@Override
	public int getScoreCount() {
		
		return super.getScoreCount();
	}
	
	@Override
	public int getChoice() {
		
		return super.getChoice();
	}
public String getAnswers() {
	answer=userAnswer;
		return answer;
		
	}

	

}// class closing bracket
