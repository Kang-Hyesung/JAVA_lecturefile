public class Test022
{
	public static void main(String args[])
	{
		int a = 13, b = 7;
		int c, d, e;

		c = a & b; // ��Ʈ�� �� �� 1�϶��� 1
		d = a | b; // ��Ʈ�� �� �� �ϳ��� 1�̶� 1
		e = a ^ b; // ��Ʈ�� ���� �ٸ����� 1

		System.out.printf("a & b : %d\n", c);
		System.out.printf("a | b : %d\n", d);
		System.out.printf("a ^ b : %d\n", e);
	}
}

// ���� ���

/*
a & b : 5
a | b : 15
a ^ b : 10
*/

