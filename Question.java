
import java.util.Scanner; 
public class Question {
	
	private String questionText;
	private String[] options;
	private String correctAns; 
	private String difficulty; 
	
	private int numOfQuestions; 
	
	public Question (String textForQues, String[] ansOptions, String ansCorrect, String difficulty) {
		this.questionText = textForQues;
		this.options = ansOptions; 
		this.correctAns = ansCorrect; 
		this.difficulty = difficulty; 
				
	}
	
	//Ask user for the number of questions they want to play
	public int numOfQuestions () {
		Scanner in = new Scanner (System.in); 
		
		System.out.print("Please enter the number of questions you want to play.");
		int numOfQues = in.nextInt(); 
		this.numOfQuestions = numOfQues; 
		
		return numOfQuestions; 
	}
	//Somewhere else make sure it gets displayed
	
	
	
	//getters and setters
	//questionDiffuculty, type? number of questions? options? 
	//validate the correct answer here

}
