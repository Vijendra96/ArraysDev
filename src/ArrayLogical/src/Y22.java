package com.array.pdf;
//	67. Find out element frequency in the given array?
public class Y22 {
	public static void main(String[] args) {

	          
	        //Initialize array   
	        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};   
	        //Array frArray will store frequencies of element  
	        int [] frArray = new int [arr.length];  
	        
	        
	        for(int i = 0; i < arr.length; i++)
	        {  
	            int count = 1;  
	            for(int j = i + 1; j < arr.length; j++)
	            {  
	                if(arr[i] == arr[j])
	                {
	                    count++;  
	                    //To avoid counting same element again  
	                    frArray[j] = -1;  
	                }  
	            }  
	            if(frArray[i] != -1)  
	            {
	            	frArray[i] = count; 
	            }
	        }  
	        
	        //Displays the frequency of each element present in array  
	        System.out.println("---------------------");  
	        System.out.println(" Element | Frequency");  
	        System.out.println("---------------------");  
	        for(int i = 0; i < frArray.length; i++)
	        {  
	            if(frArray[i] != -1)
	            {
	                System.out.println("    " + arr[i] + "    |    " + frArray[i]);
	            }
	        }  
	        System.out.println("---------------------");   
	}
}
