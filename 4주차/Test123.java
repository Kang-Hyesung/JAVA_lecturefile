/*==========================
  ■■■ 클래스 고급 ■■■
       - 중첩 클래스
==========================*/

// outer
class Test2
{
	static int a = 10;
	int b = 20;

	void write()											// 첫 번째 write() 메소드
	{
		System.out.println("write()... 1");
		final int c = 20;
		int d = 40;
		
		// inner class
		// 메소드 안에 존재하는 또다른 클래스(로컬 클래스, local class, 지역 클래스)
		class LocalTest
		{
			void write()									// 두 번째 write() 메소드
			{
				System.out.println("write()... 2");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d); 컴파일에러
			}
		}
		d++;

		// 변수 c 와 변수 d 는 둘 다 지역변수이지만(첫 번째 write() 메소드에서 선언된 변수이므로)
		// c 는 final 변수이기 때문에 두 번째 write() 메소드에서 언제접근하더라도 
		// 고정된 값 20이 담겨있음을 보장받을 수 있다. 반면에 d 는 그 값이 수시로 변화될 수 있는 상황이므로
		// LocalTest 클래스의 인스턴스 생성 시점이 언제가 될지 알 수 없기 때문에
		// 이로 인해 인스턴스 생성 시점에 d 에 어떤 값이 담겨있는지를 보장받을 수 없게 된다.
		// 변수 d에 접근하는 것은 피할 수 있도록 문법적으로 처리하는 것이다

		// LocalTest 클래스 기반 인스턴스 생성(-> inner)
		LocalTest lt = new LocalTest();
		lt.write();											// 두 번째 write()메소드 출


	}
}
public class Test123
{
	public static void main(String[] args)
	{
		// Test2 클래스 기반 인스턴스 생성(-> outer)
		Test2 ob = new Test2();
		ob.write();										   // 첫번째 write() 메소드 호출
		// 컴파일 에러
		// d도 인스턴스 변수고 두 번째 write도 인스턴스 변수이지만 final 이 붙은 c와는 다르게 변동 가능성이 크기때문에 에러
	}
}