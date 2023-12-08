package com.array.pdf;
//Combine two arrays and develop a third array. Consider element by element while combining
import java.util.Arrays;
import java.util.Scanner;

public class Y20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//for first array
		System.out.println("How many elements you want to insert int he first array ?");
		int len1 = sc.nextInt();
		int[] array1 = new int[len1];
		System.out.println("enter the elements of the first array one by one ...");
		for(int i = 0; i < len1; i++)
		{
			array1[i] = sc.nextInt();
		}
		
		//for second array
		System.out.println("How many elements you want to insert int he seccond array ?");
		int len2 = sc.nextInt();
		int[] array2 = new int[len1];
		System.out.println("enter the elements of the second array one by one ...");
		for(int i = 0; i < len2; i++)
		{
			array2[i] = sc.nextInt();
		}
		
		//for the third array
		int[] array3 = new int[len1 + len2];
		int k = 0;
		
		//storing the first array into the third array
		for(int i = 0; i < len1; i++, k++)
		{
			array3[k] = array1[i];
		}
		
		//storing the second array into the third array
		for(int i = 0; i < len2; i++, k++)
		{
			array3[k] = array2[i];
		}
		
		//to print the third array
		int[] temp = array3;
		array3 = new int[len1 + len2];
		for(int i = 0; i < (len1 + len2); i++)
		{
			array3[i] = temp[i];
		}
		
		System.out.println("the content of the first array : " + Arrays.toString(array1));
		System.out.println("the content of the first array : " + Arrays.toString(array2));
		System.out.println("the content of the first array : " + Arrays.toString(array3));
	}
}
