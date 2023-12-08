package com.array.pdf;
//	61. Find out common elements from two given arrays?

import java.util.Arrays;
import java.util.Scanner;

public class Y27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want to insert in the first Array?");
		int length1 = sc.nextInt();
		int array1[] = new int[length1];
		System.out.println("please insert the elements one by one ...");
		for(int i = 0; i < length1; i++)
		{
			array1[i] = sc.nextInt();
		}
		
		System.out.println("How many elements you want to insert in the second Array?");
		int length2 = sc.nextInt();
		int array2[] = new int[length2];
		System.out.println("please insert the elements one by one ...");
		for(int i = 0; i < length2; i++)
		{
			array2[i] = sc.nextInt();
		}
		
		for(int i = 0; i < length1; i++)
		{
			for(int j = 0; j < length2; j++)
			{
				if(array1[i] == array2[j])
				{
					System.out.print(array1[i] + " ");
				}
			}
		}
	}
}
