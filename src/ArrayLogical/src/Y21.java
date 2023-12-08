package com.array.pdf;

import java.util.Arrays;
import java.util.Scanner;

//Combine two arrays and develop a third array in a sorting way. Consider element by element while combining
public class Y21 {
	 public static void main(String[] args)
	   {
		 
	      Scanner scan = new Scanner(System.in);
	      System.out.print("Enter the size of first array: ");
	      int x = scan.nextInt();
	      int[] a = new int[x];
	      System.out.print("Enter " +x+ " elements for first array: ");
	      for(int i = 0; i < x; i++)
	      {
	    	  a[i] = scan.nextInt();
	      }
	      
	      System.out.print("\nEnter the size of second array: ");
	      int y = scan.nextInt();
	      int[] b = new int[y];
	      System.out.print("Enter " +y+ " elements for second array: ");
	      for(int i=0; i < y; i++)
	      {
	    	  b[i] = scan.nextInt();
	      }
	      
	      // merging both the entered arrays into the third array
	      int[] merge = new int[x + y];
	      int i = 0;
	      for(i = 0; i < x; i++)
	      {
	    	  merge[i] = a[i];
	      }
	      for(int j = 0; j < y; j++)
	      {
	    	  merge[i++] = b[j];
	      }
	      
	      // sorting the merged array
	      //System.out.println("i = " + i);
	      for(i = 0; i < (x + y - 1); i++)
	      {
	         for(int j = 0; j < (x + y -1); j++)
	         {
	            if(merge[j] > merge[j+1])
	            {
	               int temp = merge[j];
	               merge[j] = merge[j + 1];
	               merge[j + 1] = temp;
	            }
	         }
	      }
	      System.out.println("the content of the first array : " + Arrays.toString(a));
		System.out.println("the content of the first array : " + Arrays.toString(b));
	      // printing the sorted merged array
	      System.out.println("\nThe merged array is: ");
	      for(i = 0; i < (x + y); i++)
	         System.out.print(merge[i]+ " ");
	   }
	}