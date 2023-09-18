/*=========================
  ���� Ŭ���� ��� ����
  - ���(Inheritance)
==========================*/

/*
 ������ ���� ���α׷��� �����Ѵ�.
 ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

 ���� ��)
 ������ �� ���� �Է�(���� ����) : 20 10
 ������ �Է�(+ - * /) : -
 >> 20 - 10 = 10
 ����Ϸ���..
*/

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Aclass
{
	protected int x,y;
	protected char op;			//double result�� ����Ǿ����� �ʱ� ������ �ؿ��� �����ؾ� �Ѵ�
	Aclass()
	{

	}

	void write(double result)
	{
		System.out.printf("\n>> %d %c %d = %.2f\n", x, op, y, result);
	}
}

// Aclass �� ��ӹ޴� Ŭ������ ����
class Bclass extends Aclass
{
	/*				�� Ǯ��
	Bclass() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		x = sc.nextInt();
		y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
	}
	

//	void input() throws IOException
//	{
//		Scanner sc = new Scanner(System.in);
//		System.out.print("������ �� ���� �Է�(���� ����) : ");
//		x = sc.nextInt();
//		y = sc.nextInt();
//
//		System.out.print("������ �Է�(+ - * /) : ");
//		op = (char)System.in.read();
//	}

	double cal()
	{
		double result = 0.0;

		switch(op)
		{
			case '+' : result = x + y; break;
			case '*' : result = x * y; break;
			case '-' : result = x - y; break;
			case '/' : result = (double)x / y; break;
		}
		return result;
	}
	
					���� --------------------------------------
*/
	Bclass()
	{
		// super();
	}

	boolean input() throws IOException
	{
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : ");  // 20 10
		String temp = br.readLine();

		// ���ڿ�.split("������");
		// ���ڿ�.split("\\s");		// ������ == ����
		//
		// ex)"10 20 30 40 50".split("\\s");
		//			-> ��ȯ -> {"10", "20", "30", "40", "50"} -> ���ڿ� �迭
		// ex) "010-1234-5678".split("-");
		//     -> ��ȯ -> {"010", "1234", "5678"}

		String[] strArr = temp.split("\\s");		// "20 10" -> String[] strArr = {"20", "10"};

		//if(temp.length() != 2)
		if(strArr.length != 2)
			return false;
		// false�� ��ȯ�ϸ� input() �޼ҵ� ����
		// �� ������ �����Ͽ� if���� �����ϰ� �� ���..
		// �Ʒ� �����ؾ� �� �ڵ尡 �����ִ���
		// �����(-> false)�� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);
		// this.x = Integer.parseInt(strArr[0]);
		// super.x = Integer.parseInt(strArr[0]);

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();

		if(op != '+' && op != '-' && op != '*' && op != '/')
		{
			return false;
		}

		return true;

	} // end input()

	double calc()
	{
		double result = 0.0;
		
		switch(op)
		{
			case '+' : result = x + y; break;
			case '*' : result = x * y; break;
			case '-' : result = x - y; break;
			case '/' : result = (double)x / y; break;
		}

		return result;
	}// end calc()

	// write ��� �޾ұ� ������ ��¸޼ҵ� ������ �ʿ� ����.


}
// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test113
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();

		// ob.input(); boolean��ȯ���̱� ������ �ٸ� ���·� ȣ������

		boolean resp = ob.input();

		if(resp != true) // == (!resp); == (!ob.input());
		{
			System.out.println("Error...");
			return;							//���α׷� ����
		}
		
		double result = ob.calc();
		ob.write(result);

		//ob.write(ob.cal());
	}
}