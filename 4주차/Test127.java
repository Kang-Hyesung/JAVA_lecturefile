/*===========================================
       ■■■ 자바의 주요 클래스 ■■■
 - 자바에서 기본적으로 제공하는 주요 클래스들
============================================*/

// Test126.java 파일과 비교

// import java.lang.*;
// import java.lang.Object 를 포함하는 구문

public class Test127	// extends Object
{
	/*
	Object 클래스로부터 상속받은 멤버들
	...
	...

	public String toString()
	{
		...;
	}

	..
	*/

	@Override
	public String toString()
	{
		return "재정의한 toString()...";
	}

	public static void main(String[] args)
	{
		Test127 ob = new Test127();

		System.out.println(ob.toString());
		//== 재정의한 toString()...  // 클래스명의 해쉬코드 아님

		System.out.println(ob);
		//== 재정의한 toString()...
	}
}