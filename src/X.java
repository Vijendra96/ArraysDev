class X 
{
	public static void main(String[] args) 
	{
		int[][] x = new int[5][];
		System.out.println(x[0][0]);
	}
}


//compile successfull
//inner array is not define, and every array is derived datatype so every array is null, so it will give NullPointerException 












/*

	Exception in thread "main" java.lang.NullPointerException: Cannot load from int array because "<local1>[0]" is null
        at X.main(X.java:6)

*/