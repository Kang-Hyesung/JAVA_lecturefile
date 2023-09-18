/*=================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
=================================*/

/*
○ 정렬
   : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
     -> 보기 좋게, 찾기 좋게, 검색이 편하게

○ 정렬의 종류
   : 선택 정렬, 삽입 정렬, 버블 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬...


 선택 정렬(Selection Sort)

 실행 예)
 Source Data : 52 42 12 62 60
 Sorted Data : 12 42 52 60 62
 계속하려면..

 향상된 for 문
 int[] marks = {75, 60, 56}
 for(int i:marks){
     sum = sum + i;
 }

	 자료형 변수명 : 자료구조
  i를 marks가 끝날때까지 반복 but 배열 수정 불가
*/
public class Test107
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};

		System.out.print("Source Data : ");
		for(int i : a)
			System.out.printf("%d ", i);
		System.out.println();

		int temp;
		/*
		   0 과 1234 비교하면서 0이 더 크면 자리 바꿈 -> 완료하면 0값에 가장 작은 값
		   1 과  234 비교하면서 1이 더 크면 자리 바꿈 -> 완료하면 1값에 두번째로 작은 값
		   반복하면 정렬 완료됨.
		*/
/*		
		for(int i = 0; i < 5; i++)
		{
			for(int j = i + 1; j < 5; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
*/
		for(int i = 0; i < a.length - 1; i++)			// 비교 기준 데이터 0    1   2   3
		{
			for(int j = i + 1; j < a.length; j++)		// 비교 대상 데이터 1234 234 34  4
			{
				if(a[i] > a[j])							// 오름차순 
			//  if(a[i] < a[j])							// 내림차순
				{
					a[i] = a[i] ^ a[j];
					a[j] = a[j] ^ a[i];
					a[i] = a[i] ^ a[j];
				}
			}
		}

		System.out.print("Sorted Data : ");
		for(int i : a)
			System.out.printf("%d ", i);
		System.out.println();

// 실행 결과
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/
	}
}