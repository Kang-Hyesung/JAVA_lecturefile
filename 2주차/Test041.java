/*==========================================
   ■■■ 실행 흐르믜 컨트롤(제어문) ■■■
 - switch문 실습
==========================================*/

// 사용자로부터 1 부터 3까지의 정수 중 하나를 입력받아
// 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두 가지 방법으로 구현할 수 있도록 한다.

// 1.switch 문의 일반 모델을 사용하여 구현한다.
// 2.switch 문의 기본 모델을 사용하되,
// break 를 딱 한 번만 사용할 수 있도록 구현한다.

// 실행 예)
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 임의의 정수 입력(1~3) : 1
// ★
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 임의의 정수 입력(1~3) : 7
// 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		int n;		// 입력 받을 정수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.print("임의의 정수 입력(1~3) : ");
		n = Integer.parseInt(br.readLine());

		// 내 풀이


		switch(n)
		{
			case 1: System.out.print("★\n"); break;
			case 2: System.out.print("★★\n"); break;
			case 3: System.out.print("★★★\n"); break;
 			default: System.out.print("입력 오류~!!!\n");break;
		}


		switch(n)
		{
			case 3: System.out.print("★");
			case 2: System.out.print("★");
			case 1: System.out.print("★");
 			default: System.out.print("\n입력 오류~!!!\n");break;
		}

		// 수업
		switch(n)
		{
			case 1: System.out.print("★\n"); break;
			case 2: System.out.print("★★\n"); break;
			case 3: System.out.print("★★★\n"); break;
 			default: System.out.print("입력 오류~!!!\n"); //break 필수 아님
		}
		switch(n)
		{
			case 3: System.out.print("★");
			case 2: System.out.print("★");
			case 1: System.out.print("★");
					break;
 			default: System.out.print("\n입력 오류~!!!\n");
		}
}
