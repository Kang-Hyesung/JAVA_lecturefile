// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 10
// �� ��° ���� �Է�    : 3
// ������ �Է�[+ - * /] : +

// >> 10 + 3 = 13
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int num1, num2;
		char c;
		

		System.out.print("ù ��° ���� �Է�    :   ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�    :   ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] :   ");
		c = (char)System.in.read();
		

		// �� Ǯ��
		if(c == '+')
		{
			System.out.printf("%d %c %d = %d\n", num1, c, num2, num1 + num2);
		}
		else if(c == '-')
		{
			System.out.printf("%d %c %d = %d\n", num1, c, num2, num1 - num2);
		}
		else if(c == '*')
		{
			System.out.printf("%d %c %d = %d\n", num1, c, num2, num1 * num2);
		}
		else if(c == '/')
		{
			System.out.printf("%d %c %d = %d\n", num1, c, num2, num1 / num2);
		}
		else
		{
			System.out.printf("WRONG MARK\n");
		}
		*/
		// ����
/*
		int a,b;
		char op;

		System.out.print("ù ��° ���� �Է�    :   ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�    :   ");
		b = Integer.parseInt(br.readLine());

		// Integer.parseInt()
		// "1234"  -> Integer.parseInt() -> 1234
		// "abcd"  -> Integer.parseInt() -> (x)

		System.out.print("������ �Է�[+ - * /] :   ");
		//c = (char)Integer.parseInt(br.readLine());		 �ȵ�
		op = (char)System.in.read();
		
		// �׽�Ʈ
		//System.out.println("�Է��� ������ : " + op);     �� ����

		// + == 43       - == 45		 * == 42		/ == 47

		if(op == 43)
		{
			System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a + b);
		}
		else if(op == 45)
		{
			System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a - b);
		}
		else if(op == 42)
		{
			System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a * b);
		}
		else if(op == 47)
		{
			System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a / b);
		}
		else
		{
			System.out.println("\n>>�Է� ������ ������ �����մϴ�.");
		}
*/

		// �� ��° Ǯ�̴� �� Ǯ�̿� ����
		
		// �� ���� Ǯ��
		int a, b, result = 0;
		char op;

		System.out.print("ù ��° ���� �Է�    : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է�    : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		op = (char)System.in.read();

		if(op == '+')
			result=a+b;
		else if(op == '-')
			result=a-b;
		else if(op == '*')
			result=a*b;
		else if(op == '/')
			result=a/b;

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);

	}
}
