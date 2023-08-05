package test;
// tester for free response Car class
public class TestCar
{    
    public static void main(String[] args)
    {
    	cAR myMini= new cAR(25, 600, 20, 20); //25 mpg, 600 milesonCar, 20 gallon tank, has 20 gallons in it
    	System.out.println("My Mini has: " + myMini.getGasInTank() + " gallons in the tank");
    	System.out.println("Does the car have enough gas to travel 300 miles? " + myMini.enoughGas(300.0));
    	
    	System.out.println("A 300 mile trip would require " + myMini.gasNeeded(300.0) + " gallons.");
    	System.out.println("Drive the car 300 miles. ");
    	myMini.drive(300.0);
    	System.out.println("My Mini now has: " + myMini.getGasInTank() + " gallons in the tank");
    	System.out.println("Current mileage on the car is: " + myMini.getMileage());
    	
    	System.out.println();
    	System.out.println("Does the car have enough gas to travel 300 more miles? " + myMini.enoughGas(300.0));
    	System.out.println("Drive the car 300 miles. ");
    	myMini.drive(300.0);
    	
    	System.out.println("My Mini now has: " + myMini.getGasInTank() + " gallons in the tank.");
    	System.out.println("Current mileage on the car is: " + myMini.getMileage());
    	System.out.println();
    	
    	myMini.getGas();
    	System.out.println("Go to the Gas Station and fill up!");
    	System.out.println("My Mini now has: " + myMini.getGasInTank() + " gallons in the tank");
    	
   		System.out.println();
    	System.out.println("Drive the car 100 miles. ");
    	myMini.drive(100.0);
    	System.out.println("My Mini now has: " + myMini.getGasInTank() + " gallons in the tank.");
    	myMini.getGas();
    	System.out.println("Do I need to go to the Gas Station and fill up? NO");
    	System.out.println("My Mini still has: " + myMini.getGasInTank() + " gallons in the tank");
    }
}
/*My Mini has: 20.0 gallons in the tank
Does the car have enough gas to travel 300 miles? true
A 300 mile trip would require 12.0 gallons.
Drive the car 300 miles. 
My Mini now has: 8.0 gallons in the tank
Current mileage on the car is: 900.0

Does the car have enough gas to travel 300 more miles? false
Drive the car 300 miles. 
My Mini now has: 0.0 gallons in the tank.
Current mileage on the car is: 1100.0

Go to the Gas Station and fill up!
My Mini now has: 20.0 gallons in the tank

Drive the car 100 miles. 
My Mini now has: 16.0 gallons in the tank.
Do I need to go to the Gas Station and fill up? NO
My Mini still has: 16.0 gallons in the tank

*/