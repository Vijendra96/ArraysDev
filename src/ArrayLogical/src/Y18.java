package com.array.pdf;

import java.util.Arrays;
import java.util.Scanner;

//	36. Do right shift by one for elements of given array?
public class Y18 {
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
		int lastElement = array[length - 1];
		System.out.println(lastElement);
		for(int i = length - 1; i > 0; i--)
		{
			array[i] = array[i - 1];
		}
		array[0] = lastElement;
		System.out.println("After right sift by one, the array will be : " + Arrays.toString(array));
	}
}
