/*====================================
   ■■■ 지역변수와 전역변수 ■■■
   - 지역 변수의 초기화 테스트 및 관찰
=====================================*/

// Test069.java 와 비교

// 지역 변수는 초기화 과정을 거치지 않으면 사용할 수 없다.
// (즉, 자바가 자동으로 초기화를 수행해 주거나 하지 않는다.)

public class Test068
{
	// 클래스 영역

	public static void main(String[] args)
	{
		// 메소드 영역

		// 지역 변수 n
		int n;
		// 선언 후 초기화 과정을 거치지 않은 상태
		
		// 지역 변수 n 에 접근하여 그 값을 출력하고자 하는 구문
		System.out.println("n : " + n);
		// 컴파일 에러 variable n might not have been initialized
	}
}