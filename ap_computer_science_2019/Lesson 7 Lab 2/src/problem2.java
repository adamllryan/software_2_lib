import java.util.Scanner;

/*Adam Ryan
 * Moga 3
 * 12 December 2019
 * Problem 2
 */
public class problem2 {

	public static void main(String[] args) {
		String str = "The frantic voice of Claudius Templesmith shouts above them. \"Stop! Stop! Ladies and "
				+ "gentlemen, I am pleased to present the victors of the 74th Hunger Games, Katniss Everdeen and "
				+ "Peeta Mellark! I give you - the tributes of District 12!\"";
		System.out.println("1.\t" + str.charAt(20));
		System.out.println("2.\t" + str.indexOf('m'));
		System.out.println("3.\t" + str.indexOf('c',44));
		System.out.println("4.\t" + str.indexOf("above"));
		System.out.println("5.\t" + str.indexOf("above",80));
		System.out.println("6.\t" + str.length());
		System.out.println("7.\t" + str.replace(' ', '\n'));
		System.out.println("8.\t" + str.substring(56));
		System.out.println("9.\t" + str.substring(60,69));
		System.out.println("10.\t" + str.toLowerCase());
		System.out.println("11.\t" + str.toUpperCase());
		str = " The frantic voice of Claudius Templesmith shouts above them. \"Stop! Stop! Ladies and "
				+ "gentlemen, I am pleased to present the victors of the 74th Hunger Games, Katniss Everdeen and "
				+ "Peeta Mellark! I give you - the tributes of District 12!\" ";
		System.out.println("12.\t" + str.trim());
		
		Scanner r = new Scanner(System.in);
		System.out.println("Input name: ");
		String n = r.nextLine();
		n = convertName(n);
		System.out.println(n);
		seperateNames(n);
		System.out.println("Enter a string: ");
		String s1 = r.nextLine();
		System.out.println("Enter a string: ");
		String s2 = r.nextLine();
		System.out.println(aS(s1,s2));
		r.close();
	}
private static String convertName(String nm) {
		
		String firstName = nm.trim();
		firstName = firstName.substring(0, firstName.indexOf(" "));
		System.out.println("First name: " + firstName + "\n");
		String lastName = nm.substring(nm.indexOf(firstName)+firstName.length()).trim();
		String str = lastName + ", " + firstName;
		return str;
	}
	private static void seperateNames(String nm) {
		String lastName = nm.substring(0, nm.indexOf(", "));
		String firstName = nm.substring(nm.indexOf(" ")).trim();
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
	}
	public static String aS(String s1, String s2) {
		String sv1 = s1;
		String sv2 = s2;
		String str = "";
		sv1 = sv1.trim();
		sv2 = sv2.trim();
		if (sv1.compareTo(sv2) > 0) {
			str = sv2 + " " + sv1;
		} else if (sv1.compareTo(sv2) == 0) 
		{
			str = "bruh them strings be the same doe";
		} else
		{str = sv1 + " " + sv2;}
		
		return str;
	}
}
/*1.	 
2.	32
3.	126
4.	49
5.	-1
6.	236
7.	The
frantic
voice
of
Claudius
Templesmith
shouts
above
them.
"Stop!
Stop!
Ladies
and
gentlemen,
I
am
pleased
to
present
the
victors
of
the
74th
Hunger
Games,
Katniss
Everdeen
and
Peeta
Mellark!
I
give
you
-
the
tributes
of
District
12!"
8.	hem. "Stop! Stop! Ladies and gentlemen, I am pleased to present the victors of the 74th Hunger Games, Katniss Everdeen and Peeta Mellark! I give you - the tributes of District 12!"
9.	 "Stop! S
10.	the frantic voice of claudius templesmith shouts above them. "stop! stop! ladies and gentlemen, i am pleased to present the victors of the 74th hunger games, katniss everdeen and peeta mellark! i give you - the tributes of district 12!"
11.	THE FRANTIC VOICE OF CLAUDIUS TEMPLESMITH SHOUTS ABOVE THEM. "STOP! STOP! LADIES AND GENTLEMEN, I AM PLEASED TO PRESENT THE VICTORS OF THE 74TH HUNGER GAMES, KATNISS EVERDEEN AND PEETA MELLARK! I GIVE YOU - THE TRIBUTES OF DISTRICT 12!"
12.	The frantic voice of Claudius Templesmith shouts above them. "Stop! Stop! Ladies and gentlemen, I am pleased to present the victors of the 74th Hunger Games, Katniss Everdeen and Peeta Mellark! I give you - the tributes of District 12!"
*/
