/*=======================
    ■■■ 배열 ■■■
  - 배열의 배열
========================*/
/*
 배열의 배열(다차원 배열)을 활용하여
 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
 그 결과를 출력하는 프로그램을 구현한다.

실행 예)
 A 
 B C
 D E F
 G H I J
 K L M N O
 */
public class Test093
{
	public static void main(String[] args)
	{
		int n = 0;
		int[][] arr = new int[5][5];						// 배열 선언

		for(int i = 0; i < arr.length; i++)			
		{
			for(int j = 0; j <= i; j++)						// i번째 줄에 i번 출력해야 되기 때문에 
			{
				arr[i][j] = 'A' + n;						// 배열의 값에 'A'부터 시작해서 n씩 증가한 값 넣기
				n++;										// n값에 1 더해준다.
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.printf("%2c", arr[i][j]);		// 문자로 출력해야 하므로 %c로 출력해준다.
			}
			System.out.println();
		}
	}
 
/* 실행결과
 A
 B C
 D E F
 G H I J
 K L M N O
계속하려면 아무 키나 누르십시오
*/
}