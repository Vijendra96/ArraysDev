class R 
{
	public static void main(String[] args) 
	{
		int[] x = {10, 20, 30};
		int[] y = {1, 2, 3};
		x = y;
		x[1] = y[1] + 200;
		System.out.println(y[1]);
	}
}


//202