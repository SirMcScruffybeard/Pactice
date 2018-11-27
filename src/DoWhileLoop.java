import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class DoWhileLoop {
	
	Scanner input = new Scanner(System.in);
	
	private String namePrompt = "Enter your first name:";
	
	private String name = "";
	
	private String conformation = "";
	
	private String positive = "YES";
	
	public DoWhileLoop() {
		
		do {
			
			this.promptForName();
			
			name = this.getInput();
			
			this.promptForConfirm(name);
			
			this.conformation = this.getInput();
		}
		
		while (!isCorrect(this.conformation));
	}
	
	private void promptForName() { Display(namePrompt); }
	
	private void promptForConfirm(String inName) { Display("Is " + inName + " your first name?"); }
	
	private void Display(String inMessage) { System.out.println(inMessage); }
	
	private String getInput() { return input.nextLine();}
	
	private boolean isCorrect(String inAnswer) {return inAnswer.equalsIgnoreCase(positive);}

}
