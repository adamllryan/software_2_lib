/*Adam Ryan
 * Moga 3
 * 7 November 2019
 * Bank Account
 */
public class BankAccount {
	String ownerName;
	int accountNumber;
	double accountBalance;
	private final double RATE=.0025;
	public  BankAccount(String owner, int number, double balance) {
		ownerName = owner;
		accountNumber = number;
		accountBalance = balance;
	}
	public String getName() {
		return ownerName;
	}
	public String deposit(double deposit) {
		if (deposit >= 0) {
		accountBalance += deposit;
		return null;
		} else {
			return "Error in deposit: amount must be >=0";
		}
	}
	public double getBalance() {
		return accountBalance;
	}
	public String withdraw(double withdrawal) {
		if (withdrawal <= accountBalance) {
			accountBalance -= withdrawal;
			return null;
			} else {
				return "Error in withdraw: amount exceeds balance.";
			}
	}
	public String toString() {
		String str = "\nName: \t" + ownerName + "\nAccount Number: " + accountNumber + "\nBalance: \t$" + accountBalance + "\n";
		return str;
	}
	public double annualInterest() {
		accountBalance *= (1 + RATE);
		accountBalance *= 100;
		accountBalance = Math.round(accountBalance);
		accountBalance /= 100;
		return accountBalance;
	}
}
