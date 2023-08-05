/**
 * Put a short phrase describing the program here.
 *
 * @author Adam Ryan
 *
 */
public class ParseWords1L implements ParseWords{
	
	private String text;
	/**
	 * useful constants
	 */
	private char[] separators = {'\t', '\n', ' ', ',', '.', '-'};
	/**
	 * Constructor
	 * @param s
	 * 			the passage of text to be parsed
	 */
	public ParseWords1L(String s) {
		text = s;
	}
	public String pullNextWord() {
		String word = "";
		int i = 0;
		while (this.text.length()>0) {
			for (int j = 0; j<separators.length-1; j++) {
				if (text.charAt(i)==separators[j]) {
					word = text.substring(0,i);
					text = text.substring(i);
					if (word.length()==0) {
						return pullNextWord();
					}
					return word;
				}
			}
			i++;
		}
		return null;
	}
	@Override
	public boolean isEmpty() {
		return this.text.length()>0;
	}

}
