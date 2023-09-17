/*==========================================
   ■■■ 실행 흐르믜 컨트롤(제어문) ■■■
 - if 문
 - if ~ else 문 실습
==========================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//    분기 방향을 정하기 위해 사용하는 제어문에는
//    if문, if~else문, 조건연산자, 복합if문(if문 중첩), switch문이 있다.

// 2. if문은 if 다음의 조건이 참(true)일 경우
//    특정 문장을 수행하고자 할 때 사용되는 구문이다.

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 홀수인지, 짝수인지, 영인지 확인하여
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 임의의 정수 입력 : 14
// 14 -> 짝수
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 임의의 정수 입력 : 0
// 0 -> 영
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test032
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 내 풀이
		int n = 0;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		String ans; // 답

		if(n % 2 == 0 && n > 0)
		{
			ans = "짝수";
		}
		else if(n % 2 == 1)
		{
			ans = "홀수";
		}
		else
		{
			ans = "영";
		}

		System.out.printf("%d -> %s\n", n, ans);


		// 수업
		
		if(n == 0)
		{
			ans = "영";
		}
		else if(n % 2 == 1)
		{
			ans = "홀수";
		}
		else
		{
			ans = "짝수";
		}


		String result = "판정불가";
		if(n == 0)
		{
			ans = "영";
		}
		else if(n % 2 == 1)
		{
			ans = "홀수";
		}
		else if
		{
			ans = "짝수";
		}

		System.out.println(n + " -> " + result);

	}
}