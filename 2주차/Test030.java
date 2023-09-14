/*===============================
   ���� ������(Operator) ����
 - ���� ������ == ���� ������
================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ ��������... �������... �Ǻ��Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է��� BufferedReader�� Ȱ���ϰ�
// ���ǿ����ڸ� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000 -> ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 2012
// 2012 -> ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 2023
// 2023 -> ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// 2���� 28�ϱ��� �ִ� �� -> ���
//		 29�ϱ��� �ִ� �� ->

// ������ �Ǻ� ����
// ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
// 400�� ����̸� ����
// �׷��� ������ ���

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test030
{
	public static void main(String[] args) throws IOException
	{

		// �� Ǯ��
/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int year; // ����
		String ans; // ��

		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		ans = (year % 4 == 0 && year % 100 != 0) ? "����" : year % 400 == 0 ? "����" : "���";

		System.out.println(year + " -> " + ans);
*/

		// ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;
		String strResult;

		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		// ������ 4�� ���		������ 100�� ��� �ƴ�			������ 400�� ���
		// year % 4 == 0		   year % 100 != 0				 year % 400 == 0

		// ->  year % 4 == 0 �̸鼭   year % 100 != 0	�Ǵ�	 year % 400 == 0
		// ->  year % 4 == 0 &&   year % 100 != 0   ||	year % 400 == 0

		strResult = year % 4 == 0 && year % 100 != 0 ||	year % 400 == 0 ? "����" : "���";

		System.out.printf("%d�� -> %s\n", year, strResult);
	}
}

