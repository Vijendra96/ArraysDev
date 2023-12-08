class H 
{
	public static void main(String[] args) 
	{
		int[] elements = new int[-10];
		System.out.println("done");
	}
}

//compile successfully



/*

E:\dec-batch-dev\arrays-dev\src>java -cp ../classes H
Exception in thread "main" java.lang.NegativeArraySizeException: -10
        at H.main(H.java:5)

*/