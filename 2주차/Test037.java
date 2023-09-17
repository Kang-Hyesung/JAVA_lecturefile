// 사용자로부터 임의의 정수 5개를 입력받아
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단, Scanner를 활용하여 데이터를 입력받을 수 있도록 한다.

// 실행 예)
// 임의의 정수 5개 입력(공백 구분) : 11 12 13 14 15

// >> 짝수의 합은 26 이고, 홀수의 합은 39 입니다.
// 계쏙하려면 아무 키나 누르세요...
import java.util.Scanner;

public class Test037
{
	public static void main(String[] args)
	{
/*
		int a,b,c,d,e;
		int oSum = 0, eSum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 정수 5개 입력(공백 구분) : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		// 내 풀이
		if(a % 2 == 0)
			eSum += a;
		else
			oSum += a;

		if(b % 2 == 0)
			eSum += b;
		else
			oSum += b;

		if(c % 2 == 0)
			eSum += c;
		else
			oSum += c;

		if(d % 2 == 0)
			eSum += d;
		else
			oSum += d;

		if(e % 2 == 0)
			eSum += e;
		else
			oSum += e;

		System.out.printf("\n>> 짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.\n", eSum, oSum);
*/
// 실행 결과
/*
임의의 정수 5개 입력(공백 구분) : 11 12 13 14 15

>> 짝수의 합은 26 이고, 홀수의 합은 39 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/
		
		// 수업
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);

		// 누적합을 담아낼 변수 초기화
		int evenSum = 0;			// 짝수의 합을 담아낼 변수 선언 , 누적곱 일때는 1로 초기화한다.
		int oddSum = 0;				// 홀수의 합을 담아낼 변수 선언
		int num1, num2, num3, num4, num5;
		// 사용자로부터 입력받은 5개의 정수를 담을 변수 선언

		// 연산 및 처리
		System.out.print("임의의 정수 5개 입력(공백 구분) : ");	// 10 20 30 40 50
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if(num1 % 2 == 0)			// num1이 짝수일 때
		{
			evenSum += num1;		//evenSum 을 num1 만큼 증가
		}
		else						// num1이 홀수일 때
		{
			oddSum += num1;			//oddSum 을 num1 만큼 증가
		}
		
		if(num2 % 2 == 0)			// num2이 짝수일 때
		{
			evenSum += num2;		//evenSum 을 num2 만큼 증가
		}
		else						// num1이 홀수일 때
		{
			oddSum += num2;			//oddSum 을 num2 만큼 증가
		}

		if(num3 % 2 == 0)		
			evenSum += num3;		
		else					
			oddSum += num3;	
		
		if(num4 % 2 == 0)		
			evenSum += num4;		
		else					
			oddSum += num4;	

		if(num5 % 2 == 0)		
			evenSum += num5;		
		else					
			oddSum += num5;	

		// 결과 출력
		System.out.printf("\n>> 짝수의 합은 %d 이고, 홀수의 합은 %d 입니다.\n", evenSum, oddSum);
		
	}
}