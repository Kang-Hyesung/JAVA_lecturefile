/*=================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
=================================*/
/*
○과제
  사용자로부터 여러 학생의 성적 데이터를 입력받아
  점수가 높은 학생부터 낮은 순으로 등수를 부여하여
  결과를 출력하는 프로그램을 구현한다.
  단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

 실행 예)
 인원 수 입력 : 5
 이름 점수 입력(1, 공백 구문) : 홍길동 90
 이름 점수 입력(2, 공백 구문) : aaa 80
 이름 점수 입력(3, 공백 구문) : bbb 85
 이름 점수 입력(4, 공백 구문) : ccc 75
 이름 점수 입력(5, 공백 구문) : ddd 95

 ----------------------
 1등 ddd 95
 2등 홍길동 90
 3등 bbb 85
 4등 aaa 80
 5등 ccc 75
 ----------------------
계속하려면...

*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test110
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("인원 수 입력 : ");
		int N = Integer.parseInt(br.readLine());				// 입력받은 값 변수N에 저장
	
		String[] arrSt = new String[N];							// 입력받은 전체를 담을 문자열 배열
		int[] arrSc = new int[N];								// 성적만 빼서 담을 정수형 배열

		for(int i = 0; i < N; i++)							
		{
			arrSt[i] = br.readLine();							// 입력 받은 전체를 arrSt 배열에 담는다
			arrSc[i] = Integer.parseInt(arrSt[i].substring(4)); // 입력 받은 전체에서 숫자만 arrSc 배열에 담는다.
		}
		
		String str;									
		boolean flag;
		int pass = 0;

		do
		{
			flag = false;										// 이번 회전에서 자리바꿈이 발생하지 않을 것이다.	

			for(int i = 1; i < arrSc.length; i++)
			{
				if(arrSc[i - 1] < arrSc[i])						// 내림차순
				{
					str = arrSt[i];								// 문자열 전체를 바꿔준다
					arrSt[i] = arrSt[i - 1];					// i가 1로 시작하고 01 비교해야하기 때문에 i - 1해준다.
					arrSt[i - 1] = str;				

					arrSc[i] = arrSc[i] ^ arrSc[i - 1];			// 성적만 따로 뺀 배열을 바꿔준다
					arrSc[i - 1] = arrSc[i - 1] ^ arrSc[i];
					arrSc[i] = arrSc[i] ^ arrSc[i - 1];
					flag = true;				
				}
			}
			System.out.println("a");
		}
		while (flag);		
		
		for(int i = 0; i < N; i++)
		{
			System.out.println(arrSt[i]);						// 정렬이 완료된 문자열 배열 순서대로 출력
		}
	}
}