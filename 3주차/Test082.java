/*=======================
   ���� �迭 ����
  - �迭�� ����� �ʱ�ȭ
  - �迭�� �⺻�� Ȱ��
========================*/

// ����ڷκ��� �ο����� �Է¹ް�
// �Է¹��� �ο� �� ��ŭ�� �л� �̸��� ��ȭ��ȣ�� �Է¹޾�
// �̷��� �Է¹��� �����͸� �̸� �迭�� ��ȭ��ȣ �迭�� �����Ͽ�
// ����� ����� �� �ִ� ���α׷��� �����Ѵ�.

// ���� ��)
// �Է� ó���� �л� �� �Է�(��, 1~10) : 27
// �Է� ó���� �л� �� �Է�(��, 1~10) : -5
// �Է� ó���� �л� �� �Է�(��, 1~10) : 3
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : �ڹ��� 010-1234-2345
// �̸� ��ȭ��ȣ �Է�[1](���� ����) : ����� 010-2345-3456
// �̸� ��ȭ��ȣ �Է�[3](���� ����) : ������ 010-3456-4567

// --------------------
// ��ü �л� �� : 3
// --------------------
// �̸�    ��ȭ��ȣ
// �ڹ��� 010-1234-2345
// ����� 010-2345-3456
// ������ 010-3456-4567
// --------------------
// ����Ϸ��� �ƹ� Ű�� ��������

import java.io.IOException;
import java.util.Scanner;

public class Test082
{
	public static void main(String[] args) throws IOException
	{
/*		�� Ǯ��
		Scanner sc = new Scanner(System.in);

		int n = 0;
		do
		{
		
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			n = sc.nextInt();										// �л� �� n
		
		}
		while (n < 1 || n > 10);
		
		
		String[] name = new String[n];								// �̸��� ���� ���ڿ� �迭
		String[] number = new String[n];							// ��ȣ�� ���� ���ڿ� �迭


		for(int i = 0; i < n; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ���� ) : ", i + 1);
			name[i] = sc.next();
			number[i] = sc.next();
		}


		System.out.println();
		System.out.println("--------------------");
		System.out.printf("��ü �л� �� : %d\n",n);
		System.out.println("--------------------");
		System.out.println("�̸�    ��ȭ��ȣ");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(name[i]+ " ");
			System.out.print(number[i] + " \n");
		}
		System.out.println("--------------------");
		���� ------------------------------------*/	
		
		Scanner sc = new Scanner(System.in);
		
		// ����ڰ� �Է��ϴ� �л� ���� ��Ƴ� ����
		int memberCount = 0;

	//	System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
		//memberCount = sc.nextInt();

		do
		{
		
			System.out.print("�Է� ó���� �л� �� �Է�(��, 1~10) : ");
			memberCount = sc.nextInt();
		
		}
		while (memberCount < 1 || memberCount > 10);

		// �׽�Ʈ(Ȯ��)
		// System.out.println("����ڰ� �Է��� �ο� �� : "+ memberCount);

		// ����ڰ� �Է��� �ο� ���� ����
		// �̸� �迭�� ��ȭ��ȣ �迭�� �����ؾ� �Ѵ�.

		// �ο� �� ��ŭ�� �̸� ���� �迭 ����
		String[] names = new String[memberCount];	
		
		// �ο� �� ��ŭ�� ��ȭ��ȣ ���� �迭 ���� , ��ȭ��ȣ�� �տ� 0�� ���� ������ -�� ������ String���� �ؾ���
		String[] tels = new String[memberCount]; //String[names.length]�� �ص� ��

		// �̸� ��ȭ ��ȣ �Է�
		// �ο� �� ��ŭ�� �ȳ� �޼��� ��� �� �Է°� ��Ƴ���
		// for(nt i = 0; i < names.length; i++)
		// for(int i = 0; i < tels.length; i++)
		for(int i = 0; i < memberCount; i++)
		{
			System.out.printf("�̸� ��ȭ��ȣ �Է�[%d](���� ����) : ", i + 1);
			
			// �ڹ��� 010-1234-2345
			// ------
			names[i] = sc.next();
			// �ڹ��� 010-1234-2345
			//        -------------
			tels[i] = sc.next();
		}

		// ���� ���(�̸�, ��ȭ��ȣ) ���
		System.out.println();
		System.out.println("--------------------");
		System.out.printf("��ü �л� �� : %d\n", memberCount);
		System.out.println("--------------------");
		System.out.println("�̸�    ��ȭ��ȣ");
		
		for(int i = 0; i < memberCount; i++)
		{
			System.out.printf("$3s %14s\n", names[i], tels[i]);
		}
		System.out.println("--------------------");
	}
}