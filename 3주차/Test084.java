/*=======================
   ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적 활용
========================*/
/*
○ 과제
   사용자로부터 임의의 학생 수를 입력받고
   그만큼의 점수(정수 형태)를 입력받아
   전체 학생 점수의 합, 평균, 편차를 구해서
   결과를 출력하는 프로그램을 구현한다.

   실행 예)
   학생 수 입력 : 5
   1번 학생의 점수 입력 : 90
   2번 학생의 점수 입력 : 82
   3번 학생의 점수 입력 : 64
   4번 학생의 점수 입력 : 36
   5번 학생의 점수 입력 : 98

   >> 합 : 370
   >> 평균 : 74.0
   >> 편차
   90 : -16.0
   82 : -8.0
   64 : 10.0
   36 : 38.0
   98 : -24.0
   계속하려면 아무 키나 누르세요..
*/
import java.io.IOException;
import java.util.Scanner;


public class Test084
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수 입력 : ");
		int n = sc.nextInt();					// 학생수 n 입력 받음
		int total = 0;							// 합
		double avg = 0.0;						// 평균
		double dev = 0.0;						// 편차

		int[] score = new int[n];				// 점수를 입력받아 저장할 배열

		for(int i = 0; i < n; i++)
		{
			System.out.printf("%d번 학생의 점수 입력 : ", i + 1);
			score[i] = sc.nextInt();			// 점수를 입력받아 배열에 넣어준다.
			total += score[i];					// 누적합 계산
		}

		avg = (double)total / n;				// 합과 n 모두 int형이라서 double형으로 강제 형변환 해준다.

		System.out.println();

		System.out.printf(">> 합 : %d\n", total);
		System.out.printf(">> 평균 : %.1f\n", avg);
		System.out.println(">> 편차");

		for(int i = 0; i < n; i++)
		{
			System.out.printf("%d : %.1f\n", score[i], avg - score[i]);
		}
/*
실행결과
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>> 합 : 370
>> 평균 : 74.0
>> 편차
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
*/
	}
}