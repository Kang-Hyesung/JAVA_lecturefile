/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - �ݺ��� �ǽ� �� ����
==========================================*/

// ���� ��)
// 1���� 100���� ������ �� : xxxx
// 1���� 100���� ¦���� �� : xxxx
// 1���� 100���� Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test046
{
	public static void main(String[] args)
	{
/*		�� Ǯ��
		int n = 1;
		int sum = 0,oSum = 0, eSum = 0;

		while(n <= 100)
		{
			sum += n;
			if(n % 2 == 0)
			{
				eSum += n;
			}
			else if(n % 2 == 1)
			{
				oSum += n;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}
			n++;
		}
		System.out.println("1���� 100���� ������ �� : " + sum);
		System.out.println("1���� 100���� ¦���� �� : " + eSum);
		System.out.println("1���� 100���� Ȧ���� �� : " + oSum);
*/
/*
1���� 100���� ������ �� : 5050
1���� 100���� ¦���� �� : 2550
1���� 100���� Ȧ���� �� : 2500
*/
		// ����--------------------------------------------------

		// �ֿ� ���� ���� �� �ʱ�ȭ
		int n = 1, sum, odd, even;
		sum = odd = even = 0;

		// ���� �� ó��
		while (n<=100)
		{
			sum+=n;

			if(n%2==0)
				even +=n;
			else if(n%2!=0)
				odd += n;
			else
			{
				System.out.println("�Ǻ��� �� ���� ������");
				return;
			}

			n++;
		}
		// ��� ���
		System.out.println("1���� 100���� ������ �� : " + sum);
		System.out.println("1���� 100���� ¦���� �� : " + even);
		System.out.println("1���� 100���� Ȧ���� �� : " + odd);
	}
}
