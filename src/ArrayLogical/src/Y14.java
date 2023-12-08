package com.array.pdf;

import java.util.Arrays;
import java.util.Scanner;

//	Find out the avg value from a secong half of given int array?
public class Y14 {
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
		int sum = 0;
		int avg = 0;
		for(int i = length / 2; i < length; i ++)
		{
			sum = sum + array[i];
		}
		avg = sum / 2;
		System.out.println("average of the second half of the array is " + avg);
	}
}
