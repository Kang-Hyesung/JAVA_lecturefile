/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - switch�� �ǽ�
==========================================*/

// ����ڷκ��� 1 ���� 3������ ���� �� �ϳ��� �Է¹޾�
// �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

// 1.switch ���� �Ϲ� ���� ����Ͽ� �����Ѵ�.
// 2.switch ���� �⺻ ���� ����ϵ�,
// break �� �� �� ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���� ��)
// ������ ���� �Է�(1~3) : 1
// ��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���� ��)
// ������ ���� �Է�(1~3) : 7
// �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		int n;		// �Է� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());

		// �� Ǯ��


		switch(n)
		{
			case 1: System.out.print("��\n"); break;
			case 2: System.out.print("�ڡ�\n"); break;
			case 3: System.out.print("�ڡڡ�\n"); break;
 			default: System.out.print("�Է� ����~!!!\n");break;
		}


		switch(n)
		{
			case 3: System.out.print("��");
			case 2: System.out.print("��");
			case 1: System.out.print("��");
 			default: System.out.print("\n�Է� ����~!!!\n");break;
		}

		// ����
		switch(n)
		{
			case 1: System.out.print("��\n"); break;
			case 2: System.out.print("�ڡ�\n"); break;
			case 3: System.out.print("�ڡڡ�\n"); break;
 			default: System.out.print("�Է� ����~!!!\n"); //break �ʼ� �ƴ�
		}
		switch(n)
		{
			case 3: System.out.print("��");
			case 2: System.out.print("��");
			case 1: System.out.print("��");
					break;
 			default: System.out.print("\n�Է� ����~!!!\n");
		}
}
