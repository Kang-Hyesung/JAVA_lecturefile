/*==========================================
     ■■■ 자바 기본 프로그래밍 ■■■
- 변수와 자료형
- 자바의 기본 입출력 : System.util.Scanner
===========================================*/

// 구분자 지정(, / . 등)

import java.util.Scanner;

public class Test019
{
	public static void main(String args[])
	{
		// 주요 변수 선언
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,mat, tot;

		// 연산 및 처리
		System.out.print("이름,국어,영어,수학 입력(, 구분) : ");
		// 이름,국어,영어,수학 입력(, 구분) : ㅁㅁㅁ,90,80,70

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); 
		//				 ---------
		//			 "ㅁㅁㅁ,90,80,70"
		//
		//new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); 스캐너 안에 usdDelimiter 사용
		//						.구분자사용();
		//									  "\\s*,\\s*"
		//										\s*,\s*

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;


		// 결과 출력
		System.out.println("\n>> 이름 : " + name);
		System.out.println(">> 총점 : " + tot);

		//실행 결과
/*
이름,국어,영어,수학 입력(, 구분) : ㅁㅁㅁ,90,80,70

>> 이름 : ㅁㅁㅁ
>> 총점 : 240
*/
	}
}
