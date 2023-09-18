/*=======================
    ■■■ 배열 ■■■
  - 배열의 배열
========================*/
/*
 배열의 배열(다차원 배열)을 활용하여
 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
 그 결과를 출력하는 프로그램을 구현한다.

실행 예)								00 / 11 10 / 20 21 22 / 33 32 31 30
 A				00
 C B			10 11
 D E F			20 21 22
 J I H G		30 31 32 33
 K L M N O		40 41 42 43 44
 */
public class Test094
{
	public static void main(String[] args)
	{
		int n = 65;
		int[][] arr = new int[5][5];						// 배열 선언

		for(int i = 0; i < arr.length; i++)			
		{
			for(int j = 0; j <= i; j++)						// i번째 줄에 i번 출력해야 되기 때문에 
			{
				if(i % 2 == 0)								// i가 짝수인 줄에서는
					arr[i][j] = n;							// 정상적으로 입력
				if(i % 2 == 1)								// i가 홀수인 줄에서는
					arr[i][i-j] = n;						// 11 10순으로 가야하므로 [i][i-j]를 해주면 11 10순으로 간다.
				n++;										// n을 1 더해준다.
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
}