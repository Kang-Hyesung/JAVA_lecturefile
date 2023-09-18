/*==========================================
   ■■■ 실행 흐르믜 컨트롤(제어문) ■■■
 - break 실습
==========================================*/

// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1 ~ 100 범위 안에서만
// 가능하도록 처리한다.

// 실행 예)
//
// 임의의 정수 입력 : -10
// 
// 임의의 정수 입력 : 0
//
// 임의의 정수 입력 : 2023
//
// 임의의 정수 입력 : 10
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니까(Y/N)? : y
//
// 임의의 정수 입력 : 100
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니까(Y/N)? : N
// 계속하려면 아무 키나 누르세요   -> 프로그램 종료

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*	
		int n;		// 입력 받을 정수
		int sum = 0;
		char c;		// y,Y,n,N
		
		내 풀이 
		do
		{
			do
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
				
			}
			while (n < 1 || n > 100);
			sum = 0;
			for(int i = 1; i <= n; i++)
				sum += i;

			System.out.printf(">> 1부터 %d 까지의 합 : %d\n", n, sum);
			System.out.print("계속하시겠습니까(Y/N)? : ");
			c = (char)System.in.read();
			System.in.skip(2);

		}
		while (c == 'y' || c == 'Y');

		수업-----------------------------------------------------------
*/
		// 누적합 변수의 초기화 위치 check
		//int n, s = 0, i;		// n 입력값 s 누적합 i 1부터 1씩 n만큼 증가
		int n,i,s;

		char ch;
		// 프로세스를 계속 진행할지 말지의 여부를 담아둘 변수
		
		while(true)
		{
			// 무한 루프
			do
			{
				System.out.print("\n임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n < 1 || n > 100);

			// 테스트
			// System.out.println("유효한 정수 입력 완료");

			// 누적합 변수의 초기화 위치 check
			s = 0;

			for(i = 1; i <= n; i++)
				s += i;		// 누적합 연산

			System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, s);
			
			System.out.print("계속하시겠습니까(Y/N)? : ");
			ch = (char)System.in.read();	// 계속할지 여부
			
			// 그만이면 빠져나감
			//if (ch == 'n' || ch == 'N')

			if (ch != 'y' && ch != 'Y')		// Y 또는 y 입력한게 아닌거 맞아?
			// || 로 하면 y를 입력했을 때 대문자 Y가 아닌거 맞으므로 true로 처리될 수 있다.
			{
				// 반복문을 멈추고 빠져나갈 수 있는 코드 작성 필요
				// 즉 위와 같은 의사 표현을 했다면
				// 그동안 수행했던 반복문을 멈추고 빠져나가야 한다.
				break;
				// 멈춘다 + 빠져나간다
			}// end if

			// 엔터값(\r\n) 처리
			System.in.skip(2);
			
			
		
		}// end while(true)
	
	}
}