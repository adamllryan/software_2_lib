package imagestuff;
import images.*;
import java.util.Scanner;
public class bnwconverter {
	
	public static void main(String[]args){
		Scanner reader = new Scanner(System.in);
		APImage image = new APImage("jpeg.jpg");
		image.draw();
		for (Pixel p : image){
		int red = p.getRed();
		int green = p.getGreen();
		int blue = p.getBlue();
		int average = (red + green + blue) / 3;
		if (average < 128){
		p.setRed(0);
		p.setGreen(0);
		p.setBlue(0);
		}else{
		p.setRed(255);
		p.setGreen(255);
		p.setBlue(255);
		}
		}
		System.out.print("Press return to continue:");
		reader.nextLine();
		image.draw();
		reader.close();
	}
	}

