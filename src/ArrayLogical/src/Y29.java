package com.array.pdf;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// inserting an array into the second array at the specific position
public class Y29 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		//first array
		System.out.println("How many elements you want to insert in the first array ?");
		int length1 = sc.nextInt();
		int[] array1 = new int[length1];
		System.out.println("Enter the elements oft th first array one by one...");
		for(int i = 0; i < length1; i++)
		{
			array1[i] = sc.nextInt();
		}
		System.out.println("first array is : " + Arrays.toString(array1));
		
		//second array
		System.out.println("How many elements you want to insert in the first array ?");
		int length2 = sc.nextInt();
		int[] array2 = new int[length2];
		System.out.println("Enter the elements oft th first array one by one...");
		for(int i = 0; i < length2; i++)
		{
			array2[i] = sc.nextInt();
		}
		System.out.println("second array is : " + Arrays.toString(array2));
		
		//third array
		int length = array1.length + array2.length;
		int[] temp = array1;
		array1 = new int[length];
		for(int i = 0; i < temp.length; i++)
		{
			array1[i] = temp[i];
		}
		//System.out.println("first array is : " + Arrays.toString(array1));
		
		System.out.println("enter the position, which position you want to insert ?");
		int position = sc.nextInt();
		
		for(int i = array1.length - 1; i >= (position + array2.length); i--)
		{
			array1[i] = array1[i - array2.length];
		}
		//System.out.println("first array is : " + Arrays.toString(array1));
		
		for(int i = position; i < (position + array2.length); i++)
		{
			array1[i] = array2[i - position];
		}
		System.out.println("final array will be : " + Arrays.toString(array1));
		
	}
}
