/*Adam Ryan
 * Moga 3
 * 26 Nov 2019
 * Test Bank Account
 */
public class TestBankAccount{

   public static void main (String[] args){
      BankAccount acct1, acct2, acct3;      

      // Instantiate and display account objects
      acct1 = new BankAccount("LeBron James",79258, 100.50);     
      acct2 = new BankAccount("Taylor Swift",99165, 1000.50); 
      acct3 = new BankAccount ("Charlie Brown",10798, 2.00);  

      	
      System.out.println(acct3.getName()); 
      String acctStatus;
      acctStatus = acct1.deposit(20000.00);
      if(acctStatus == null){
    		double acctBalance=acct1.getBalance();
    	 	System.out.println("Account after deposit= "+ acctBalance + "\n");	
    }  
      acctStatus = acct2.deposit(5025.85);
      if(acctStatus == null){
      		double acctBalance=acct2.getBalance();
      	 	System.out.println("Account after deposit= "+ acctBalance + "\n");	
      }     
      
      // Test other methods
      
      System.out.println("Account after withdrawal= " + acct1.withdraw(50.25));
      System.out.println(acct3.withdraw(800.00)); //exceeds balance ; an error message should be returned
      
      System.out.println("acct1 balance: " + acct1.getBalance());
      System.out.println(acct3.deposit(2.00));
      System.out.println(acct3.getBalance());
      System.out.println(acct2.withdraw(1000));
      System.out.println(acct1.deposit(-10));
  
      System.out.println();
      System.out.println(acct1 + "\n" + acct2 + "\n" + acct3);
      acct1.annualInterest();
      acct2.annualInterest();
      acct3.annualInterest();
      System.out.println("With Interest: \n" + acct1.toString() + "\n" + acct2.toString() + "\n" + acct3.toString());

   }
                       
}
/*-------------------Configuration: <Default>--------------------
 * 
Charlie Brown
Account after deposit= 20100.5

Account after deposit= 6026.35

Account after withdrawal= null
Error in withdraw: amount exceeds balance.
acct1 balance: 20050.25
null
4.0
null
Error in deposit: amount must be >=0


Name: 	LeBron James
Account Number: 79258
Balance: 	$20050.25


Name: 	Taylor Swift
Account Number: 99165
Balance: 	$5026.35


Name: 	Charlie Brown
Account Number: 10798
Balance: 	$4.0

With Interest: 

Name: 	LeBron James
Account Number: 79258
Balance: 	$20100.38


Name: 	Taylor Swift
Account Number: 99165
Balance: 	$5038.92


Name: 	Charlie Brown
Account Number: 10798
Balance: 	$4.01




 * */

