class F 
{
	public static void main(String[] args) 
	{
		int[] elements = new int[4];
		System.out.println(elements[0]);
		System.out.println(elements[1]);
		System.out.println(elements[2]);
		System.out.println(elements[3]);
		System.out.println(elements[4]);
	}
}

/*

0
0
0
0
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at F.main(F.java:10)

*/