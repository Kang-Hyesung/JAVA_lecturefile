/*=================================
  ���� ����(Sort) �˰��� ����
=================================*/

/*
�� ����
   : �����͸� Ư���� ��Ģ(����)�� �°� ������� ����(��������, ��������)

�� ������ ����
   : ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
     -> ���� ����, ã�� ����, �˻��� ���ϰ�

�� ������ ����
   : ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ����...


 ���� ����(Selection Sort)

 ���� ��)
 Source Data : 52 42 12 62 60
 Sorted Data : 12 42 52 60 62
 ����Ϸ���..

 ���� for ��
 int[] marks = {75, 60, 56}
 for(int i:marks){
     sum = sum + i;
 }

	 �ڷ��� ������ : �ڷᱸ��
  i�� marks�� ���������� �ݺ� but �迭 ���� �Ұ�
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
		   0 �� 1234 ���ϸ鼭 0�� �� ũ�� �ڸ� �ٲ� -> �Ϸ��ϸ� 0���� ���� ���� ��
		   1 ��  234 ���ϸ鼭 1�� �� ũ�� �ڸ� �ٲ� -> �Ϸ��ϸ� 1���� �ι�°�� ���� ��
		   �ݺ��ϸ� ���� �Ϸ��.
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
		for(int i = 0; i < a.length - 1; i++)			// �� ���� ������ 0    1   2   3
		{
			for(int j = i + 1; j < a.length; j++)		// �� ��� ������ 1234 234 34  4
			{
				if(a[i] > a[j])							// �������� 
			//  if(a[i] < a[j])							// ��������
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

// ���� ���
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
	}
}