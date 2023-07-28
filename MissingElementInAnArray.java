package week1day2.assignment;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		Arrays.sort(arr);
		int length = arr.length;

		for (int i = 0; i < length; i++) {
			if (i+1 != arr[i]) {
				System.out.println("The missing element is " + (i+1));
				break;
			}
		}

	}

}
