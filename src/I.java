class I 
{
	public static void main(String[] args) 
	{
		double d1 = new double[5.0];
		System.out.println("done");
	}
}


/*

E:\dec-batch-dev\arrays-dev\src>javac -d ../classes I.java
I.java:5: error: incompatible types: possible lossy conversion from double to int
                double d1 = new double[5.0];
                                       ^
I.java:5: error: incompatible types: double[] cannot be converted to double
                double d1 = new double[5.0];
                            ^
2 errors

*/