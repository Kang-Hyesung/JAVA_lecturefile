/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - �ݺ���(while��) �ǽ� �� ����
==========================================*/

// ����ڷκ��� ���ϴ� ��(������)�� �Է¹޾�
// �ش��ϴ� �������� ����ϴ� ���α׷��� �����Ѵ�.
// ��, 1�� ~ 9�� ������ ���� �Է¹��� ��Ȳ�� �ƴ϶��
// �̿� ���� �ȳ��� �� �� ���α׷��� ������ �� �ֵ��� ó���Ѵ�.

// ���� ��)
// ���ϴ� ��(������) �Է� : 7
// 7 * 1 = 7
// 7 * 2 = 14
// 7 * 3 = 21
//   :
// 7 * 9 = 63
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���ϴ� ��(������) �Է� : 11
// 1���� 9������ ������ �Է��� �����մϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
		int n;		// �Է� ���� ��
		System.out.print("���ϴ� ��(������) �Է� : ");
		n = Integer.parseInt(br.readLine());

		if(n > 9 || n < 1)
		{
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
			return;
		}

		int i = 1;
		while(i <= 9)
		{
			System.out.printf("%d * %d = %d\n", n, i, n * i);
			i++;
		}
*/		// ���� ------------------------------------------------------------------

		int dan;			// ����ڷκ��� �Է°��� ���� ���·� ��Ƶ� ���� (��)

		// ���� �� ó��
		System.out.print("���ϴ� ��(������) �Է� : ");
		dan = Integer.parseInt(br.readLine());

		if(dan < 1 || dan > 9)
		{
			System.out.println("1���� 9������ ������ �Է��� �����մϴ�.");
			return;
		}

		int n = 0;

		// ��� ���(�ݺ� ���)
		while (n < 9)
		{
			n++;
			System.out.printf("%d * %d = %d\n", dan, n, dan * n);
		}
	}
}