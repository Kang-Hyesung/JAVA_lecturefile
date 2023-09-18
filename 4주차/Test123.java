/*==========================
  ���� Ŭ���� ��� ����
       - ��ø Ŭ����
==========================*/

// outer
class Test2
{
	static int a = 10;
	int b = 20;

	void write()											// ù ��° write() �޼ҵ�
	{
		System.out.println("write()... 1");
		final int c = 20;
		int d = 40;
		
		// inner class
		// �޼ҵ� �ȿ� �����ϴ� �Ǵٸ� Ŭ����(���� Ŭ����, local class, ���� Ŭ����)
		class LocalTest
		{
			void write()									// �� ��° write() �޼ҵ�
			{
				System.out.println("write()... 2");
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);
				//System.out.println("d : " + d); �����Ͽ���
			}
		}
		d++;

		// ���� c �� ���� d �� �� �� ��������������(ù ��° write() �޼ҵ忡�� ����� �����̹Ƿ�)
		// c �� final �����̱� ������ �� ��° write() �޼ҵ忡�� ���������ϴ��� 
		// ������ �� 20�� ��������� ������� �� �ִ�. �ݸ鿡 d �� �� ���� ���÷� ��ȭ�� �� �ִ� ��Ȳ�̹Ƿ�
		// LocalTest Ŭ������ �ν��Ͻ� ���� ������ ������ ���� �� �� ���� ������
		// �̷� ���� �ν��Ͻ� ���� ������ d �� � ���� ����ִ����� ������� �� ���� �ȴ�.
		// ���� d�� �����ϴ� ���� ���� �� �ֵ��� ���������� ó���ϴ� ���̴�

		// LocalTest Ŭ���� ��� �ν��Ͻ� ����(-> inner)
		LocalTest lt = new LocalTest();
		lt.write();											// �� ��° write()�޼ҵ� ��


	}
}
public class Test123
{
	public static void main(String[] args)
	{
		// Test2 Ŭ���� ��� �ν��Ͻ� ����(-> outer)
		Test2 ob = new Test2();
		ob.write();										   // ù��° write() �޼ҵ� ȣ��
		// ������ ����
		// d�� �ν��Ͻ� ������ �� ��° write�� �ν��Ͻ� ���������� final �� ���� c�ʹ� �ٸ��� ���� ���ɼ��� ũ�⶧���� ����
	}
}