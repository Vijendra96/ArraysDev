package com.array.pdf;
//	 Find out the avg value from all odd indexed elements from a given int array?

import java.util.Arrays;
import java.util.Scanner;

public class Y6 {
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
		double sum = 0;
		double avg = 0;
		for(int i = 0; i < length; i ++)
		{
			if(i % 2 == 1)
			{
				sum = sum + array[i];
			}
		}
		avg = sum / 2;
		System.out.println("average value of the odd indexed number is " + avg);
	}
}
