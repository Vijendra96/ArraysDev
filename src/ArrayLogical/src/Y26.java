package com.array.pdf;

import java.util.Arrays;
import java.util.Scanner;

//65. Find out the elements which are not duplicates in the given array
public class Y26 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//for first array
		System.out.println("How many elements you want to insert int he first array ?");
		int length = sc.nextInt();
		int[] array = new int[length];
		System.out.println("enter the elements of the first array one by one ...");
		for(int i = 0; i < length; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("the array is : " + Arrays.toString(array));
		System.out.println("Non-repeating numbers are: ");
	    findNonRepeatingElement(array, length);
	}
	static void findNonRepeatingElement(int array[], int length) 
	{
		
	    //boolean duplicate; 
	    for(int i = 0; i < length; i++) 
	    {
	    	int count = 0;
	        for(int j = 0; j < length; j++) 
	        {
	            if(array[i] == array[j]) 
	            {
	            	count++;
	                //break;
	            }
	        }
	        if(count == 1)
        	{
	        	System.out.print(array[i] + " ");
        	}
	    }
	}
}
