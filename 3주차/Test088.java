/*=======================
    ���� �迭 ����
  - �迭�� �迭
========================*/
/*
 �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
 �� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
 1 2 3 4 5   00 01 02 03 04
 5 1 2 3 4	 10 11 12 13 14
 4 5 1 2 3	 20 21 22 23 24
 3 4 5 1 2	 30 31 32 33 34
 2 3 4 5 1   40 41 42 43 44
 */
public class Test088
{
	public static void main(String[] args)
	{

		int[][] arr = new int[5][5];

		//int n = 1;
		int m = 5;
/*
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				if(n == 6)
					n = 1;
				arr[i][j] = n;
				n++;
			}
			n--;
		}


		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i; j < arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}		
			n = 1;			
		}
		
		for(int i = arr.length - 1; i > 0; i--)
		{
			for(int j = i; j > 0; j--)
			{
				arr[i][m] = m;
				m--;
			}
		}
*/

		for(int i = 0; i < arr.length; i++)
		{
			for(int n = 1, j = i; n <= 5; n++)
			{
				arr[i][j] = n;
				j++;

				if(j == 5)
					j = 0;
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
				System.out.printf("%3d ", arr[i][j]);
			System.out.println();
		}
	}
}
