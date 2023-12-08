class E 
{
	public static void main(String[] args) 
	{
		int[] elements = new int[5];
		System.out.println(elements[0]);
		System.out.println(elements[1]);
		System.out.println(elements[2]);
		System.out.println(elements[3]);
		System.out.println(elements[4]);
		System.out.println("----------------");

		elements[0] = 10;
		elements[1] = 1;
		elements[2] = 100;
		elements[3] = 23;
		elements[4] = 45;

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
0
----------------
10
1
100
23
45

*/