/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - �ݺ���(while��) �ǽ� �� ����
==========================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ�����... �ƴ���... �� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε�
//		  ������ �������� �ʴ� ��.
//		  ��, 1�� �Ҽ� �ƴ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 -> �Ҽ� �ƴ�

// ������ ���� �Է� : 11
// 11 -> �Ҽ�
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test050
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�� Ǯ��

		int n = 0;		// �Է� ���� ����

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		if(n == 2)
		{
			System.out.println(n + " �� �Ҽ� ");
			return;
		}
		
		int i = 1;
		while(i < n)
		{
			i++;

			if(n % i == 0 || n == 1)
			{
				System.out.println(n + " ��  �Ҽ� �ƴ�");
				break;
			}
			else if( i == n / 2)
			{
				System.out.println(n + " �� �Ҽ� ");
				break;
			}
		}
		// ���� ----------------------------------------------------------
/*
		// �ֿ� ���� ����
		int num;		// ������� �Է°��� ��Ƴ� ����
		int n = 2;		// �Է°��� ������� ������ ������ ������ ����
						// 2���� �����ؼ� 1�� ����
						// ex) �Է°� 27 -> n : 2 3 4 5 6 7 8 .. 25 26

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());
		
		// � ���� �Է¹��� �������� �� �� ������
		// �� �Է°��� �Ҽ��� �����Ѵ�.
		// String result = "�Ҽ���";
		boolean flag = true;			// num�� �Ҽ��� ���̴�.
		
		while (n < num)
		{
			// �׽�Ʈ
			//System.out.println("�ݺ��� ���� -> n : " + n);

			// Ȯ�� ����
			//-- n ���� num �� ������ ���������� Ȯ�� -> �������� 0���� Ȯ��
			if(num % n == 0)	// ��, ������ �������� ��Ȳ
			{
				flag = false;
				break;			// ���߰� ����������
								// break�� ���δ� ���� ����� �ݺ���
			}
			n++;
		}

		// �׽�Ʈ
		// System.out.println("flag : " + flag);


		// ��� ���
		// (���� ����� ����ϱ� ���� �߰� Ȯ�� -> 1���� �ƴ����� ���� �߰� ����)
		if(flag == true && num != 1) //flag ��ü�� true Ȥ�� false�̱� ������ == true�� �ʿ����.
		{
			// �Ҽ�
			System.out.printf("%d �� �Ҽ�\n", num);
		}
		else
		{
			// ���������� �Ҽ� �ƴ�
			System.out.printf("%d �� �Ҽ� �ƴ�\n", num);
		}
*/
// ��� ����
/*
������ ���� �Է� : 991
991 �� �Ҽ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
	}
}