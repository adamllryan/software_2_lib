package test;
/*Adma Ryan
 * Moga 3
 * frq questionsh
 */

public class cAR {
	double mpg;
	double mileage;
	double gasInTank;
	double tankCap;
	public cAR (double miles, double milesOnCar, double gasTankHolds, double gasTankHas) {
		mpg = miles;
		mileage = milesOnCar;
		tankCap = gasTankHolds;
		gasInTank = gasTankHas;
	}
	public double gasNeeded(double numMiles) {
		double gas = numMiles / mpg;
		return gas;
	}
	public double getGasInTank() {
		return gasInTank;
	}
	public double getMileage() {
		return mileage;
	}
	public boolean enoughGas(double numMiles) {
		if (gasInTank >= gasNeeded(numMiles)) return true;
		else return false;
	}
	public void getGas() {
		if (gasInTank < tankCap / 2) gasInTank = tankCap;
	}
	public void drive(double numMiles) {
		if (enoughGas(numMiles)) 
			{mileage+=numMiles; 
			gasInTank-=numMiles/mpg;}
		else {
			mileage +=gasInTank * mpg;
			gasInTank = 0;
		}
		
	}
}
