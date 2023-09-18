/*==========================================
   ■■■ 실행 흐르믜 컨트롤(제어문) ■■■
 - 반복문(while문) 실습 및 관찰
==========================================*/

// ○ 과제
//	  사용자로부터 임의의 정수를 입력받아
//	  1 부터 입력받은 그 정수까지의
//	  전체 합과, 짝수의 합과, 홀수의 합을
//    각각 결과값으로 연산하여 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 396
// >> 1 ~ 396 까지 정수의 합 : xxxxx
// >> 1 ~ 396 까지 짝수의 합 : xxxx
// >> 1 ~ 396 까지 홀수의 합 : xxxx
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;											// 입력받을 값
		int sum = 0, oSum = 0, eSum = 0;				// 정수합, 홀수합, 짝수합

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		int i = 1;
		while (i <= n)
		{
			sum += i;									// 정수의 합
			if(i % 2 == 0)								// i가 짝수라면
				eSum += i;								// 짝수를 모아 누적합
			else										// i가 짝수가 아니라면
				oSum += i;								// 홀수를 모아 누적합
			i++;										// i를 1 더해준다
		}
		System.out.printf(">> 1 ~ %d 까지 정수의 합 : %d\n", n, sum);
		System.out.printf(">> 1 ~ %d 까지 짝수의 합 : %d\n", n, eSum);
		System.out.printf(">> 1 ~ %d 까지 홀수의 합 : %d\n", n, oSum);

	}
}
