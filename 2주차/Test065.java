/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
==========================================*/

// continue �ǽ�

// continue �� Ȱ���Ͽ�
// ������ ���� ó���� ����� �̷���� �� �ֵ���
// ���α׷��� �����Ѵ�.

// ���� ��)
/*
1 : 1
3 : 4
5 : 9
7 : 16
9 : 25
   :
99 : 2500
����Ϸ��� �ƹ� Ű�� ��������
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

			if(n % 2 == 0)				// ¦����� continue
				continue;

			s += n;
			System.out.println(n + " : " + s);
		}


			
	}
}

