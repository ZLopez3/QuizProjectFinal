package edu.unca.csci201.QuizProject;




public class MultipleChoiceQuestion extends Quiz implements Question {

	
	protected int choice;
	protected String userAnswer;

	public MultipleChoiceQuestion() {

	}

	@Override
	public String getTheQuestionText() {
		scoreCount = 0;
		QuestionAMT =0;
	
		choice++;
		switch (choice) {
		case 1:

			System.out.println("STOP!\n" + "He who would, cross the Bridge of Death \n" + "Must answer me \n"
					+ "These questions three (or four)\n" + "Ere the other side he see. \n ");
			//myOutput.println("STOP!\n" + "He who would, cross the Bridge of Death \n" + "Must answer me \n"
					//+ "These questions three (or four)\n" + "Ere the other side he see. \n ");

			QuestionAMT++;
			QuestionText = "What...is your name? \n" + "Enter a number \n\n" + "1. Sir Robin of Camelot \n"
					+ "2. Sir Lancelot of Camelot \n" + "3. Sir Gawaine of Orkney \n" + "4. Sir Galahad of Clairvaux";
			System.out.println(QuestionText);
			CorrectAnswer = "2";
			userAnswer = scan.nextLine();
			
			//myOutput.println("Your answer was: " + userAnswer);
			//myOutput.println("The correct answer was: " + CorrectAnswer);
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats! you are correct.");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer+ ", Sir Lancelot of Camelot.");
			}
			
			System.out.println();

		
			QuestionAMT++;
			QuestionText += "What...is your quest?\n" + "Enter a number \n\n" + "1. To obtain a shrubbery \n"
					+ "2. To cross the Bridge of Death \n" + "3. To seek the Holy Grail \n"
					+ "4. To win the hand of maid Marrion";
			System.out.println(QuestionText);
			CorrectAnswer = "3";
			userAnswer = scan.nextLine();
			//myOutput.println("Your answer was: " + userAnswer);
			//myOutput.println("The correct answer was: " + CorrectAnswer);
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats! you are correct.");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer + ", To seek the Holy Grail.");
			}
			System.out.println();
			
		
			QuestionAMT++;
			QuestionText += "What is your favorite color? \n" + "Enter a number \n\n" + "1. Blue \n" + "2. Green \n"
					+ "3. Yellow \n" + "4. Red";
			System.out.println(QuestionText);
			CorrectAnswer = "1";
			userAnswer = scan.nextLine();
			//myOutput.println("Your answer was: " + userAnswer);
			//myOutput.println("The correct answer was: " + CorrectAnswer);
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats! you win.");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer + ", Blue.");
			}
			System.out.println();
			

		
			QuestionAMT++;
			QuestionText += "What...is the airspeed velocity of an African swallow? \n" + "Enter a number \n\n"
					+ "1. 25mph \n" + "2. 15mph \n" + "3. 10mph \n" + "4. It doesn't really matter";
			System.out.println(QuestionText);
			CorrectAnswer = "4";
			userAnswer = scan.nextLine();
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats! you're so smart.");
			} else {
				System.out
						.println("I'm sorry, the correct answer was: " + CorrectAnswer + ", It doesn't really matter.");
			}
			break;

		case 2:
			QuestionAMT++;
			QuestionText = "In the movie, \"Monty Python Quest and the Holy Grail,\" what do the knights who say \"Ni!\" demand from King Aurthur? \n"
					+ "Enter a number \n\n" + "1. A herring \n" + "2. A shrubbery \n" + "3. A new forest \n"
					+ "4. The holy grail";
			System.out.println(QuestionText);
			CorrectAnswer = "2";
			userAnswer = scan.nextLine();
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats! you are correct.");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer + ".A shrubbery ");
			}

			break;

		case 3:
			QuestionAMT++;
			QuestionText = "Which from the following Monty Python movies was realease the year Zac Lopez-Ibanez was born (1983)?\n"
					+ "Enter a number \n\n" + "1. Monty Python's Life of Brian\n"
					+ "2. Monty Python Live at the Hollywood Bowl  \n" + "3. Monty Python and the Holy Grail \n"
					+ "4. Monty Python's The Meaning of Life";
			System.out.println(QuestionText);
			CorrectAnswer = "4";
			userAnswer = scan.nextLine();
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats your right! But wait....how did you know that?! ");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer
						+ ". Monty Python's The Meaning of Life ");
			}
			break;
		case 4:
			QuestionAMT++;
			QuestionText = "Which from the following was the original title for Monty Python's Life of Brian?\n"
					+ "Enter a number \n\n" + "1. God! when will this be over\n"
					+ "2. Jesus Christ – Lust for Glory \n" + "3. Monty Python and the Jesus cross applesauce  \n"
					+ "4. Christ who? ";
			System.out.println(QuestionText);
			CorrectAnswer = "2";
			userAnswer = scan.nextLine();
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats you are correct!  ");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer
						+ ". Jesus Christ – Lust for Glory ");
			}
			break;
		case 5:
			QuestionAMT++;
			QuestionText = "Which of the following sketches was NOT apart of Monty Python's Parrot Sketch Not Included\n"
					+ "Enter a number \n\n" + "1. The Ministry of Silly Walks\n"
					+ "2. The Lumberjack Song \n" + "3. Tchaikovsky Piano Concerto Escape Act  \n"
					+ "4. Othello as Performed by a Gaggle of John Cleese ";
			System.out.println(QuestionText);
			CorrectAnswer = "4";
			userAnswer = scan.nextLine();
			if (CorrectAnswer.equalsIgnoreCase(userAnswer)) {
				scoreCount++;// integer variable that increases whenever the player gets an answer right.
				System.out.println("Congrats you are correct!  ");
			} else {
				System.out.println("I'm sorry, the correct answer was: " + CorrectAnswer
						+ ". Othello as Performed by a Herd of Cows \n "+ 
						" (The actual title was : The Merchant of Venice as Performed by a Herd of Cows)");
			}
			break;
		}//switch close

		///////////////////////////////////

		String finish="great Job!";
		

		return  finish;

	}// method close

	@Override
	public boolean isCorrectAnswer(String answer) {

		return super.isCorrectAnswer(answer);
	}
	public String getAnswers() {
		answer = userAnswer;
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
	public int getQuestionAmt() {
		// TODO Auto-generated method stub
		return super.getQuestionAmt();
	}

	@Override
	public int getChoice() {
		
		return super.getChoice();
	}
}// class closing bracket
