class W 
{
	public static void main(String[] args) 
	{
		int[][] x = new int[2][3];
		System.out.println(x[0][3]);
	}
}


//compile successfully

/*

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at W.main(W.java:6)
*/






