/*=================================
  ���� ����(Sort) �˰��� ����
=================================*/

/* ���� ���� ����(Bubble Sort)

   �տ��� �� Selection Sort(Test107.java)�� Bubble Sort(Test108.java)�� ������ ����.
   (���ɿ� ���� ���� �ٰ� : �ݺ����� ������ Ƚ��)
   ������, ���� Bubble Sort�� ��� �������� ������ ����
   �Ϲ� Bubble Sort �� Selection Sort �� ���� ������ ���� �� �ִ�.

   ���� ������ : 61 15 20 22 30     
			     15 20 22 30 61     	01 12 23 34 1ȸ�� -> (���� �߻� -> true) ���� ȸ�� ���� 
				 15 20 22 30         	01 12 23 1ȸ�� -> (���� �߻� -> false) ���� ȸ�� ���� X

	2ȸ������ ����(�ڸ��ٲ���) ���� �Ͼ�� �ʾұ� ������
	���ʿ��� �߰� ������ ���ǹ��� ������ �Ǵ��Ͽ�
	�������� �ʴ´�.

 ���� ��)
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
/*      �� Ǯ��
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
			flag = false;			// �̹� ȸ������ �ڸ��ٲ��� �߻����� ���� ���̴�.
			pass++;

			for(int i = 0; i < a.length - pass; i++)
			{
				if(a[i] > a[i + 1])				// ��������
				{
					a[i] = a[i] ^ a[i + 1];
					a[i + 1] = a[i + 1] ^ a[i];
					a[i] = a[i] ^ a[i + 1];
					flag = true;				// �� ���̶� �ڸ��ٲ��� �߻��ϰ� �Ǹ�
												// flag ������ true�� ����
				}
			}
		}
		while (flag);				// while() �ȿ� true�� �ݺ��ȴ�.
		// flag������ false��� ����
		// ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� ���� ����
		// �� �̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ� ����
		
		System.out.print("Sorted Data : ");
		for(int n : a)
			System.out.printf("%d ", n);
		System.out.println();


	}
}