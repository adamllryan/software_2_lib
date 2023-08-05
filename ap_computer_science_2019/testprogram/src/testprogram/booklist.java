/*
Adam Ryan 3
Moga Moga
29 Aug 2019
Test Program
Tests book class
*/
package testprogram;

public class booklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book one = new Book();
		Book two = new Book();
		one.setTitle("Fundamentals of Java");
		two.setTitle("Microsoft Visual Basic 2005 BASICS");
		one.setNumPages(619);
		two.setNumPages(459);//chooses book two and sets the number of pages to 459
		one.setAuthor("not pat li");//chooses book one and sets 
		two.setAuthor("Pat li");
		one.setDate(1917);
		//calls for the data of the books to be printed
		two.setDate(2001);
		//
		one.setEdition(4);
		two.setEdition(2);
		System.out.println(one);
		System.out.println(two);
	}

}
