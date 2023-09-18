/*================================
   ■■■ 클래스와 인스턴스 ■■■
=================================*/

// CircleTest.java 파일과 한 세트

// BufferedReader나 Input등은 추가해줄 필요가 없다.
import java.io.IOException;


public class Test071
{
	public static void main(String[] args) throws IOException
	{
/*
		CircleTest cr = new CircleTest();

		cr.input();

		double le = cr.calLength();

		double ar = cr.calArea();

		cr.print(ar, le);

				내 풀이
		--------------------------------------		
				 수업
*/
		// CircleTest 클래스 기반 인스턴스 생성 == 인스턴스 생성 == 객체 생성
		CircleTest ob = new CircleTest();

		ob.input();			// 이 메소드 안에 예외 처리를 해주었으면 여기 main 메소드에도 처리해 주어야 한다.

		double num1 = ob.calArea();

		double num2 = ob.calLength();

		ob.print(num1, num2);

	}
}