/*========================================
■■■ 자바의 개요 및 특징 ■■■
 - 변수와 자료형
 - 변수와 자료형 실습 및 테스트 : boolean
=========================================*/

public class Test007
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		boolean a = true;		// boolean a = "true"; (X)
		boolean b;

		int c = 10, d = 5;


		// 연산 및 처리(관계 연산 및 대입 연산)
		b = d > c;
		// b = 5 > 10;
		// b = flase;  관계 연산의 연산 결과는 항상 true/false

		// 결과 출력
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}

// 실행 결과

/*
a : true
b : false
*/