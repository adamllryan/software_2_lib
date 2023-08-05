package testprogram;

public class frqtest1 {
	public static void main(String[] args) {
		
		int num = 60,  min = 40,  max = 50;
		
		boolean isBigger;

		boolean isSmaller;

		boolean inRange;

		if (num < max)

		{

		isSmaller = true;

		}

		else

		{

		isSmaller = false;

		}

		if (num > min)

		{

		isBigger = true;

		}

		else

		{

		isBigger = false;

		}

		if (isBigger == isSmaller)

		{

		inRange = true;

		}

		else

		{

		inRange = false;

		}
		System.out.print(inRange);
	}
}
