/*================================
   ■■■ 클래스와 인스턴스 ■■■
=================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1 부터 입력받은 수 까지의 합을 연산하여
// 결과값을 출력하는 프로그램을 구현한다.

// 단, 지금까지처럼 main() 메소드에 모든 기능을 적용하는 것이 아니라
// 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// (Hap) 클래스 설계
// 또한, 데이터 입력 처리 과정에서 BufferedReader 의 readLine() 을 사용하며,
// 입력 데이터가 1보다 작거나 1000보다 큰 경우
// 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

// 실행 예)
// 임의의 정수 입력(1~1000) : 1200
// 임의의 정수 입력(1~1000) : -50
// 임의의 정수 입력(1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
/*		내 풀이
	int n,sum;

	void input() throws IOException
	{
		do
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 정수 입력(1~1000) : ");
		n = Integer.parseInt(br.readLine());
		}
		while(n < 1 || n > 1000);
	}

	void calSum()
	{
		for(int i = 1; i <= n; i++)
		{
			sum += i;
		}
	}

	void print()
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, sum);
	}
		수업----------------------------------------------*/


	// 주요 변수 선언(사용자의 입력값을 담아낼 변수
	int su;

	// 입력 메소드 정의
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("임의의 정수 입력(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su < 1 || su > 1000);
	}

	// 연산 처리 메소드 정의
	int calculate()
	{
		int result = 0;
		
		for(int i = 1; i <= su; i++)
		{
			result += i;
		}
		return result;
	}

	// 결과 출력 메소드 정의
	void print(int sum)
	{
		System.out.printf("\n>> 1 ~ %d 까지의 합 : %d\n", su, sum);
	}
}


public class Test072
{
	public static void main(String[] args) throws IOException
	{
/*		내 풀이
		Hap hp = new Hap();

		hp.input();

		hp.calSum();

		hp.print();
		수업 ------------------------------------------------*/
		
		Hap ob = new Hap();
		
		// 생성된 인스턴스를 통해 입력 메소드 호출
		//  --------------
		//  참조변수 활용

		ob.input();			// 참조변수 ob 활용  // new Hap().input() 도 가능은 하다
		
		// 생성된 인스턴스를 통해 연산 메소드 호출
		int s = ob.calculate();

		// 생성된 인스턴스를 통해 출력 메소드 호출  
		ob.print(s);		// == ob.print(ob.calculate();)

/*
임의의 정수 입력(1~1000) : -7
임의의 정수 입력(1~1000) : 10000
임의의 정수 입력(1~1000) : 15

>> 1 ~ 15 까지의 합 : 120
*/
	}
}
