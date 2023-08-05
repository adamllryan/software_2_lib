/*Adam Ryan
 * Moga 3
 * Stapler Class
 * 
 * */
public class stapler {

	private int remainingStaples,maxStaples,remainingStaples2,maxStaples2;
	private String color,color2;
	public stapler() {
		remainingStaples = 0;
		maxStaples = 256;
		color = "";
		remainingStaples2 = 0;
		maxStaples2 = 256;
		color2 = "";
	}
	
	public void setRemainingStaples(int dataRemainingStaples) {
		remainingStaples = dataRemainingStaples;
	}
	public void setMaxStaples(int dataMaxStaples) {
		maxStaples = dataMaxStaples;
	}
	public void setColor(String dataColor) {
		color = dataColor;
	}
	public int getRemainingStaples() {
		if (maxStaples < remainingStaples) {
		remainingStaples = maxStaples;
		}
		return remainingStaples;
	}
	public int getMaxStaples() {
		if (maxStaples < remainingStaples) {
			remainingStaples = maxStaples;
			}
		return maxStaples;
	
	}
	public void setRemainingStaples2(int dataRemainingStaples2) {
		remainingStaples2 = dataRemainingStaples2;
	}
	public void setMaxStaples2(int dataMaxStaples2) {
		maxStaples2 = dataMaxStaples2;
	}
	public void setColor2(String dataColor2) {
		color2 = dataColor2;
	}
	public int getRemainingStaples2() {
		if (maxStaples2 < remainingStaples2) {
		remainingStaples2 = maxStaples2;
		}
		return remainingStaples2;
	}
	public int getMaxStaples2() {
		if (maxStaples2 < remainingStaples2) {
			remainingStaples2 = maxStaples2;
			}
		return maxStaples2;
	
	}
	public void staple() {
		remainingStaples -= 1;
		
	}
	public String getColor() {
		return color;
	}
	public String getColor2() {
		return color2;
	}
	
	public String toString() {
		String str;
		str="\nRemaining Staples: " + remainingStaples + "\nMax Staples: " + maxStaples + "\nColor: " + color;
		if (color2.equals("")) {
		} else {
			str += "\n\nStapler 2:" + "\nColor: "+ color2 + "\nRemaining Staples: " + remainingStaples2 + "\nMax Staples: " + maxStaples2;
		}
		return str;
	}
	}