/*==========================================
   ■■■ 실행 흐르믜 컨트롤(제어문) ■■■
 - 반복문(for문) 실습 및 관찰
==========================================*/

// 1 부터 100 까지의 정수 중에서
// 4 의 배수만 출력하는 프로그램을 구현한다.
// 단, for 문을 활용해야 하며
// 한 줄에 5개씩만 출력할 수 있도록 한다.

// 실행 예)
//  4   8   12   16   20
// 24  28   32   36   40

public class Test057
{
	public static void main(String[] args)
	{
		// 내 풀이
/*
		for(int i = 1; i <= 100; i++)
		{	
			if(i % 4 == 0)
				System.out.printf("%5d", i);
			if(i % 20 == 0)
				System.out.println();
		}
*/
		for(int n = 4; n <= 100; n+=4)
		{
			System.out.printf("%4d",n);
			if(n % 20 == 0)
				System.out.println();
		}
	}
}