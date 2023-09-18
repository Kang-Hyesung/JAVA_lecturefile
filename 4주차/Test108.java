/*=================================
  ���� ����(Sort) �˰��� ����
=================================*/
/*

 ���� ����(��ǰ ����, Bubble Sort)


 ���� ��)
 Source Data : 52 42 12 62 60
 Sorted Data : 12 42 52 60 62
*/
public class Test108
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*
		 0 1 -> 1 2 -> 2 3 -> 3 4 �� ����Ŭ ������ ���� ū ���� ������ ���� ��ġ�Ѵ�(�������� ����)
		 0 1 -> 1 2 -> 2 3		  �� ����Ŭ �� -> �ι�° ū ���� ������ �ι�°�� ��ġ(�������� ����)
		 0 1 -> 1 2				  �� ����Ŭ ��
		 0 1 ��
		�ݺ�
		*/

		System.out.print("Source Data : ");
		for(int n : a)
			System.out.printf("%d ", n);
		System.out.println();
/*
		for(int i = 0; i < a.length - 1; i++)
		{
			for(int j = 0; j < a.length - 1 - i; j++)		// j�� j + 1�� ���ϹǷ� j ������ ���� �ٲ���
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
		// ����--------------------------------------------------------------------------
		// Bubble Sort  ����
		int i,j;
		for(i = 1; i < a.length; i++)			 // i �ڿ��� �� ����� �ٿ��ִ� ����
		{										 //	  1     2    3   4
			for(j = 0; j < a.length - i; j++)	 // j �񱳱��� �ε���
			{									 //   0123  012  01  0
				if(a[j] > a[j + 1])				 // ��������
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