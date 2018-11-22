package edu.unca.csci201.QuizProject;



public interface Question {
	

	public String getTheQuestionText();
	
	public boolean isCorrectAnswer(String answer);
	
	public String getCorrectAnswer();

	
	
}
