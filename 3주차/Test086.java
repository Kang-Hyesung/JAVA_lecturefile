/*=======================
    ���� �迭 ����
  - �迭�� �迭
========================*/

/*
 �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5*5)�� �����ϰ�
 �� ����� ����ϴ� ���α׷��� �����Ѵ�.

 ���� ��)
 1  2  3  4  5				00 01 02 03 04
 6  7  8  9 10				10 11 12 13 14
11 12 13 14 15				20 21 22 23 24
16 17 18 19 20
21 22 23 24 25				40 41 42 43 44
 ����Ϸ���...

 */
public class Test086
{
	public static void main(String[] args)
	{
/*
		int n = 1;

		int[][] arr = new int[5][5];

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}

		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
*/
		// �迭�� �迭 ���� + �޸� �Ҵ�
		int[][] arr = new int[5][5];

		// ���� ���� �� �ʱ�ȭ
		int n = 1;					// 1 2 3 4 5 6.. 24 25

		// �迭�� �迭�� �ݺ����� ��ø ������ Ȱ���Ͽ� ����ȭ
		for (int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			{
				arr[i][j] = n;
				n++;
			}
		}

		// ��Ƴ��� �Ϸ�
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
				System.out.printf("%3d ", arr[i][j]);
			System.out.println();
		}
/*
  1   2   3   4   5
  6   7   8   9  10
 11  12  13  14  15
 16  17  18  19  20
 21  22  23  24  25
 */
	}
}