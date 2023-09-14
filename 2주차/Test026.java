/*===============================
   ■■■ 연산자(Operator) ■■■
 - 논리 연산자
================================*/
public class Test026
{
	public static void main(String[] args)
	{
		boolean a = true ,b = false;

		System.out.printf("a && b : %b\n", (a && b)); // true 또는 false를 담는 서식문자 %b
		System.out.printf("a || b : %b\n", (a || b));
		System.out.printf("!a     : %b\n", !a); // ! == 부정(반대)
		System.out.printf("!b     : %b\n", !b);

// 실행 결과
/*
a && b : false
a || b : true
!a     : false
!b     : true
*/
	}
}