/*=================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
=================================*/
/*

 버블 정렬(거품 정렬, Bubble Sort)


 실행 예)
 Source Data : 52 42 12 62 60
 Sorted Data : 12 42 52 60 62
*/
public class Test108
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		 0 1 -> 1 2 -> 2 3 -> 3 4 한 사이클 끝나면 가장 큰 수가 오른쪽 끝에 위치한다(오름차순 기준)
		 0 1 -> 1 2 -> 2 3		  한 사이클 끝 -> 두번째 큰 수가 오른쪽 두번째에 위치(오름차순 기준)
		 0 1 -> 1 2				  한 사이클 끝
		 0 1 비교
		반복
		*/

		System.out.print("Source Data : ");
		for(int n : a)
			System.out.printf("%d ", n);
		System.out.println();
/*
		for(int i = 0; i < a.length - 1; i++)
		{
			for(int j = 0; j < a.length - 1 - i; j++)		// j와 j + 1을 비교하므로 j 끝나는 조건 바꿔줌
			{
				if(a[j] > a[j + 1])
				{
					a[j] = a[j] ^ a[j + 1];
					a[j + 1] = a[j + 1] ^ a[j];
					a[j] = a[j] ^ a[j + 1];
				}
			}
		}
*/
		// 정렬--------------------------------------------------------------------------
		// Bubble Sort  수업
		int i,j;
		for(i = 1; i < a.length; i++)			 // i 뒤에서 비교 대상을 줄여주는 역할
		{										 //	  1     2    3   4
			for(j = 0; j < a.length - i; j++)	 // j 비교기준 인덱스
			{									 //   0123  012  01  0
				if(a[j] > a[j + 1])				 // 오름차순
				{
					a[j] = a[j] ^ a[j + 1];
					a[j + 1] = a[j + 1] ^ a[j];
					a[j] = a[j] ^ a[j + 1];
				}
			}
		}


		System.out.print("Sorted Data : ");
		for(int n : a)
			System.out.printf("%d ", n);
		System.out.println();
	}
}