package com.array.pdf;

import java.util.Arrays;
import java.util.Scanner;

//	Find out the min value from all even indexed elements from a given int array?
public class Y3 {
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
		int minElement = array[0]; 
		for(int i = 0; i < length; i ++)
		{
			if(i % 2 == 0)
			{
				if(array[i] < minElement)
				{
					minElement = array[i];
				}
			}
		}
		System.out.println("min element is " + minElement);
	}
}
