/*=======================
    ■■■ 배열 ■■■
  - 배열의 배열
========================*/
/*
 배열의 배열(다차원 배열)을 활용하여
 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
 그 결과를 출력하는 프로그램을 구현한다.

실행 예)
 1   2   3   4   10
 5   6   7   8   26
 9  10  11  12   42
13  14  15  16   58
28  32  36  40  136
	 
 */
public class Test091
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
/*		내 풀이
		int n = 1;

		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				arr[i][j] = n;
				arr[4][j] += arr[i][j];
				arr[i][4] += arr[i][j];
				arr[4][4] += arr[i][j];
				n++;
			}
		}
     수업 ---------------------------------------------*/		

		int n = 0;

		// 테스트 변수
		int sum = 0;

		// 각 for문 수식2의 -1 -> 반복문의 처리가 필요하지 않은 영역
		for (int i = 0; i < arr.length-1; i++)
		{
			for(int j = 0; j < arr[i].length-1; j++)
			{
				n++;
				arr[i][j] = n;

				//sum += arr[i][j];
				//System.out.printf("%4d", sum);\

				arr[i][arr[i].length-1] += arr[i][j];
				arr[arr.length-1][j] += arr[i][j];
				arr[arr.length-1][arr[i].length-1] += arr[i][j];

			}
		}




		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}




	}
}