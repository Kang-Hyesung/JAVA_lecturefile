/*==========================================
   ■■■ 실행 흐르믜 컨트롤(제어문) ■■■
 - 반복문(while문) 실습 및 관찰
==========================================*/

// 사용자로부터 임의의 두 정수를 입력받아
// 입력받은 두 정수 중
// 작은 수 부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 100
// 두 번째 정수 입력 : 200
// >> 100 ~ 200 까지의 합 : xxxxx
// 계속하려면 아무 키나 누르세요....

// 첫 번째 정수 입력 : 1000
// 두 번째 정수 입력 : 2
// >> 2 ~ 1000 까지의 합 : xxxxx


// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 10
// >> 2 ~ 1000 까지의 합 : 10

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
		int a,b;			// 입력 받을 값
		int sum = 0;		// 누적합
		int c;				// flag
		
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		

		// 내 풀이

		if (a > b)
		{
			c = b;
			while(b <= a)
			{
				sum += b;
				b++;
			}
			System.out.printf(">> %d ~ %d 까지의 합 : %d\n", c, a, sum);
		}
		else if(a < b)
		{
			c = a;
			while(a <= b)
			{

				sum += a;
				a++;
			}
			System.out.printf(">> %d ~ %d 까지의 합 : %d\n", c, b, sum);
		}
		else
		{
			sum = a;
			System.out.printf(">> %d ~ %d 까지의 합 : %d\n", a, b, sum);
		}

		// 다른 풀이
		if(a > b)
		{
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		int i = a;

		while (a <= b)
		{	
			sum += a;
			a++;
		}
		System.out.printf(">> %d ~ %d 까지의 합 : %d\n", i, b, sum);
*/
		// 주요 변수 선언

		int n;
		int su1, su2;
		int result = 0;		// 누적합

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());

		// 입력받은 두 수의 크기 비교 및 자리 바꿈
		if(su1 > su2)
		{
			// 자리 바꿈
			su1 = su1 ^ su2;
			su2 = su2 ^ su1;
			su1 = su1 ^ su2;
		}

		// 반복 연산 수행
		// 반복 연산을 수행하기 전에
		// 작은 수를 따로 저장하여 루프 변수로 활용한다.
		// (결과 출력 과정에서 입력받은 작은 수가 필요한데...
		// 그 수를 반복 과정에서 사용하게 되면...
		// 원래 처음 입력된 값을 확인할 수 없기 때문에..)
		n  = su1

		while(n <= su2)
		{
			result += n;
			n++;
		}

		// 결과 출력
		System.out.printf(">> %d ~ %d 까지의 합 : %d\n", su1, su2);
		

	}
}
	