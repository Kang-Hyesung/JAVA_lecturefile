/*==========================================
   ■■■ 실행 흐르믜 컨트롤(제어문) ■■■
==========================================*/

// continue 실습

// continue 를 활용하여
// 다음과 같은 처리와 출력이 이루어질 수 있도록
// 프로그램을 구현한다.

// 실행 예)
/*
1 : 1
3 : 4
5 : 9
7 : 16
9 : 25
   :
99 : 2500
계속하려면 아무 키나 누르세요
*/
public class Test065
{
	public static void main(String[] args)
	{
/*
		int n,m = 0;


		for(int i = 1; i <= 50; i++)
			System.out.printf("%d : %d\n", i + (i - 1), i * i);
		
		int i = 0;
		while(i <= 99)
		{
			i++;
			if(i % 2 == 0)
				continue;		
			m += i;
			System.out.printf("%d : %d\n", i, m);
		}
*/
		int n = 0, s = 0;

		while(n < 100)
		{
			n++;

			if(n % 2 == 0)				// 짝수라면 continue
				continue;

			s += n;
			System.out.println(n + " : " + s);
		}


			
	}
}

