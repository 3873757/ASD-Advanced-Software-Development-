package templet;

public abstract class LetterProcessTemplet {
	public void generateLetter(Letter letter) {
		String[][] letterRecreated = generateeLetter(letter);
		showLetter(letterRecreated);
	}
	public abstract String[][] generateeLetter(Letter letter);

	public abstract void showLetter(String[][] recreation);

}
