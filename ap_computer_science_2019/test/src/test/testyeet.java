package test;

public class testyeet {
	public static void main(String[] args) {
		String[] a={"Summer","Spring","snow","sunshine"};
			for (int i=0;i<4;i++) {
				for (int j=0;j<3-i;j++) {
					if (a[i].compareTo(a[j])>0) {
						String t = "";
						t = a[i];
						a[i]=a[j];
						a[j]=t;}}}
			for (int k = 0;k<a.length;k++) {
				System.out.println(a[k]);}
	
			String s1 = "MAD";
			String s2 = "MADAM";
			System.out.println(s1.indexOf(s2) + " ");
			System.out.println(s2.indexOf(s1));
	
	
	
	
	}}
