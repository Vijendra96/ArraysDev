package com.array.pdf;

public class Y28 {
	private static void printUncommonElements(int[] array1, int[] array2) {
		int length1 = array1.length;
		int length2 = array2.length;
		int i = 0;
		int j = 0;
		while(i < length1 && j < length2)
		{
			if(array1[i] < array2[j])
			{
				System.out.println(array1[i++]);
			}
			else if(array1[i] > array2[j])
			{
				System.out.println(array2[j++]);
			}
			else 
			{
				i++;
				j++;
			}
		}
		while(i < length1 && array1[i] != array2[j])
		{
			System.out.println(array1[i++]);
			i--;
		}
		while(j < length2 && array2[j] != array1[i])
		{
			System.out.println(array2[j++]);
		}
	}
	public static void main(String[] args) {
		int[] array1 = {1, 3, 8, 9, 17, 18};
		int[] array2 = {1, 8, 5, 12, 18, 19, 100, 120};
		printUncommonElements(array1, array2);
		
	}
}
