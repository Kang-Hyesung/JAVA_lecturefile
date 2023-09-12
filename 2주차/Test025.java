/*===============================
   ■■■ 연산자(Operator) ■■■
 - 비트 단위 연산자
================================*/

public class Test025
{
	public static void main(String[] args)
	{
		int x = 128;	

		System.out.printf("x << 3 : %d\n", x << 3);
		System.out.printf("x * 8 : %d\n", x * 8); // 8  ==  2의 3제곱

		System.out.printf("x >> 3 : %d\n", x >> 3); 
		System.out.printf("x / 8 : %d\n", x / 8);

		System.out.printf("x << 24 : %d\n", x << 24); 
		// 10000000 00000000 00000000 00000000 -> -21억쯤 int형이 표현할 수 있는 가장 작은 값

		System.out.printf("x << 25 : %d\n", x << 25); // 0
		System.out.printf("x << 26 : %d\n", x << 26); // 0
		System.out.printf("x << 31 : %d\n", x << 31); // 0 

		System.out.printf("x << 32 : %d\n", x << 32);
		//== x << 32 : 128



// 실행 결과
/*
x << 3 : 1024
x * 8 : 1024
x >> 3 : 16
x / 8 : 16
x << 24 : -2147483648
*/
	}
}
