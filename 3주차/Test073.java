	/*================================
	   ���� Ŭ������ �ν��Ͻ� ����
	=================================*/

	// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
	// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
	// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
	// (Calculate Ŭ���� ����)

	// ���� ��)
	// ������ �� ���� �Է�(���� ����) : 100 51
	// ������ ������(+ - * /)		  : +

	// >> 100 + 51 = 151
	// ����Ϸ��� �ƹ� Ű�� ��������...

	import java.util.Scanner;
	import java.io.IOException;

	class Calculate
	{
		int su1, su2;
		char op;
		
		void input() throws IOException		
		{
			Scanner sc = new Scanner(System.in);

			System.out.print("������ �� ���� �Է�(���� ����) : ");
			su1 = sc.nextInt();
			su2 = sc.nextInt();

			System.out.print("������ ������(+ - * /)		: ");
			op = (char)System.in.read();
		}

		int cal()									// ���� ��� -> ������ ���굵 ���� ������� ó��
		{
			int result = -1;

			switch(op)
			{
				case '+': result = su1 + su2; break;
				case '-': result = su1 - su2; break;
				case '*': result = su1 * su2; break;
				case '/': result = su1 / su2; break;
				//default : result = -1;
			}

			return result;	
		}

		void print(int s)							// ���
		{
			System.out.printf("\n>> %d %c %d = %d\n", su1, op, su2, s);
		}
	}
	/*
	{
		int a,b,ans;		// �Է� ���� �� ���ڿ� ���� ���
		char c;

		void input() throws IOException
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("������ �� ���� �Է�(���� ����) : ");
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.print("������ ������(+ - * /)		: ");
			c = (char)System.in.read();
		}

		void cal()
		{
			if(c == '+')
				ans = a + b;
			else if(c == '-')
				ans = a - b;
			else if(c == '*')
				ans = a * b;
			else
				ans = a / b;
		}

		void print()
		{
			System.out.printf("\n>> %d %c %d = %d\n", a, c, b, ans);
		}

	}				
	*/
	public class Test073
	{
		public static void main(String[] args) throws IOException
		{	
	/*		�� Ǯ��
			Calculate cl = new Calculate();

			cl.input();

			cl.cal();

			cl.print();
			����--------------------------------------------------*/
			
			Calculate cal = new Calculate();

			cal.input();			// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
			int r = cal.cal();		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
			cal.print(r);			// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		}
	}