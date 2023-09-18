/*==========================================
   ■■■ 실행 흐르믜 컨트롤(제어문) ■■■
 - 반복문(while문) 실습 및 관찰
==========================================*/

// 사용자로부터 임의의 정수를 입력받아
// 입력받은 정수가 소수인지... 아닌지... 를 판별하여
// 결과를 출력하는 프로그램을 구현한다.

// 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도
//		  나누어 떨어지지 않는 수.
//		  단, 1은 소수 아님.

// 실행 예)
// 임의의 정수 입력 : 10
// 10 -> 소수 아님

// 임의의 정수 입력 : 11
// 11 -> 소수
// 계속하려면 아무 키나 누르세요...

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//내 풀이

		int n = 0;		// 입력 받을 숫자

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		if(n == 2)
		{
			System.out.println(n + " → 소수 ");
			return;
		}
		
		int i = 1;
		while(i < n)
		{
			i++;

			if(n % i == 0 || n == 1)
			{
				System.out.println(n + " →  소수 아님");
				break;
			}
			else if( i == n / 2)
			{
				System.out.println(n + " → 소수 ");
				break;
			}
		}
		// 수업 ----------------------------------------------------------
/*
		// 주요 변수 선언
		int num;		// 사용자의 입력값을 담아낼 변수
		int n = 2;		// 입력값을 대상으로 나눗셈 연산을 수행할 변수
						// 2부터 시작해서 1씩 증가
						// ex) 입력값 27 -> n : 2 3 4 5 6 7 8 .. 25 26

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());
		
		// 어떤 값을 입력받은 상태인지 알 수 없지만
		// 이 입력값을 소수로 간주한다.
		// String result = "소수다";
		boolean flag = true;			// num은 소수일 것이다.
		
		while (n < num)
		{
			// 테스트
			//System.out.println("반복문 수행 -> n : " + n);

			// 확인 연산
			//-- n 으로 num 을 나누어 떨어지는지 확인 -> 나머지가 0인지 확인
			if(num % n == 0)	// 즉, 나누어 떨어지는 상황
			{
				flag = false;
				break;			// 멈추고 빠져나간다
								// break를 감싸는 가장 가까운 반복문
			}
			n++;
		}

		// 테스트
		// System.out.println("flag : " + flag);


		// 결과 출력
		// (최종 결과를 출력하기 전에 추가 확인 -> 1인지 아닌지에 대한 추가 검토)
		if(flag == true && num != 1) //flag 자체가 true 혹은 false이기 때문에 == true는 필요없다.
		{
			// 소수
			System.out.printf("%d → 소수\n", num);
		}
		else
		{
			// 최종적으로 소수 아님
			System.out.printf("%d → 소수 아님\n", num);
		}
*/
// 결과 실행
/*
임의의 정수 입력 : 991
991 → 소수
계속하려면 아무 키나 누르십시오 . . .
*/
	}
}