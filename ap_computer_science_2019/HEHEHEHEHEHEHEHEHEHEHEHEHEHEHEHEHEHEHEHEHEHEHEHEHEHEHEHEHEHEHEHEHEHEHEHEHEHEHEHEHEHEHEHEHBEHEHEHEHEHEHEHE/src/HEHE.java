
public class HEHE {
	public static void main(String[] args) {
//		String s1="Zulu";
//		String s2="Bravo";
//		String s3="Alpha";
//		int i1 = s1.compareTo(s2);
//		System.out.println(i1);
//		int i2 = s2.compareTo(s3);
//		System.out.println(i2);
		String str = "The rain in Spain falls mainly on the plain";
//		1.
//		a. 3
//		b. 8
//		c. rain in Spain falls mainly on the plain
//		d. rain
//		e. The
//		rain
//		in
//		Spain
//		falls
//		mainly
//		on
//		the
//		plain
//		2a.
		str.replace(' ','\n');
		System.out.println(str);
		System.out.println(str.indexOf("the"));
		System.out.println(str.indexOf("the", str.length()/2));
		int count = 0;
		String checkFor = "the";
		int i=0;
		int j=0;
		while (i>=0) {
			
			i=str.indexOf(checkFor,i);
			count++;
			if (i != -1) {
				i++;
			}
			System.out.println("So far there are this many instances of the word \"" + checkFor + "\": " + count);
		}
	}
}
