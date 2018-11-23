package edu.unca.csci201.QuizProject;




public class ShortAnswerQuestion extends Quiz implements Question {
	
	protected String userAnswer;
	protected int choice;
	public ShortAnswerQuestion() {
		
	}

	@Override
	public String getTheQuestionText() {
		scoreCount = 0;
		QuestionAMT =0;
		choice++;
		
		switch (choice) {
		
		case 1:
			QuestionAMT++;
			QuestionText = "In your own words, what would you do if you won the lottery?";
			System.out.println(QuestionText);
			userAnswer = scan.nextLine();
			scoreCount++;
			CorrectAnswer = "what you said is correct!";
			break;
		case 2:
			QuestionAMT++;
			QuestionText = "In your own words, why is five the best number?";
			System.out.println(QuestionText);
			userAnswer = scan.nextLine();
			scoreCount++;
			CorrectAnswer = "dido!";
			break;
		case 3:
			QuestionAMT++;
			QuestionText = "In your own words, What famous figure, dead or alive, would you like to have a meal with?";
			System.out.println(QuestionText);
			userAnswer = scan.nextLine();
			scoreCount++;
			CorrectAnswer = "Your answer!";
			break;
		case 4:
			QuestionAMT++;
			QuestionText = "In your own words, whats the best thing that happen to you all day?";
			System.out.println(QuestionText);
			userAnswer = scan.nextLine();
			scoreCount++;
			CorrectAnswer = "You said it!!";
			break;
		case 5:
			QuestionAMT++;
			QuestionText = "In your own words, what would your superpower be and why?";
			System.out.println(QuestionText);
			userAnswer = scan.nextLine();
			scoreCount++;
			CorrectAnswer = "Im sure whatever you said is awesome!";
			break;
		}//switch close
		String finish= "Perfect thanks!";
		CorrectAnswer = "Im sure whatever you said is awesome!";
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
	@Override
	public String getCorrectAnswer() {
	
		return super.getCorrectAnswer();
	}

	public String getAnswers() {
		answer=userAnswer;
		return answer;
		
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
