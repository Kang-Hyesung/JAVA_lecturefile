/*=======================
    ■■■ 배열 ■■■
  - 배열의 배열
========================*/
/*
 배열의 배열(다차원 배열)을 활용하여
 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
 그 결과를 출력하는 프로그램을 구현한다.

실행 예)
 E J O T Y    69  74  00
 D I N S X    68  73  10
 C H M R W    67  72  20
 B G L Q V    66  71  30
 A F K P U    65  70  40
	 
 */
public class Test090
{
	public static void main(String[] args)
	{
/*		내 풀이
		int[][] arr = new int[5][5];
		int n = 65;

		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				arr[4 - j][i] = n;
				n++;
			}
		}

		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.printf("%2c", arr[i][j]);
			}
			System.out.println();
		}
-------------수업--------------------------------------------*/		

		// 배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		// 배열 구성
		char start = 'A';			// 65

		for(int i = 0; i < 5; i++)
		{
			for(int j = 4; j >= 0; j--)
			{
				arr[j][i] = start++;
			}
		}
		
		// 전체 요소 출력
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%2c", arr[i][j]);
			}
			System.out.println();
		}
	}
}