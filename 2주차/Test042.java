/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - switch�� �ǽ�
==========================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��. switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���� ���·� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�    : 3
// �� ��° ���� �Է�    : 17
// ������ �Է�[+ - * /] : -

// >> 3 - 17 = -14
// ����Ϸ��� �ƹ� Ű��...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
		int num1,num2;
		int op;
		int result;   //

		System.out.print("ù ��° ���� �Է�    :  ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�    :  ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] :  ");
		op = System.in.read();
*/
/*
		switch(op)
		{
			case 43: System.out.printf("\n>> %d + %d = %d\n", num1, num2, num1 + num2); break;
			case 45: System.out.printf("\n>> %d - %d = %d\n", num1, num2, num1 - num2); break;
			case 47: System.out.printf("\n>> %d / %d = %d\n", num1, num2, num1 / num2); break;
			case 42: System.out.printf("\n>> %d * %d = %d\n", num1, num2, num1 * num2); break;
		}
*/
		// ����
		/*
		int a,b;
		int op;
		int result;   //

		System.out.print("ù ��° ���� �Է�    :  ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�    :  ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] :  ");
		op = System.in.read();

		switch(op)
		{
			case 43: result = a + b; break;
			case 45: result = a - b; break;
			case 47: result = a * b; break;
			case 42: result = a / b; break;
			default: return;				// ���� ��ȯ, 
											// �޼ҵ� ����(���⼭�� main�޼ҵ带 �ǹ��Ѵ�) -> ���α׷� ����
		}

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
		*/

		// �� ��° Ǯ��
/*
		int a,b;
		char op;
		int result;

		System.out.print("ù ��° ���� �Է�    :  ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�    :  ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] :  ");
		op = (char)System.in.read();

		switch(op)
		{
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; break;
			default: return;				// ���� ��ȯ, 
											// �޼ҵ� ����(���⼭�� main�޼ҵ带 �ǹ��Ѵ�) -> ���α׷� ����
		}

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
*/
		int a,b;
		int result;   
		String op;

		System.out.print("ù ��° ���� �Է�    :  ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է�    :  ");
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] :  ");
		op = br.readLine();

		switch(op)
		{
			case "+": result = a + b; break;
			case "-": result = a - b; break;
			case "*": result = a * b; break;
			case "/": result = a / b; break;
			default: return;				// ���� ��ȯ, 
											// �޼ҵ� ����(���⼭�� main�޼ҵ带 �ǹ��Ѵ�) -> ���α׷� ����
		}

		System.out.printf("\n>> %d %s %d = %d\n", a, op, b, result);

	}
}