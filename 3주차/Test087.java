/*=======================
    ���� �迭 ����
  - �迭�� �迭
========================*/
/*
 �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
 �� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
 1 2 3 4 5
 2 3 4 5 6
 3 4 5 6 7
 4 5 6 7 8
 5 6 7 8 9 
 */
public class Test087
{
	public static void main(String[] args)
	{
/*
		int[][] arr = new int[5][5];
		int n = 1;

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
			n = i + 2;
		}

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
*/		int[][] arr = new int[5][5];

		int n;

		for(int i = 0; i < arr.length; i++)
		{
			n = i + 1;
			for(int j = 0; j < arr[i].length; j++)
			{
				// �׽�Ʈ
				//System.out.print(" i:" + i + ", j:" + j);
				//System.out.print(" [" + n + "]");
				arr[i][j] = n;
				n++;

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