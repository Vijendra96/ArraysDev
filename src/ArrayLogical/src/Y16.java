package com.array.pdf;

import java.util.Arrays;
import java.util.Scanner;

//	31. Reverse only second half of the elements of given array?
public class Y16 {
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
		 for(int i = (length/2), j = length - 1; i < j; i++, j--)
	      {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	      }

	   System.out.println("The Output Is:");
	   for(int i = 0; i < length; i++)
	     {
	        System.out.print(" "+ array[i]);
	     }
	}
}
