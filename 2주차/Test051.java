/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - �ݺ���(while��) �ǽ� �� ����
==========================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// �Է¹��� �� ���� ��
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 100
// �� ��° ���� �Է� : 200
// >> 100 ~ 200 ������ �� : xxxxx
// ����Ϸ��� �ƹ� Ű�� ��������....

// ù ��° ���� �Է� : 1000
// �� ��° ���� �Է� : 2
// >> 2 ~ 1000 ������ �� : xxxxx


// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 10
// >> 2 ~ 1000 ������ �� : 10

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test051
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
		int a,b;			// �Է� ���� ��
		int sum = 0;		// ������
		int c;				// flag
		
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		

		// �� Ǯ��

		if (a > b)
		{
			c = b;
			while(b <= a)
			{
				sum += b;
				b++;
			}
			System.out.printf(">> %d ~ %d ������ �� : %d\n", c, a, sum);
		}
		else if(a < b)
		{
			c = a;
			while(a <= b)
			{

				sum += a;
				a++;
			}
			System.out.printf(">> %d ~ %d ������ �� : %d\n", c, b, sum);
		}
		else
		{
			sum = a;
			System.out.printf(">> %d ~ %d ������ �� : %d\n", a, b, sum);
		}

		// �ٸ� Ǯ��
		if(a > b)
		{
			a = a ^ b;
			b = b ^ a;
			a = a ^ b;
		}
		int i = a;

		while (a <= b)
		{	
			sum += a;
			a++;
		}
		System.out.printf(">> %d ~ %d ������ �� : %d\n", i, b, sum);
*/
		// �ֿ� ���� ����

		int n;
		int su1, su2;
		int result = 0;		// ������

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		// �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		if(su1 > su2)
		{
			// �ڸ� �ٲ�
			su1 = su1 ^ su2;
			su2 = su2 ^ su1;
			su1 = su1 ^ su2;
		}

		// �ݺ� ���� ����
		// �ݺ� ������ �����ϱ� ����
		// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		// (��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ�...
		// �� ���� �ݺ� �������� ����ϰ� �Ǹ�...
		// ���� ó�� �Էµ� ���� Ȯ���� �� ���� ������..)
		n  = su1

		while(n <= su2)
		{
			result += n;
			n++;
		}

		// ��� ���
		System.out.printf(">> %d ~ %d ������ �� : %d\n", su1, su2);
		

	}
}
	