package com.lab2DArray;

import java.util.Arrays;
import java.util.Random;

/*29. WAP to shuffle array. Means e.g. arr[] = [5, 6, 23, 67, 39, 10, 2].
 * So output array is [6, 23, 67, 39, 10, 2, 5].*/
public class ShuffleArray {

	public static void main(String[] args) {
		int arr[] = { 5, 6, 23, 67, 39, 10, 2 };
		System.out.println("Before:" + Arrays.toString(arr));
		
		Random r = new Random();
		int j=r.nextInt(arr.length);
		for (int i = 0; i < arr.length; i++)
		{
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		System.out.println("After Shuffle:" + Arrays.toString(arr));
	}

}
