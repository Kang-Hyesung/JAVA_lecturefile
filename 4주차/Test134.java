/*===========================================
       ���� �ڹ��� �ֿ� Ŭ���� ����
 - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
 - Wrapper Ŭ����
============================================*/

public class Test134
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		//== 3
		//   256

		print(b2);
		print(i2);
	}

	static void print(Number a) // Number�� Integer Byte ���� ���� Ŭ������ ��� ���� �� �ִ�.
	// java.lang.Number Ŭ������ ��� ������ Wrapper Ŭ������ �θ� Ŭ�����̴�.
	// b2, i2 �� �ش��ϴ� �ڷ����� Number �� �Ѿ���鼭 �� ĳ������ �Ͼ�� �ȴ�.
	{	
		System.out.println(a);

		/*
		if(a instanceof Integer) // n �� Integer������� ������� ��ü���
		{
			System.out.println(a.intValue());
		}

		else if(a instanceof Double)
		{
			...
		}

		...
		*/
	}

	// Number n = new Integer(); Number�� �߻� Ŭ�����̹Ƿ� Integer ��ü�� ��ĳ�����ؼ� ���� �� �ִ�.

}