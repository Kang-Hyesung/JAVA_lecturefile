/*============================================
     ■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력 : System.in.read() 메소드
=============================================*/
/*
System.in.read() 메소드는 (입력 대기열로부터) 한 문자만 가져온다.
단. 입력받은 하나의 문자를 문자 그대로 가져오는 것이 아니라
아스키 코드 값(정수 형태)으로 반환하게 된다.
*/

// 실행 예)
// 한 문자 입력		 : A
// 한 자리 정수 입력 : 9

// >> 입력한 문자 : A
// >> 입력한 정수 : 9

import java.io.IOException;

public class Test015
{
	public static void main(String args[]) throws IOException
	{
/*
		// 주요 변수 선언
		char ch;		//-- 문자


		// 연산 및 처리
		System.out.print("문자 하나 입력하세요 : ");	// A
		ch = (char)System.in.read();					// 65
		//			--------------
		//				 65

		// 결과 출력
		System.out.println(ch);
*/
/*
		char ch;
		char num;

		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();

		System.in.skip(2); //\r \n 2개가 엔터이므로 2개를 skip해준다.

		System.out.print("한 자리 정수 입력 : ");
		num = (char)System.in.read();


		System.out.println();
		System.out.println("입력한 문자 : " + ch);
		System.out.println("입력한 정수 : " + num);
*/

		char ch;
		int n;
		
		// 변수 추가 선언
		//char temp;			//-- 임시로 테스트할 변수

		System.out.print("한 문자 입력    : ");
		ch = (char)System.in.read();

		// 입력 대기열에 남아있는 \r 과 \n 을 스킵(건너뛰기)
		System.in.skip(2);
		//-- 매개변수(2)에 의해 두 글자를 읽어내지 않고 건너뛴다.(버린다)

		System.out.print("한 자리 정수 입력 : ");
		n = System.in.read() - '0';  // 48 차이 즉 '0' 차이이므로 빼준다
		//temp = (char)System.in.read();

		System.out.println();
		System.out.println(">> 입력한 문자 : " + ch);
		System.out.println(">> 입력한 정수 : " + n);
		//System.out.println(">> 입력한 정수 : " + temp);

// 실행 결과
/*
한 문자 입력      : a
한 자리 정수 입력 : 9

>> 입력한 문자 : a
>> 입력한 정수 : 9
*/
		
	}
}