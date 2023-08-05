package testprogram;

public class Book {
	private String title;
	private int numPages;
	private int numDate;
	private String author;
	private int edition;
	public Book() {
		title = "";
		numPages = 0;
		numDate = 0;
		author = "";
		edition = 0;
	}
	public void setTitle(String dataTitle) {
		title = dataTitle;
	}
	public void setNumPages(int dataNumPages) {
		numPages=dataNumPages;
	}
	public String getTitle() {
		return title;
	}
	public int getNumPages() {
		return numPages;
	}
	public void setDate(int dataDate) {
		numDate = dataDate;
	}
	public void setAuthor(String dataAuthor) {
		author = dataAuthor;
	}
	public int getNumDate() {
		return numDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setEdition(int dataEdition) {
		edition = dataEdition;
	}
	public int getEdition() {
		return edition;
	}
	public String toString() {
		String str;
		str="\nTitle: " + title + "\nNumber of Pages: " + numPages + "\nAuthor: " + author + "\nYear Published: " + numDate + "\nEdition: " + edition;
		return str;
	}
}
