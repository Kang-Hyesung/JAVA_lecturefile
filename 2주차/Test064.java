/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - break �ǽ�
==========================================*/

// ������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ 1 ~ 100 ���� �ȿ�����
// �����ϵ��� ó���Ѵ�.

// ���� ��)
//
// ������ ���� �Է� : -10
// 
// ������ ���� �Է� : 0
//
// ������ ���� �Է� : 2023
//
// ������ ���� �Է� : 10
// >> 1 ~ 10 ������ �� : 55
// ����Ͻðڽ��ϱ�(Y/N)? : y
//
// ������ ���� �Է� : 100
// >> 1 ~ 10 ������ �� : 55
// ����Ͻðڽ��ϱ�(Y/N)? : N
// ����Ϸ��� �ƹ� Ű�� ��������   -> ���α׷� ����

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*	
		int n;		// �Է� ���� ����
		int sum = 0;
		char c;		// y,Y,n,N
		
		�� Ǯ�� 
		do
		{
			do
			{
				System.out.print("������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
				
			}
			while (n < 1 || n > 100);
			sum = 0;
			for(int i = 1; i <= n; i++)
				sum += i;

			System.out.printf(">> 1���� %d ������ �� : %d\n", n, sum);
			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			c = (char)System.in.read();
			System.in.skip(2);

		}
		while (c == 'y' || c == 'Y');

		����-----------------------------------------------------------
*/
		// ������ ������ �ʱ�ȭ ��ġ check
		//int n, s = 0, i;		// n �Է°� s ������ i 1���� 1�� n��ŭ ����
		int n,i,s;

		char ch;
		// ���μ����� ��� �������� ������ ���θ� ��Ƶ� ����
		
		while(true)
		{
			// ���� ����
			do
			{
				System.out.print("\n������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n < 1 || n > 100);

			// �׽�Ʈ
			// System.out.println("��ȿ�� ���� �Է� �Ϸ�");

			// ������ ������ �ʱ�ȭ ��ġ check
			s = 0;

			for(i = 1; i <= n; i++)
				s += i;		// ������ ����

			System.out.printf(">> 1 ~ %d ������ �� : %d\n", n, s);
			
			System.out.print("����Ͻðڽ��ϱ�(Y/N)? : ");
			ch = (char)System.in.read();	// ������� ����
			
			// �׸��̸� ��������
			//if (ch == 'n' || ch == 'N')

			if (ch != 'y' && ch != 'Y')		// Y �Ǵ� y �Է��Ѱ� �ƴѰ� �¾�?
			// || �� �ϸ� y�� �Է����� �� �빮�� Y�� �ƴѰ� �����Ƿ� true�� ó���� �� �ִ�.
			{
				// �ݺ����� ���߰� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				// �� ���� ���� �ǻ� ǥ���� �ߴٸ�
				// �׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
				break;
				// ����� + ����������
			}// end if

			// ���Ͱ�(\r\n) ó��
			System.in.skip(2);
			
			
		
		}// end while(true)
	
	}
}