import java.util.Scanner;

public class IntToString {

	private int number = 0;
	
	private String numberString = null;
	
	Scanner userIn = new Scanner(System.in);
	
	public IntToString() {
		
		this.promptUser();
		
		this.number = this.getInput();
		
		this.numberString = this.toString(number);
		
		this.displayNumberString(numberString);
		
		this.close();
		
	}
	
	public void setNumber(int inNumber) {
		
		this.number = inNumber;
		
	}
	
	public int getNumber() {
		
		return this.number;
	}
	
	public void setNumberString(String inString) {
		
		this.numberString = inString;
	}
	
	public String getNumberString() {
		
		return this.numberString;
	}
	
	public int getInput() {
		
		return userIn.nextInt();
		
	}
	
	public void promptUser() {
		
		String prompt = "Type an integer.";
		
		display(prompt);
	}
	
	public String toString(int inNum) {

		
		return String.valueOf(inNum);
		
	}
	
	public void displayNumberString(String inString) {
		
		this.display("\"" + inString + "\"" );
	}
	
	public void display(String inString) {
		
		System.out.println(inString);
	}
	
	public void display(int inNumber) {
		
		System.out.println(inNumber);
	}
	
	public void close() {
		
		String closePrompt = "Press any button to close";
		
		this.display(closePrompt);
		
		int close = 0;
		
		if(this.userIn != null) System.exit(close);
	}

}
