/*=======================
   ���� �迭 ����
  - �迭�� �⺻�� Ȱ��
========================*/

// char �ڷ����� �迭�� �����
// �� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
// ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
// ��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// A B C D E F G H I J K ... V W X Y Z
// ����Ϸ��� �ƹ� Ű�� ��������
public class Test081
{
	public static void main(String[] args)
	{
/*
		�� Ǯ��
		char al[] = new char[26];

		for(int i = 0; i < al.length; i++)
		{
			al[i] = (char)('A' + i);		
		}

		//for(int i = 0; i < al.length; i++)
		//{
		//	System.out.printf("%c ", al[i]);
		//}


		for(int i:al)
		{
			System.out.printf("%c ",i);
		}
*/
		== A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		// ����Ϸ��� �ƹ� Ű�� ��������
		����-----------------------------------*/

		// ��� 1
		char[] arr1;
		arr1 = new char[26];

		arr1[0] = 'A';
		arr1[0] = 'B';


		// ��� 2
		char[] arr2 = {'A', 'B', 'C', 'D', '.', 'Z'};

		// ��� 3
		char[] arr3 = new char[26];
		for(int i = 0, ch = 65; i < arr3.length; i++, ch++)
		{
			// �׽�Ʈ
			// System.out.println("i: " + i + ", ch: " + ch);
			arr3[i] = (char)ch;
		}

		// �迭 ��� ��ü ���
		for(int i = 0; i < arr3.length; i++)
		{
			System.out.print(arr3[i] + " ");
		}
		System.out.println();

		//== A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
		// ����Ϸ��� �ƹ� Ű�� ��������

	}
}
