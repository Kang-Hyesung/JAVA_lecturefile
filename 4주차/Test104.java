/*==================================================================
  ���� Ŭ������ �ν��Ͻ� ����
 - �޼ҵ� �����ε�(Method Overloading)�� ������ ���¿� �Ұ����� ����
===================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print('A');

		print(20);

		print(3.14);

		double result = print(3.14);
	}

	public static void print() {}
	//public static void print() {}					         ���x
	public static void print(int i) {}			          // ����
	//public static void print(int j) []			         14���� �ߺ� == ��� x
	public static void print(char c) {}				      // ���� but �ڵ� �� ��ȯ ����
	public static void print(int i, int j) {}		      // ����
	public static void print(double d) {}				  // ���� but �ڵ� �� ��ȯ ����
	//public static void print(double e) {return 10.0;}	     ��ȯ�� �߸���
	//public static double print(double d) {return 10.0;} // �ȵ�
}