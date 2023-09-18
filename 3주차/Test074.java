/*================================
   ■■■ 클래스와 인스턴스 ■■■
   - 생성자(Constructor)
=================================*/
/*
○ 생성자(Constructor)의 역할

	1. 인스턴스 생성 -> 메모리 할당
	2. 초기화

○ 생성자(Constructor)의 특징
	1. 생성자는 메소드이지만, 일반 메소드처럼 호출될 수 없으며,
	   반환 자료형을 가질 수 없다.
	   (void 조차 가질 수 없으며, 값을 반환할 수도 없다.)
	2. 생성자는 클래스와 동일한 이름을 가져야 한다.
	   (대소문자 명확히 구분)
	3. 생성자는 객체를 생성하는 과정에서 new 생성자(); 의 형태로 호출된다.
	   (인스턴스 생성 시 단 한 번만 호출)
	   -> final 변수(상수화된 변수) 초기화 가능.
*/
class NumberTest
{
	int num;
	
	//NumberTest(){} // 디폴트 생성자(비어있음)

	// 아래처럼 사용자 정의 생성자를 작성하지 않으면 디폴트 생성자가 자동으로 삽입

	NumberTest() 
	{
		num = 1;
		System.out.println("사용자 정의 생성자 호출");
	}

	int getNum()
	{
		return num;
	}
}

public class Test074
{
	public static void main(String[] args)
	{
		// NumberTest 클래스 기반의 인스턴스 생성
		NumberTest nt1 = new NumberTest();		// NumberTest() 생성자도 메소드이다.
		//== 사용자 정의 생성자 호출
		// 인스턴스가 생성되는 시점에서 이와 동시에 선택의 여지 없이
		// 생성자 호출이 이루어진다.
		// -----------
		// NumberTest();



		int num = nt1.getNum();
		System.out.println(num);
		//== 1

		nt1.num = 200;
		System.out.println(nt1.getNum());
		//== 200

		// NumberTest 클래스 기반의 인스턴스 생성
		NumberTest nt2 = new NumberTest();
		//== 사용자 정의 생성자 호출
		
		System.out.println("nt1.num : " + nt1.getNum());
		System.out.println("nt2.num : " + nt2.getNum());
		// nt1.num : 200
		// nt2.num : 1
	}
}