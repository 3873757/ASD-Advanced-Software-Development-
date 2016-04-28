package templet;

import prototype.GenerateAll;

public class ClientTest {
 public static void main(String[] args){
	 String[][] LetterClue = {{"-", "-", "-", "-", "-"},
		        {"-", "-", "-", "-", "+"},
		        {"-", "-", "-", "+", "+"},
		        {"-", "-", "+", "+", "-"},
		        {"-", "-", "+", "+", "-"},
		        {"-", "+", "+", "-", "-"},
		        {"-", "+", "+", "-", "-"},
		        {"-", "+", "+", "-", "-"},
		        {"-", "+", "+", "+", "+"},
		        {"-", "+", "+", "-", "-"},
		        {"-", "+", "+", "-", "-"},
		        {"-", "+", "+", "-", "-"},
		        {"-", "+", "+", "-", "-"},
		        {"-", "+", "+", "-", "-"}
		        };
	 String[][] letterB = {
	            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
	            {"-", "-", "-", "+", "+", "+", "+", "+", "-", "-"},
	            {"-", "-", "-", "+", "+", "-", "-", "+", "+", "-"},
	            {"-", "+", "+", "-", "-", "-", "-", "-", "+", "+"},
	            {"-", "+", "+", "-", "-", "-", "-", "-", "-", "-"},
	            {"-", "+", "+", "-", "-", "-", "-", "-", "-", "-"},
	            {"-", "+", "+", "-", "-", "-", "-", "-", "-", "-"},
	            {"-", "+", "+", "-", "-", "-", "-", "-", "-", "-"},};
	  Letter ltr = new Letter("Letter A",LetterEnum.NONE,letterB);	
	  LetterProcessTemplet lpt= new GenerateAll();
	  lpt.showLetter(letterB);
	  lpt.showLetter(LetterClue);
	 
	 System.out.println("The Out put is "+ lpt.generateeLetter(ltr));
	  
 }
}
