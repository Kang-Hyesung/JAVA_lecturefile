/*=======================
    ���� �迭 ����
  - �迭�� �迭
========================*/
/*
 �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
 �� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
 E J O T Y    69  74  00
 D I N S X    68  73  10
 C H M R W    67  72  20
 B G L Q V    66  71  30
 A F K P U    65  70  40
	 
 */
public class Test090
{
	public static void main(String[] args)
	{
/*		�� Ǯ��
		int[][] arr = new int[5][5];
		int n = 65;

		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				arr[4 - j][i] = n;
				n++;
			}
		}

		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.printf("%2c", arr[i][j]);
			}
			System.out.println();
		}
-------------����--------------------------------------------*/		

		// �迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		// �迭 ����
		char start = 'A';			// 65

		for(int i = 0; i < 5; i++)
		{
			for(int j = 4; j >= 0; j--)
			{
				arr[j][i] = start++;
			}
		}
		
		// ��ü ��� ���
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%2c", arr[i][j]);
			}
			System.out.println();
		}
	}
}