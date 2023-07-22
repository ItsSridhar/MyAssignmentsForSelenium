package week1day1.assignment;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
//		boolean prime = true;
		int i;
		for (i = 2; i <= x - 1; i++) {
			if (x % i == 0) {
//				prime = false;
				break;
			}

		}
//		if (prime == false) {
		if (i==x-1) {
			System.out.println("The given input number " + x + " is not a prime number");
		} else {
			System.out.println("The given input number " + x + " is a prime number");
		}
	}

}
