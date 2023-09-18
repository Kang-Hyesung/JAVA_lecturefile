/*==========================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface)
==========================*/

// �������̽�
interface ADemo
{
	public void write();
}

// �������̽�
interface BDemo
{
	public void print();		
}

// �������̽��� 2�� �̻��� ����(implements)�� �� �ִ�.
// -> Ŭ�������� ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ����

// Ŭ����
// class DemoImpl
// class DemoImpl extends ADemo, BDemo   // x
// class DemoImpl implements ADemo, BDemo

// �߻� Ŭ���� - �� �������̽��� �����ϴ� �߻� Ŭ����
//abstract class DemoImpl implements ADemo, BDemo

// Ŭ���� - �� �������̽��� ������ �� -> �� �������̽��� ��� �޼ҵ带 Overriding -> �Ϲ� Ŭ����
class DemoImpl implements ADemo, BDemo
{
	// JDK 1.5(5.0)������ �������̽� �޼ҵ带 �������̵�(Overriding)�� �� @Override ������̼��� ����� �� ����.
	// JDK 1.6(6.0) ���ĺ��� ���� ������ �����̴�. ��, ��ӹ��� Ŭ������ �޼ҵ带 �������̵�(Overriding)�� ������
	// JDK 1.5(5.0)������ ������̼�(anotation) ����� �����ϴ�.
	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()...");
	}
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test118
{
	public static void main(String[] args)
	{
		// ADemo ob = new ADemo(); �������̽��� �ν��Ͻ� ���� �Ұ���(�߻�Ŭ������ �ȵǴµ�)
		// BDemo ob = new BDemo(); �������̽��� �ν��Ͻ� ���� �Ұ���(�߻�Ŭ������ �ȵǴµ�)
		
		// ADemo, BDemo �������̽��� ����(implements)��
		// Ŭ����(-> DemoImpl) ����� �ν��Ͻ� ����
		DemoImpl ob1 = new DemoImpl();	// �̻� ����

		ob1.write();
		//== ADemo �������̽� �޼ҵ� write()...

		ob1.print();
		//== BDemo �������̽� �޼ҵ� print()...
		

		// �� �� �� ĳ����
		ADemo ob2 = new DemoImpl();
		BDemo ob3 = new DemoImpl();

		//ob2.print();		//ob2���� print�޼ҵ尡 ����
		//==  cannot find symbol ������ ����
		//ob3.write();		//ob3���� write�޼ҵ尡 ����
		//==  cannot find symbol ������ ����

		ob2.write();
		ob3.print();
		// ADemo �������̽� �޼ҵ� write()...
		// BDemo �������̽� �޼ҵ� print()...

		((BDemo)ob2).print();
		//== BDemo �������̽� �޼ҵ� print()...
		((ADemo)ob3).write();
		//== ADemo �������̽� �޼ҵ� write()...
		// DemoImpl Ŭ������ �� �������̽�(ADemo, BDemo)�� ��� �����߱� ������
		// �̿� ���� ó���� �����ϴ�.
		// ����, DemoImpl Ŭ������ �� �������̽��� �� �� �������̽��� �����ߴٸ�
		// �� ������ ��Ÿ�� ������ �߻��ϴ� ������ �ȴ�.
		

		// �ٿ� ĳ����
		((DemoImpl)ob3).write();


	}
}

// ������ �������̽��� ���� �̸��� �޼ҵ尡 ���� �� �����ؼ� Overriding�ϴ� ����� �ִ��� ������ ������ �������