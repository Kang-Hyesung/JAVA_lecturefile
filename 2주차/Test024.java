/*============================================
   ■■■ 연산자(Operator) ■■■
 - 비트 단위 연산자
 - 두 변수에 담겨있는 내용(값) 바꾸기 ->(swap)
  -> xor 연산자 활용
=============================================*/
public class Test024
{
	public static void main(String[] args)
	{
		// 주요 변수 선언 및 초기화
		int x = 20, y = 23;
		//int temp;					// 임시 저장 변수

		// 담겨있는 내용물 확인
		System.out.printf("x -> %d, y -> %d\n", x, y);
		
		
		// 연산 및 처리
		/*
		temp = x;
		x = y;
		y = temp;
		*/

		/*
		x = x ^ y;
		y = y ^ x;
		x = x ^ y;
		*/

		y = y ^ x;
		x = x ^ y;
		y = y ^ x;

		// 결과 출력
		System.out.printf("x -> %d, y -> %d\n", x, y);
	}
}

/*
x -> 20, y -> 23
x -> 23, y -> 20
*/
