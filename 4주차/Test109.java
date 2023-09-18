/*=================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
=================================*/

/* 향상된 버블 정렬(Bubble Sort)

   앞에서 본 Selection Sort(Test107.java)나 Bubble Sort(Test108.java)의 성능은 같다.
   (성능에 대한 추정 근거 : 반복문을 수행한 횟수)
   하지만, 향상된 Bubble Sort는 대상 데이터의 구조에 따라서
   일반 Bubble Sort 나 Selection Sort 에 비해 성능이 좋을 수 있다.

   원본 데이터 : 61 15 20 22 30     
			     15 20 22 30 61     	01 12 23 34 1회전 -> (스왑 발생 -> true) 다음 회전 진행 
				 15 20 22 30         	01 12 23 1회전 -> (스왑 발생 -> false) 다음 회전 진행 X

	2회전에서 스왑(자리바꿈이) 전혀 일어나지 않았기 때문에
	불필요한 추가 연산은 무의미한 것으로 판단하여
	수행하지 않는다.

 실행 예)
 Source Data : 10 50 20 30 40
 Sorted Data : 10 20 30 40 50
*/
public class Test109
{
	public static void main(String[] args)
	{
		//int[] a = {10, 50, 20, 30, 40};
		int[] a = {52, 42, 12, 62, 60};
		

		System.out.print("Source Data : ");
		for(int n : a)
			System.out.printf("%d ", n);
		System.out.println();
/*      내 풀이
		boolean flag = false;
		int i,j;
		for(i = 1; i < a.length; i++)			 
		{										 
			for(j = 0; j < a.length - i; j++)	 
			{									 
				if(a[j] > a[j + 1])	
				{
					a[j] = a[j] ^ a[j + 1];
					a[j + 1] = a[j + 1] ^ a[j];
					a[j] = a[j] ^ a[j + 1];
					flag = true;
				}
			}
			System.out.println("a");
			if(flag == false)
				break;

			flag = false;
		}
*/
		boolean flag;
		int pass = 0;

		do
		{
			flag = false;			// 이번 회전에서 자리바꿈이 발생하지 않을 것이다.
			pass++;

			for(int i = 0; i < a.length - pass; i++)
			{
				if(a[i] > a[i + 1])				// 오름차순
				{
					a[i] = a[i] ^ a[i + 1];
					a[i + 1] = a[i + 1] ^ a[i];
					a[i] = a[i] ^ a[i + 1];
					flag = true;				// 한 번이라도 자리바꿈이 발생하게 되면
												// flag 변수는 true로 변경
				}
			}
		}
		while (flag);				// while() 안에 true면 반복된다.
		// flag변수가 false라는 것은
		// 회전이 구분적으로 발생하는 동안 스왑이 일어나지 않은 경우로
		// 더 이상의 반복문 수행은 무의미한 것으로 판단 가능
		
		System.out.print("Sorted Data : ");
		for(int n : a)
			System.out.printf("%d ", n);
		System.out.println();


	}
}