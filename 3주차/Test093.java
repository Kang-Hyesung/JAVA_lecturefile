/*=======================
    ���� �迭 ����
  - �迭�� �迭
========================*/
/*
 �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
 �� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
 A 
 B C
 D E F
 G H I J
 K L M N O
 */
public class Test093
{
	public static void main(String[] args)
	{
		int n = 0;
		int[][] arr = new int[5][5];						// �迭 ����

		for(int i = 0; i < arr.length; i++)			
		{
			for(int j = 0; j <= i; j++)						// i��° �ٿ� i�� ����ؾ� �Ǳ� ������ 
			{
				arr[i][j] = 'A' + n;						// �迭�� ���� 'A'���� �����ؼ� n�� ������ �� �ֱ�
				n++;										// n���� 1 �����ش�.
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.printf("%2c", arr[i][j]);		// ���ڷ� ����ؾ� �ϹǷ� %c�� ������ش�.
			}
			System.out.println();
		}
	}
 
/* ������
 A
 B C
 D E F
 G H I J
 K L M N O
����Ϸ��� �ƹ� Ű�� �����ʽÿ�
*/
}