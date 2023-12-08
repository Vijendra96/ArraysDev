package com.array.pdf;

import java.util.Arrays;
import java.util.Scanner;

//	65. Find out the first non-repeated element in the given array
public class Y24 {
	public static void main(String[] args) {      
		int[] arr = {9, 4, 9, 6, 7, 4, 3};
		int n = arr.length;
		System.out.println("Array is given : " + Arrays.toString(arr));
		System.out.print("the non repeated elements of the above array are : " + firstNonRepeatedElement(arr, n));
	}

	private static int firstNonRepeatedElement(int[] arr, int n) {
		for(int i = 0; i < n; i++)
		{
			int j;
			for(j = 0; j < n; j++)
			{
				if(i != j && arr[i] == arr[j])
				{
					break;
				}
			}
			if(j == n)
			{
				
				return arr[i];
			}
		}
		return -1;
	}
}
