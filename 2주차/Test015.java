/*============================================
     ���� �ڹ� �⺻ ���α׷��� ����
- ������ �ڷ���
- �ڹ��� �⺻ ����� : System.in.read() �޼ҵ�
=============================================*/
/*
System.in.read() �޼ҵ�� (�Է� ��⿭�κ���) �� ���ڸ� �����´�.
��. �Է¹��� �ϳ��� ���ڸ� ���� �״�� �������� ���� �ƴ϶�
�ƽ�Ű �ڵ� ��(���� ����)���� ��ȯ�ϰ� �ȴ�.
*/

// ���� ��)
// �� ���� �Է�		 : A
// �� �ڸ� ���� �Է� : 9

// >> �Է��� ���� : A
// >> �Է��� ���� : 9

import java.io.IOException;

public class Test015
{
	public static void main(String args[]) throws IOException
	{
/*
		// �ֿ� ���� ����
		char ch;		//-- ����


		// ���� �� ó��
		System.out.print("���� �ϳ� �Է��ϼ��� : ");	// A
		ch = (char)System.in.read();					// 65
		//			--------------
		//				 65

		// ��� ���
		System.out.println(ch);
*/
/*
		char ch;
		char num;

		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();

		System.in.skip(2); //\r \n 2���� �����̹Ƿ� 2���� skip���ش�.

		System.out.print("�� �ڸ� ���� �Է� : ");
		num = (char)System.in.read();


		System.out.println();
		System.out.println("�Է��� ���� : " + ch);
		System.out.println("�Է��� ���� : " + num);
*/

		char ch;
		int n;
		
		// ���� �߰� ����
		//char temp;			//-- �ӽ÷� �׽�Ʈ�� ����

		System.out.print("�� ���� �Է�    : ");
		ch = (char)System.in.read();

		// �Է� ��⿭�� �����ִ� \r �� \n �� ��ŵ(�ǳʶٱ�)
		System.in.skip(2);
		//-- �Ű�����(2)�� ���� �� ���ڸ� �о�� �ʰ� �ǳʶڴ�.(������)

		System.out.print("�� �ڸ� ���� �Է� : ");
		n = System.in.read() - '0';  // 48 ���� �� '0' �����̹Ƿ� ���ش�
		//temp = (char)System.in.read();

		System.out.println();
		System.out.println(">> �Է��� ���� : " + ch);
		System.out.println(">> �Է��� ���� : " + n);
		//System.out.println(">> �Է��� ���� : " + temp);

// ���� ���
/*
�� ���� �Է�      : a
�� �ڸ� ���� �Է� : 9

>> �Է��� ���� : a
>> �Է��� ���� : 9
*/
		
	}
}