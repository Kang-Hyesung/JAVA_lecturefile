/*=======================
    ���� �迭 ����
  - �迭�� �迭
========================*/
/*
 �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
 �� ����� ����ϴ� ���α׷��� �����Ѵ�.

���� ��)
 1   2   3   4   10
 5   6   7   8   26
 9  10  11  12   42
13  14  15  16   58
28  32  36  40  136
	 
 */
public class Test091
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
/*		�� Ǯ��
		int n = 1;

		for(int i = 0; i < 4; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				arr[i][j] = n;
				arr[4][j] += arr[i][j];
				arr[i][4] += arr[i][j];
				arr[4][4] += arr[i][j];
				n++;
			}
		}
     ���� ---------------------------------------------*/		

		int n = 0;

		// �׽�Ʈ ����
		int sum = 0;

		// �� for�� ����2�� -1 -> �ݺ����� ó���� �ʿ����� ���� ����
		for (int i = 0; i < arr.length-1; i++)
		{
			for(int j = 0; j < arr[i].length-1; j++)
			{
				n++;
				arr[i][j] = n;

				//sum += arr[i][j];
				//System.out.printf("%4d", sum);\

				arr[i][arr[i].length-1] += arr[i][j];
				arr[arr.length-1][j] += arr[i][j];
				arr[arr.length-1][arr[i].length-1] += arr[i][j];

			}
		}




		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}




	}
}