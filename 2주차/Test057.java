/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - �ݺ���(for��) �ǽ� �� ����
==========================================*/

// 1 ���� 100 ������ ���� �߿���
// 4 �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, for ���� Ȱ���ؾ� �ϸ�
// �� �ٿ� 5������ ����� �� �ֵ��� �Ѵ�.

// ���� ��)
//  4   8   12   16   20
// 24  28   32   36   40

public class Test057
{
	public static void main(String[] args)
	{
		// �� Ǯ��
/*
		for(int i = 1; i <= 100; i++)
		{	
			if(i % 4 == 0)
				System.out.printf("%5d", i);
			if(i % 20 == 0)
				System.out.println();
		}
*/
		for(int n = 4; n <= 100; n+=4)
		{
			System.out.printf("%4d",n);
			if(n % 20 == 0)
				System.out.println();
		}
	}
}