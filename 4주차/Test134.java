/*===========================================
       ■■■ 자바의 주요 클래스 ■■■
 - 자바에서 기본적으로 제공하는 주요 클래스들
 - Wrapper 클래스
============================================*/

public class Test134
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		//== 3
		//   256

		print(b2);
		print(i2);
	}

	static void print(Number a) // Number가 Integer Byte 등의 상위 클래스라서 모두 받을 수 있다.
	// java.lang.Number 클래스는 모든 숫자형 Wrapper 클래스의 부모 클래스이다.
	// b2, i2 에 해당하는 자료형이 Number 에 넘어오면서 업 캐스팅이 일어나게 된다.
	{	
		System.out.println(a);

		/*
		if(a instanceof Integer) // n 이 Integer기반으로 만들어진 객체라면
		{
			System.out.println(a.intValue());
		}

		else if(a instanceof Double)
		{
			...
		}

		...
		*/
	}

	// Number n = new Integer(); Number가 추상 클래스이므로 Integer 객체를 업캐스팅해서 만들 수 있다.

}