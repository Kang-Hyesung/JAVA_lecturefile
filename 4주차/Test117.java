/*==========================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface)
==========================*/

/*
�� �������̽�(Interface)��

   ������ �̿ϼ��� ä�� ������
   �������̽� �ȿ� �����ϴ� �� � �޼ҵ嵵
   ��ü(���Ǻ�)�� ���� ������ ��ǻ� ���� �κ��� �������� �ʴ´�.
   Ŭ������ ���� ���ø����ν��� ����� �����ϴ�
   �߻� Ŭ������ �� �����̴�.

�� �������̽��� Ŭ������ �޸� ���� ����� �����ϸ�
   �������̽� ��ü�� ��ӵȴ�.
   ������ C++ ��� ��� �����Ǵ� ���� �����
   ��� �������� ���� �������� ������ױ� ������
   �ڹٿ����� ���� ����� ������ �������̽���� �������� �����Ͽ�
   �������̽��� ���� ���� ����� �����ϴ� ����� �����Ѵ�.

�� �������̽��� ����� �߻� �޼ҵ常 ���� �� ������
   �������̽� ���� �޼ҵ���� �������������ڸ� ������� �ʾƵ�
   public ���� �����Ǿ� Ŭ�������� ����(implements)�����ν�
   �ٷ� ������ �̷���� �� �ִ�.

�� Ư¡
   - �߻� Ŭ������ �������� ���� �ְ� ���ǰ� ����.
   - final ������ ���� �� �ִ�. (����� ����)
   - �������̽��� public static final ����� ���� �� �ִ�.
   - �������̽��� �����ϱ� ���ؼ��� extends ��ſ�
     inplements �� �̿��Ѵ�
   - �ϳ� �̻��� �������̽��� implements �� �� �ִ�.
   - �������̽��� implements �� Ŭ������
     �������̽��� ��� �޼ҵ带 Overriding �ؾ� �Ѵ�.
   - �������̽��� �ٸ� �������̽��� ��ӹ��� �� ������
     �� ��, extends Ű���带 ����Ѵ�.
	 ����, Ŭ������ �޸� �������̽��� ���� ����� �����ϴ�.

*/

// �������̽�
interface Demo
{
	public static final double PI = 3.141592;
	
	// �������̽��� ��� ������
	// static final �� ������ ������� �ʴ��� �ڵ����� �ٿ��ش�.
	public int a = 10;
	
	// �������̽��� �޼ҵ�� ���� ����(���� �Ұ�)
	// �ڵ����� abstract �� ����
	// public abstract void print();
	public void print();
	/* ���� �ؾ� ��
	{
		System.out.println("PI : " + PI);
	}
	*/
}

// Ŭ����
// class DemoImpl
// class DemoImpl extends Demo     // x
// class DemoImpl implements Demo

// �߻� Ŭ���� - �������̽��� �����ϴ� �߻� Ŭ����
// abstract class DemoImpl implements Demo
// Ŭ���� - �������̽��� �����ϴ� Ŭ���� ( print() �޼ҵ� ������)
class DemoImpl implements Demo
{
	@Override
	public void print()
	{		
		System.out.println("�������̽� �޼ҵ� ������...");
	}

	public void write()
	{
		System.out.println("Ŭ������ ���ǵ� �޼ҵ�...");
	}
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test117
{
	public static void main(String[] args)
	{
		// Demo ob = new Demo();		// ���� �Ұ�
		// �������̽��� �ν��Ͻ��� ������ �� ����(�߻�Ŭ������ �ȵǴµ�)

		// DemoImpl ob = new DemoImpl();
		//-- �������̽��� implements �� �� ���¿����� �Ұ�
		// print() �޼ҵ�(-> �߻� �޼ҵ�)�� �������� ��
		// abstract ���¿��� ��� �� ����

		//DemoImpl obTemp = new DemoImpl();
		//Demo ob = (Demo)obTemp; == //Demo ob = obTemp;

		// �� �� ĳ����
		// �������̽� ��ü�� ���� ��ü
		Demo ob = new DemoImpl();
		ob.print();
		//== �������̽� �޼ҵ� ������...




		// ob.write();			���� ��ü���� ���� ��ü ����� ����
		//== cannot find symbol ������ ����


		// �ٿ� ĳ����
		((DemoImpl)ob).write();
		//== Ŭ������ ���ǵ� �޼ҵ�...

		System.out.println(Demo.PI);  // static�̾ ���� ����
		//== 3.141592  

		System.out.println(Demo.a);	  // �ڵ����� static �ٿ���
		//== 10

		// Demo.a = 300;
		//== cannot assign a value to final variable a  == final �ѹ� ������ ���� �Ұ�

	}
}