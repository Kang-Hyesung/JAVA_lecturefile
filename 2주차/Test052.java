/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - �ݺ���(while��) �ǽ� �� ����
==========================================*/

// �� ����
//	  ����ڷκ��� ������ ������ �Է¹޾�
//	  1 ���� �Է¹��� �� ����������
//	  ��ü �հ�, ¦���� �հ�, Ȧ���� ����
//    ���� ��������� �����Ͽ� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 396
// >> 1 ~ 396 ���� ������ �� : xxxxx
// >> 1 ~ 396 ���� ¦���� �� : xxxx
// >> 1 ~ 396 ���� Ȧ���� �� : xxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test052
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n;											// �Է¹��� ��
		int sum = 0, oSum = 0, eSum = 0;				// ������, Ȧ����, ¦����

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		int i = 1;
		while (i <= n)
		{
			sum += i;									// ������ ��
			if(i % 2 == 0)								// i�� ¦�����
				eSum += i;								// ¦���� ��� ������
			else										// i�� ¦���� �ƴ϶��
				oSum += i;								// Ȧ���� ��� ������
			i++;										// i�� 1 �����ش�
		}
		System.out.printf(">> 1 ~ %d ���� ������ �� : %d\n", n, sum);
		System.out.printf(">> 1 ~ %d ���� ¦���� �� : %d\n", n, eSum);
		System.out.printf(">> 1 ~ %d ���� Ȧ���� �� : %d\n", n, oSum);

	}
}
