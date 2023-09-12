public class Test022
{
	public static void main(String args[])
	{
		int a = 13, b = 7;
		int c, d, e;

		c = a & b; // 비트가 둘 다 1일때만 1
		d = a | b; // 비트가 둘 중 하나만 1이라도 1
		e = a ^ b; // 비트가 서로 다를때만 1

		System.out.printf("a & b : %d\n", c);
		System.out.printf("a | b : %d\n", d);
		System.out.printf("a ^ b : %d\n", e);
	}
}

// 실행 결과

/*
a & b : 5
a | b : 15
a ^ b : 10
*/

