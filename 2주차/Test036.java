// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 753
// �� ��° ���� �Է� : 22
// �� ��° ���� �Է� : 124
//
// >> ���� ��� : 22 124 753

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� Ǯ��
		int num1,num2,num3;

		System.out.print("ù ��° ���� �Է� : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		num3 = Integer.parseInt(br.readLine());
/*
		int temp;

		if( num1 >= num2)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if( num1 >= num3)
		{
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if( num2 >= num3)
		{
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
*/		
		System.out.printf("\n>> ���� ��� : %d %d %d\n", num1, num2, num3);

		// ����

// 1. ù ��° ����, �� ��° ���� ũ�� ��
// -> ù ��° ������ �� ��° �������� Ŭ ��� �ڸ� �ٲ�

// 2. ù ��° ����, �� ��° ���� ũ�� ��
// -> ù ��° ������ �� ���� �������� Ŭ ��� �ڸ� �ٲ�

// 3. �� ��° ����, �� ��° ���� ũ�� ��
// -> �� ��° ������ �� ��° �������� Ŭ ��� �ڸ� �ٲ�
		
		// ��Ʈ�����ڷ� ���� �ٲ��ִ� ���� �� ������.
		if( a > b)			// ù ��° ������ �� ��°���� Ŭ ���
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}

		if( a > c)		    // ù ��° ������ �� ��°���� Ŭ ���
		{
			a = a^c;
			c = c^a;
			a = a^c;
		}

		if( b > c)			// �� ��° ������ �� ��°���� Ŭ ���
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}
		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);
	}
}