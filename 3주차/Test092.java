/*=======================
    ���� �迭 ����
  - �迭�� �迭
========================*/
/*
 �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
 �� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
 A  B  C  D  E
 F  G  H  I  J
 K  L  M  N  O
 P  Q  R  S  T
 U  V  W  X  Y
	 
 */
public class Test092
{
	public static void main(String[] args)
	{
		int n = 0;
		int[][] arr = new int[5][5];						// �迭 ����

		for(int i = 0; i < arr.length; i++)			
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = 'A' + n;						// �迭�� ���� 'A'���� �����ؼ� n�� ������ �� �ֱ�
				n++;										// n���� 1 �����ش�.
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%3c", arr[i][j]);		// ���ڷ� ����ؾ� �ϹǷ� %c�� ������ش�.
			}
			System.out.println();
		}
	}
/*
������
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
����Ϸ��� �ƹ� Ű�� �����ʽÿ� .
*/
}