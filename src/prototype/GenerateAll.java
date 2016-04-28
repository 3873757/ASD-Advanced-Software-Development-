package prototype;

import templet.Letter;
import templet.LetterProcessTemplet;

public class GenerateAll extends LetterProcessTemplet {

	@Override
	public String[][] generateeLetter(Letter letter) {
		String[][] completLetter = null;
		switch (letter.getType()) {
		case VERTICAL:
			completLetter = new String[letter.getRow()][letter.getColumn() * 2];
			for (int i = 0; i < completLetter.length; i++) {
				int counter = letter.getColumn() - 1;
				for (int j = 0; j < completLetter[i].length; j++) {
					if (j < letter.getColumn()) {
						completLetter[i][j] = letter.getLetterClue()[i][j];
					} else {
						completLetter[i][j] = letter.getLetterClue()[i][counter];
						counter--;
					}
				}
			}
			break;
		case NONE:
			completLetter = letter.getLetterClue();
			break;
		case HORIZONTAL:
			completLetter = new String[letter.getRow() * 2][letter.getColumn()];
			int count = letter.getRow() - 1;
			for (int i = 0; i < completLetter.length; i++) {
				for (int j = 0; j < completLetter[i].length; j++) {
					if (i < letter.getRow()) {
						completLetter[i][j] = letter.getLetterClue()[i][j];
					} else {
						completLetter[i][j] = letter.getLetterClue()[count][j];
					}
					if (i >= letter.getRow()) {
						count--;
					}
				}
				break;
			}
		}
		return completLetter;
	}

	@Override
	public void showLetter(String[][] recreation) {
		for (int i = 0; i < recreation.length; i++) {
			for (int j = 0; j < recreation[0].length; j++) {
				System.out.print(recreation[i][j]);
			}
			System.out.println("");
		}
	}

}
