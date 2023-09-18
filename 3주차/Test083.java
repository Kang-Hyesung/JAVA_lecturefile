/*=======================
   ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적 활용
========================*/

// ○과제
//   사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
//   입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.\
//   단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수   : 11
// 데이터 입력(공백 구분) : 45 11 26 35 66 97 50 2 123 10 7 

// >> 가장 큰 수 -> 123
// 계속하려면 아무 키나 누르세요...
import java.io.IOException;
import java.util.Scanner;

public class Test083
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);								
		System.out.print("입력할 데이터의 갯수   : ");
		int n = sc.nextInt();								// 입력할 데이터의 갯수 n

		int[] num = new int[n];	// 입력받은 n값으로 배열 만들어 줌
	
		System.out.print("데이터 입력(공백 구분) : ");

		int max = num[0];
		for(int i = 0; i < n; i++)				
		{
			num[i] = sc.nextInt();							// 공백으로 구분
			if(num[i] > max)								// num[i]의 값이 max보다 크면
				max = num[i];								// max에 num[i] 대입
		}

		System.out.printf("\n>> 가장 큰 수 → %d\n",max);
/*
입력할 데이터의 갯수   : 5
데이터 입력(공백 구분) : 75 15 48 75 36

>> 가장 큰 수 → 75
*/



	}
}