/*================================
   ���� Ŭ������ �ν��Ͻ� ����
=================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1 ���� �Է¹��� �� ������ ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, ���ݱ���ó�� main() �޼ҵ忡 ��� ����� �����ϴ� ���� �ƴ϶�
// Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// (Hap) Ŭ���� ����
// ����, ������ �Է� ó�� �������� BufferedReader �� readLine() �� ����ϸ�,
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~1000) : 1200
// ������ ���� �Է�(1~1000) : -50
// ������ ���� �Է�(1~1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
/*		�� Ǯ��
	int n,sum;

	void input() throws IOException
	{
		do
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է�(1~1000) : ");
		n = Integer.parseInt(br.readLine());
		}
		while(n < 1 || n > 1000);
	}

	void calSum()
	{
		for(int i = 1; i <= n; i++)
		{
			sum += i;
		}
	}

	void print()
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", n, sum);
	}
		����----------------------------------------------*/


	// �ֿ� ���� ����(������� �Է°��� ��Ƴ� ����
	int su;

	// �Է� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do
		{
			System.out.print("������ ���� �Է�(1~1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su < 1 || su > 1000);
	}

	// ���� ó�� �޼ҵ� ����
	int calculate()
	{
		int result = 0;
		
		for(int i = 1; i <= su; i++)
		{
			result += i;
		}
		return result;
	}

	// ��� ��� �޼ҵ� ����
	void print(int sum)
	{
		System.out.printf("\n>> 1 ~ %d ������ �� : %d\n", su, sum);
	}
}


public class Test072
{
	public static void main(String[] args) throws IOException
	{
/*		�� Ǯ��
		Hap hp = new Hap();

		hp.input();

		hp.calSum();

		hp.print();
		���� ------------------------------------------------*/
		
		Hap ob = new Hap();
		
		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		//  --------------
		//  �������� Ȱ��

		ob.input();			// �������� ob Ȱ��  // new Hap().input() �� ������ �ϴ�
		
		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		int s = ob.calculate();

		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��  
		ob.print(s);		// == ob.print(ob.calculate();)

/*
������ ���� �Է�(1~1000) : -7
������ ���� �Է�(1~1000) : 10000
������ ���� �Է�(1~1000) : 15

>> 1 ~ 15 ������ �� : 120
*/
	}
}
