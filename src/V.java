class V 
{
	public static void main(String[] args) 
	{
		int[][] x = new int[3][];
		x[0] = new int[2];
		x[1] = new int[4];
		x[2] = new int[3];
		x[0][1] = 10;
		x[1][2] = 300;
		x[2][0] = 50;
		System.out.println(x[0][0]);
		System.out.println(x[0][1]);
		System.out.println(x[1][0]);
		System.out.println(x[1][1]);
		System.out.println(x[1][2]);
		System.out.println(x[1][3]);
		System.out.println(x[2][0]);
		System.out.println(x[2][1]);
		System.out.println(x[2][2]);
	}
}


/*

0
10
0
0
300
0
50
0
0

*/