package com.array.pdf;
//65. Find out the elements which are not duplicates in the given array
public class Y25 {
	public static void main(String[] args) 
	{
		int nums[] = {1,2,-1,1,3,1, 2, 3, -1, 0};
		System.out.println("Non-repeating numbers are: ");
		findNonRepeatingElement(nums);
	}
	static void findNonRepeatingElement(int nums[]) 
	{
	    boolean duplicate = false; 
	    for(int i = 0; i < nums.length; i++) 
	    {
	    	duplicate = false;
	        for(int j = 0; j < nums.length; j++) 
	        {
	            if(i != j && nums[i] == nums[j]) 
	            {
	            	duplicate = true;
	                break;
	            }
	        }
	        if(!duplicate) System.out.print(nums[i]+" ");
	    }
	}
}
