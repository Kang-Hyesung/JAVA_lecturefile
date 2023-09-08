/*===============================
■■■ 자바의 개요 및 특징 ■■■
 
 // ○ 퀴즈
 //	   사전에 부여된 반지름 정보를 통해
 //    원의 넓이와 둘레를 구하는 프로그램을 구현한다
 //    → 반지름 : 10

 // 실행 예)
 // 넓이 : xxxx
 // 둘레 : xxxx
 // 계속하려면 아무 키나 누르세요...
 ===============================*/
public class Test010
{
	public static void main(String[] args)
	{
	// 내 풀이
	int 반지름 = 10;
	double 넓이 = 0, 둘레 = 0;

	넓이 = 반지름 * 반지름 * 3.141592;
	둘레 = 반지름 * 2 * 3.141592;

	System.out.println("넓이 : " + 넓이);
	System.out.println("둘레 : " + 둘레);

	// 실행 결과
	// 넓이 : 314.1592
	// 둘레 : 62.83184


	//----------------------------------------------------------
	// 수업

	// 주요 변수 선언
	int r = 10;				// -- 반지름(r)
	//double pi = 3.141592	// -- 원주율(π)
	//final double pi = 3.141592	// -- 원주율(π)
	final double PI = 3.141592;	// -- 원주율(π)
	// -- final 키워드 : 변수의 상수화

	// rainbowColor -> RAINBOWCOLOR -> RAINBOW_COLOR
	// userName -> USERNAME -> USER_NAME
	// applePrice -> APPLEPRICE -> APPLE_PRICE
	
	double area, length;			//-- 원의 넓이, 둘레

	// 연산 및 처리
	// 1. 넓이 연산
	area = r * r * PI; 

	// 2. 둘레 연산
	length = r * 2 * PI;

	// 결과 출력
	//System.out.println("넓이 : " + area);
	//System.out.println("둘레 : " + length);

	// 실행 결과
	// 넓이 : 314.1592
	// 둘레 : 62.83184

	//System.out.printf("넓이 : %.3f%n", area);
	//System.out.printf("둘레 : %.3f%n", length);
	// 실행 결과
	// 넓이 : 314.159
	// 둘레 : 62.832

	//System.out.printf("넓이 : %.3f\n둘레 : %.3f\n", area, length);
	// 실행 결과
	// 넓이 : 314.159
	// 둘레 : 62.832

	}
}