import java.util.Arrays;
class S 
{
	public static void main(String[] args) 
	{
		int[] x = {10, 20, 30, 40};
		System.out.println(Arrays.toString(x));   //print content of array
		test(x);    //pass by reference, x = y (x is becoming y)
		System.out.println(Arrays.toString(x));
	}
	static void test(int[] y)
	{
		y[1] = 500;
	}
}

/*
			[10, 20, 30, 40]
			[10, 500, 30, 40]
*/