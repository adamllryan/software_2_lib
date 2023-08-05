package imagestuff;
import images.APImage;
import images.Pixel;
import java.util.Scanner;
public class edgedetecor {
	public static void main(String[] args) {
	Scanner r = new Scanner(System.in);
	System.out.println("Enter threshold: ");
	int threshold = r.nextInt();
	Scanner strdr = new Scanner(System.in);
	System.out.print("Enter an image file name: ");
	String file = strdr.nextLine();
	APImage im = new APImage(file);
	im.draw();
	
	int h = im.getHeight();
	int w = im.getWidth();
	APImage o = new APImage(w,h);
	
	for (int i = 0; i < h - 1; i++) {
		for (int j = 1; j < w; j++) {
			Pixel or = im.getPixel(j,i);
			Pixel le = im.getPixel(j-1,i);
			Pixel bo = im.getPixel(j,i+1);
			int oa = (or.getRed() + or.getGreen() + or.getBlue()) / 3;
			int la = (le.getRed() + le.getGreen() + le.getBlue()) / 3;
			int ba = (bo.getRed() + bo.getGreen() + bo.getBlue()) / 3;
			Pixel nP = o.getPixel(j, i);
			if (Math.abs(oa - la) <= threshold ||
					Math.abs(oa - ba) <= threshold){
					nP.setRed(255);
					nP.setGreen(255);
					nP.setBlue(255);
					}
					}
					o.draw();
			
			
			
			
		}
	}
}
