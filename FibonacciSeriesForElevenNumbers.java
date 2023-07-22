package week1day1.assignment;

public class FibonacciSeriesForElevenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Fibonacci series for the first 11 numbers are ");
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int c = 0;

		for (int d = 0; d <= 9; d++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}

		System.out.println();
	}

}


