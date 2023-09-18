/*=======================
    ■■■ 배열 ■■■
  - 배열의 배열
========================*/
/*
 배열의 배열(다차원 배열)을 활용하여
 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
 그 결과를 출력하는 프로그램을 구현한다.

실행 예)
	1  8   9  16  17   00 01 02 03 04
	2  7  10  15  18   10 11 12 13 14
	3  6  11  14  19   20 21 22 23 24
	4  5  12  13  20   30 31 32 33 34
	 
 */
// 00 10 20 30 31 21 11 01 02 12

public class Test089
{
	public static void main(String[] args)
	{
		int[][] arr = new int[4][5];
		int n = 0;
/*		내 풀이
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				if(i % 2 == 0)
				{
					arr[j][i] = n;
					n++;
				}
				if(i % 2 == 1)
				{
					arr[3 - j][i] = n;
					n++;
				}
			}
		}
		수업-------------------------------------------*/


		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				n++;
				if(i % 2 == 0)
					arr[j][i] = n;
				else
					arr[3 - j][i] = n;
			}
		}



		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%3d ",arr[i][j]);
			}
			System.out.println();
		}
	}
}