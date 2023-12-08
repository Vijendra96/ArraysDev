package com.array.pdf;
//	21. Read all elements from an array in the reverse order?
import java.util.Arrays;
import java.util.Scanner;

public class Y15 {
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
		for(int i = length - 1; i >= 0; i--)
		{
			System.out.print(array[i] + " ");
		}
		//System.out.println("Arrays after reverse : " + Arrays.toString(array));
	}
}
