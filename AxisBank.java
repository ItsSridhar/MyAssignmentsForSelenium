package week3day1.assignment;

public class AxisBank extends BankInfo {

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		ab.saving();
		ab.fixed();
		ab.deposit();

	}

	public void deposit() {
		System.out.println("After Using Overriding Method for Deposit Account");
	}

}
