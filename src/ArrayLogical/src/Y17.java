package com.array.pdf;

import java.util.Arrays;
import java.util.Scanner;

//	31. Reverse only first half of the elements of given array?
public class Y17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to insert ?");
		int length = sc.nextInt();
		int[] array = new int[length];
		System.out.println("enter the elements one by one ");
		for(int i = 0; i < length; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("Arrays is : " + Arrays.toString(array));
		 for(int i = 0, j = (length / 2 - 1); i < j; i++, j--)
	      {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	      }
		 System.out.println(Arrays.toString(array));
	}
}
