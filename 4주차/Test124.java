/*==========================
  ■■■ 클래스 고급 ■■■
       - 중첩 클래스
==========================*/

class InnerOuterTest
{
	static int a = 10;
	int b = 20;

	class InnerNested
	{
		int c = 30;

		void write()
		{
			System.out.println("inner 의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}

	void write()
	{
		System.out.println("outer 의 write()...");
		
		// InnerNested 클래스 기반 인스턴스 생성(->inner)
		InnerNested ob1 = new InnerNested();
		ob1.write();					// inner 의 write()메소드 호출
	}
}

public class Test124
{
	public static void main(String[] args)
	{
		// InnerOuterTest 클래스 기반 인스턴스 생성(-> outer)
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();								// outer 의 write() 메소드 호출

		//== outer 의 write()...
		//   inner 의 write()...
		//	 a : 10
		//	 b : 20
		//   c : 30

		// InnerNested 클래스 기반 인스턴스 생성(-> inner)
		// InnerNested ob3 = new InnerNested();
		// 컴파일 에러
		
		// Test122.java 파일과 비교
		// InnerOuterTest 클래스 기반 인스턴스 생성(inner)
		// InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//== 컴파일 에러

		// 중첩 내부 클래스(static 중첩 클래스)와는 달리 외부 클래스의 인스턴스(객체)를 사용하지 안고
		// 단독으로 내부 클래스의 인스턴스를 생성하는 것은 불가능하다.
		// -> 단, 외부 클래스의 객.체. 를 사용하면
		// 내부 클래스의 객체를 생성하는 것이 가능하다.

		// check - > Test122.java 와 비교
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();

		// outer클래스명.inner클래스명 참조변수명 = new outer생성자().new inner생성자();

		// static 중첩 내부 클래스
		// outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자();
		
	}
}