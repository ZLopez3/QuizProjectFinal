package edu.unca.csci201.QuizProject;

import java.io.IOException;
import java.util.Random;

public class QuizTime {

	public static void main(String[] args) throws IOException   {

		
		
		
		Random rand = new Random();

		Quiz quizObj = new Quiz();
		

		
		
		MultipleChoiceQuestion  monty = new MultipleChoiceQuestion();
		TrueFalseQuestion  facts = new TrueFalseQuestion();
		ShortAnswerQuestion  shorty = new ShortAnswerQuestion();
		FillInTheBlank maxim = new FillInTheBlank();

		
		
		
		for (int n = 0; n < quizObj.qList.length; n++) {
			int i = rand.nextInt(4)+1;
			switch (i) {
			case 1:
				
				quizObj.addQuestion(facts);
				break;
			case 2:
				
				quizObj.addQuestion(shorty);
				break;
			case 3:
				
				quizObj.addQuestion(monty);
				
				break;
			case 4:
			
				quizObj.addQuestion(maxim);
				
				break;
				
				default:
				continue;
			}
		}

	

		quizObj.giveQuiz();
		
		
	
		
	}

}
