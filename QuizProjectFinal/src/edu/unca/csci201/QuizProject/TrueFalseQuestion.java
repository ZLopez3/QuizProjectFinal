package edu.unca.csci201.QuizProject;




public class TrueFalseQuestion extends Quiz implements Question {
	protected int choice;
	protected String userAnswer;
	public TrueFalseQuestion() {
		

	}

	@Override
	public String getTheQuestionText() {
		scoreCount = 0;
		QuestionAMT =0;
		
		
		choice++;
	
		switch (choice) {

		case 1:
			QuestionAMT++;
			QuestionText="True of false: the capital of New Zealand is Wellington?";
			System.out.println(QuestionText);
			userAnswer = scan.nextLine();
			CorrectAnswer = "true";
			
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;
				System.out.println("Congrats! Your right!");
			} else
				System.out.println("Sorry, you are not correct, the capital of New Zealand is Wellington");
			break;

		case 2:
			QuestionAMT++;
			QuestionText="True of false: To gain control of the US House of Representatives, 217 \n "
					+ "voting members are necessary from one of the two represented parties?";
			System.out.println(QuestionText);
			userAnswer = scan.nextLine();
			
			CorrectAnswer = "false";
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;
				System.out.println("Congrats! Your right!");
			} else
				System.out.println(
						"Sorry, you are not correct. One of the two parties needs 218 voting members to control the house.");
			break;

		case 3:
			QuestionAMT++;
			QuestionText = "True of false: Lighting never strikes in the same place twice?";
			System.out.println(QuestionText);
			userAnswer = scan.nextLine();
			CorrectAnswer = "false";
			
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;
				System.out.println("Congrats! Your right!");
			} else
				System.out.println("Sorry, you are not correct. The Empire State Building gets struck over 100 times a year.");
			break;
		case 4:
			QuestionAMT++;
			QuestionText = "True of false: Given a right triangle, the square root of side A + the square root of side B = the square root of side C?";
			System.out.println(QuestionText);
			userAnswer = scan.nextLine();
			CorrectAnswer = "true";
			
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;
				System.out.println("Congrats! Your right!");
			} else
				System.out.println("Sorry, you are not correct. Pythagorean's Theorem states: A squared + B squared = C squared.");
			break;
			
		case 5: 
			QuestionAMT++;
			QuestionText = "True or False: You can lead a cow down stairs but not up stairs?";
			System.out.println(QuestionText);
			userAnswer = scan.nextLine();
			CorrectAnswer = "false";
			
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;
				System.out.println("Congrats! Your right!");
			} else
				System.out.println("Sorry, you are not correct. Cows can go up stairs but not down");
			break;
			
			case 6: 
				QuestionAMT++;
				QuestionText = "True or False: Google was originally called BackRub?";
				System.out.println(QuestionText);
				userAnswer = scan.nextLine();
				CorrectAnswer = "true";
				
				if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
					scoreCount++;
					System.out.println("Congrats! Your right!");
				} else
					System.out.println("Sorry, you are not correct.  When Larry Page and Sergey Brin first started their company was called Backrub");
				break;
			case 7: 
				QuestionAMT++;
				QuestionText = "True or False: Actor Brendan Frazier has been in over 30 movies and hes still sucks?";
				System.out.println(QuestionText);
				userAnswer = scan.nextLine();
				CorrectAnswer ="true";
				
				if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
					scoreCount++;
					System.out.println("Congrats! Your right!");
				} else
					System.out.println("Sorry, you are not correct.  Hes actually been in over 50, youd think he'd be better by now.");
				break;
		}//switch close
		String finish=" You got this!";
		
		return finish;
		
	}

	@Override
	public int getQuestionAmt() {
		// TODO Auto-generated method stub
		return super.getQuestionAmt();
	}

	@Override
	public boolean isCorrectAnswer(String answer) {

			return super.isCorrectAnswer(answer);
	}
public String getAnswers() {
		answer=userAnswer;
		return answer;
		
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
}
