/*==========================================
    ���� �ڹ� �⺻ ���α׷��� ����
===========================================*/
//����
//	�ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
//	�� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� �ﰢ�� ���� ���ϴ� ���α׷� ��
// - �ﰢ���� �غ� �Է� : 5
// - �ﰢ���� ���� �Է� : 3

// >> �غ��� 5, ���̰� 3�� �ﰢ���� ���� : xxx
// ����Ϸ��� �ƹ�Ű�� ��������
//		����ڷκ��� ������ �Է¹޾� ó�� -> BufferedReader Ȱ��
//		BufferedReader �� ���� �� ���?? �� �� ���??
//										  ---------

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
//		�� Ǯ��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = 0, b = 0; // a �غ� b ����
		double c = 0;	  // c ����

		System.out.println("�� �ﰢ�� ���� ���ϴ� ���α׷� ��");

		System.out.print("- �ﰢ���� �غ� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("- �ﰢ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.println();
		c = (double)a * b / 2;

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", a, b, c);
	
//���� ���

/*
�� �ﰢ�� ���� ���ϴ� ���α׷� ��
- �ﰢ���� �غ� �Է� : 5
- �ﰢ���� ���� �Է� : 3

>> �غ��� 5, ���̰� 3�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
//			-------------------------------------
			
			// �ֿ� ���� ����
			
			// BufferedReader �ν��Ͻ� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// �غ�, ����
			int underLength, height;	//-- �غ�, ����
			double area;				//-- ����

			// ���� �� ó��
			// 1. ����ڿ��� �ȳ� �޼��� ���
			System.out.println("�� �ﰢ�� ���� ���ϴ� ���α׷� ��");
			//System.out.println("- �ﰢ���� �غ� �Է� : "); ���� â���� �Է��ϱ� ���� print���
			System.out.print("- �ﰢ���� �غ� �Է� : ");

			// 2. ����ڰ� �Է��� ������(���ڿ�!!!!)�� �������·� ��ȯ����
			//	  ���� underLength�� ��Ƴ���
			underLength = Integer.parseInt(br.readLine());

			// 3. �ٽ� ����ڿ��� �ȳ� �޼��� ���
			System.out.print("- �ﰢ���� ���� �Է� : ");

			// 4. ����ڰ� �Է��� ������(���ڿ�!!!)�� ���� ���·� ��ȯ�� ��
			//	  ���� height�� ��Ƴ���
			height = Integer.parseInt(br.readLine());

			// 5. �ﰢ���� ���� ���ϴ� ���� ó��
			// area = underLength * height / 2;
			//		������		 ������	  ������
			//        ���� ��� ����(���� ���ϰ� �������� ����)
			area = underLength * height / 2.0;  // check
			//		������		������	  �Ǽ��� -> �Ǽ� ��� ����
			
			// �Ǽ� �ڷ����� ��������� ������ ��������
			// �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
			// ������ 2�� �ƴ�, �Ǽ������� 2.0���� ������ ������ �����ϰ� �Ǹ�
			// �� ������ �Ǽ� ������� ó���ȴ�.

			// area = (double)underLength * height / 2;
			// area = underLength * (double)height / 2;
			// area = (double)(underLength * height) / 2;  
			// area = (double)(underLength * height / 2);  -- X

			// ��� ���
			System.out.println();	// ����
			// System.out.print();	   �Ű����� ���� ����ϸ� ������ ����

			System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", underLength, height, area);




	}
}
/*
�� �ﰢ�� ���� ���ϴ� ���α׷� ��
- �ﰢ���� �غ� �Է� : 5
- �ﰢ���� ���� �Է� : 3

>> �غ��� 5, ���̰� 3�� �ﰢ���� ���� : 7.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/