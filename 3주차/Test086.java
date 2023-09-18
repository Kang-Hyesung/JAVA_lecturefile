/*=======================
    ■■■ 배열 ■■■
  - 배열의 배열
========================*/

/*
 배열의 배열(다차원 배열)을 활용하여
 다음과 같은 데이터를 요소로 취하는 배열(5*5)을 구성하고
 그 결과를 출력하는 프로그램을 구현한다.

 실행 예)
 1  2  3  4  5				00 01 02 03 04
 6  7  8  9 10				10 11 12 13 14
11 12 13 14 15				20 21 22 23 24
16 17 18 19 20
21 22 23 24 25				40 41 42 43 44
 계속하려면...

 */
public class Test086
{
	public static void main(String[] args)
	{
/*
		int n = 1;

		int[][] arr = new int[5][5];

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
*/
		// 배열의 배열 선언 + 메모리 할당
		int[][] arr = new int[5][5];

		// 변수 선언 및 초기화
		int n = 1;					// 1 2 3 4 5 6.. 24 25

		// 배열의 배열을 반복문의 중첩 구문을 활용하여 구조화
		for (int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}

		// 담아내기 완료
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
				System.out.printf("%3d ", arr[i][j]);
			System.out.println();
		}
/*
  1   2   3   4   5
  6   7   8   9  10
 11  12  13  14  15
 16  17  18  19  20
 21  22  23  24  25
 */
	}
}