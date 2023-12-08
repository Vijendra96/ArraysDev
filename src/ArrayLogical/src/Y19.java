package com.array.pdf;

import java.util.Arrays;
import java.util.Scanner;

//	left shift by one 
/*
 		int[] elements = {100, 20, 1, 300, 4, 500, 0, 400, 35};
 			//			   0   1   2   3   4   5   6   7    8
 			 
		  final output 
		  int[] elements = {20, 1, 300, 4, 500, 0, 400, 35, 100};
 			
 */
public class Y19 {
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
		System.out.println(Arrays.toString(array));
		int first = array[0];
		for(int i = 0; i < length - 1; i++)
		{
			array[i] = array[i + 1];
		}
		array[length - 1] = first;
		System.out.println(Arrays.toString(array));
	}
}
