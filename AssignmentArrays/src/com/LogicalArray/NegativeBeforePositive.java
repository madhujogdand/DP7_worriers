package com.LogicalArray;
/*15. WAP to arrange the elements of an given array of integers where all negative 
integers appear before all the positive integers.*/
import java.util.Arrays;

public class NegativeBeforePositive {
	static int[] shiftNegative(int ar[]) {
		int newArr[] = new int[ar.length];
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				newArr[count] = ar[i];
				count++;
			}
		}
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] > 0) {
				newArr[count] = ar[i];
				count++;
			}

		}
		return newArr;
	}

	public static void main(String[] args) {
		int arr[] = { 2, -4, 3, 7, -8, 41, -9 };
		System.out.println("Before:" + Arrays.toString(arr));
		shiftNegative(arr);
		System.out.println("After:" + Arrays.toString(shiftNegative(arr)));
	}

}
