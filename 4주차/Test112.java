/*=========================
  ���� Ŭ���� ��� ����
  - ���(Inheritance)
==========================*/

/*
 super
  static���� ������� ���� �޼ҵ忡�� ���Ǹ�
  ���� Ŭ������ ��ӹ��� ���� Ŭ������ ��ü�� ����Ų��.
  super�� ���� Ŭ������ �����ڸ� ȣ���ϰų�
  ���� Ŭ������ ��� ���� �Ǵ� �޼ҵ带 ȣ���� �� ����� �� �ִ�.

  ���� Ŭ������ �����ڿ��� ���� Ŭ������ �����ڸ� ȣ���� ������
  ���� Ŭ������ ������ ���� �������� �� ó������ ��ġ�� �� �ִ�.

 �����ڿ� Ŭ���� ��Ӱ��� ����
  ���� Ŭ������ ���� Ŭ������ ����� ��ӹ�����,
  �����ڴ� ��� ��󿡼� ���ܵȴ�.
  �׸���, ���� Ŭ������ �����ڸ� ȣ���� ��
  �ڵ����� ���� Ŭ������ �����ڸ� ȣ���ϰ� �ȴ�.
  �� ��, ���� Ŭ������ �����ڴ�
  �μ��� ���� ������(default ������ ����)�� ȣ��ȴ�.

  ���� Ŭ���� �� ���� Ŭ����(��, ��Ӱ��迡 �ִ� Ŭ����)�� �����ϴ� ��������
  ���� Ŭ������ �����ڸ� �������� �ʰų� == default �����ڸ� �ִ� ���
  �μ��� ���� �����ڸ��� ������ ���
  ��������� ���� Ŭ�������� ���� Ŭ������ �����ڸ� ȣ������ �ʾƵ�
  �ƹ��� ������ �߻����� ������
  ���� Ŭ������ ���ڰ� �ִ� �����ڸ� �����ϴ� ���
  �����ؾ� �Ѵ�.

  ���� ���
class Aclass
{
	Aclass(int n)
	{
	}
}

class Bclass extends Aclass
{
	Bclass()
	{
		super();
	}
}

  ���� Ŭ������ Bclass �� �����ڿ���
  ��������� Aclass �� �����ڸ� ȣ������ ������
  �ڵ����� ���� ���� �����ڸ� ȣ���Ѵ�.
  ������, Aclass ���� ���ڰ� �ִ� �����ڸ� �����ϰ�
  ���ڰ� ���� �����ڴ� �������� �ʱ� ������ ���� �߻��Ѵ�.
  ����, Bclass �������� ���ο�
  ����ó�� ��������� ���� Ŭ������ ������ ȣ�� ������ �ۼ��ؾ� �Ѵ�.

class Aclass
{
	Aclass(int n)
	{
	}
}

class Bclass extends Aclass
{
	Bclass()
	{
		super(10);  // Aclass���� �����ڿ� int n �̶�� �Ű������� �ʿ��ϹǷ� 10�� �־ Bclass �����ڸ� �������ش�
		...;
		...;
	}
}


��� �� ������ ����
  ���� Ŭ�������� ����� ��� ������ �̸���
  ���� Ŭ�������� ����� ��� ������ �̸��� ������
  ���� Ŭ������ ��� ������ ���õȴ�.
  �� ��, ���� Ŭ������ ��� ������ ����ϱ� ���ؼ���
  super Ű���带 �̿��Ѵ�. ex) super.������

  ������ �̸��� ��� ������ ������ �̸��� �޼ҵ尡
  �� Ŭ���� �ȿ� ����ǰų� ���ǵǴ� ��� �⺻������ ���� �߻��Ѵ�.
  ��, �޼ҵ��� ��쿡�� �Ű������� ������ Ÿ���� �ٸ� ���
  ���� �߻����� �ʰ� �̵��� ���� �ٸ� �޼ҵ�� ����ϰ� �ȴ�.
*/
// Rect112 Ŭ������ Circle112 Ŭ������ �θ� Ŭ����
class SuperTest112
{
	protected double area;
	private String title;

	public SuperTest112()
	{
		System.out.println("SuperTest112... ���� ���� ������");
	}

	public SuperTest112(String title)
	{
		this.title = title;
		System.out.println("SuperTest112... ���ڿ��� �Ѱܹ޴� ������");
	}

	public void write()
	{
		System.out.println(title + " - " + area);
	}
}
// SuperTest112 Ŭ������ ��ӹ޴� �ڽ� Ŭ����(���� ���)
class Rect112 extends SuperTest112
{
	/* ������� �����޴´�
	protected double area;
	private String title;

	public SuperTest112()
	{
		System.out.println("SuperTest112... ���� ���� ������");
	}

	public SuperTest112(String title)
	{
		this.title = title;
		System.out.println("SuperTest112... ���ڿ��� �Ѱܹ޴� ������");
	}

	public void write()
	{
		System.out.println(title + " - " + area);
	}
	*/

	private int w,h;

	public Rect112()
	{
		// super();
	}

	public void calc(int w, int h)
	{
		this.w = w;
		this.h = h;
		area = (double)this.w + this.h;
		write();
	}

	public void write()
	{
		System.out.println("w : " + w + ", h : " + h);
		System.out.println("�簢�� - " + area);
	}
}
// SuperTest112 Ŭ������ ��ӹ޴� �ڽ� Ŭ����(���� ���)
class Circle112 extends SuperTest112
{
	/* ������� �����޴´�
	protected double area;
	private String title;

	public SuperTest112()
	{
		System.out.println("SuperTest112... ���� ���� ������");
	}

	public SuperTest112(String title)
	{
		this.title = title;
		System.out.println("SuperTest112... ���ڿ��� �Ѱܹ޴� ������");
	}

	public void write()
	{
		System.out.println(title + " - " + area);
	}
	*/

	public Circle112(String title)
	{
		// super();
		super(title);
	}

	public void calc(int r)
	{
		area = r * r * 3.141592;
		write();
	}
}

// ----------------------------------------------------------------

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test112
{
	public static void main(String[] args)
	{
		// Rect112 Ŭ����(�ڽ� Ŭ����) ��� �ν��Ͻ� ����
		Rect112 ob1 = new Rect112();
		//== SuperTest112... ���� ���� ������

		// Circle112 Ŭ����(�ڽ� Ŭ����) ��� �ν��Ͻ� ����
		// Circle112 ob2 = new Circle112(); 
		// ������ ����
		// Circle112 Ŭ�������� �Ű������� �ʿ���ϴ� ��������� �����ڰ� ������� ������
		// �̷� ���� default �����ڰ� �ڵ����� ���Ե��� �ʴ� ��Ȳ

		// Circle112 Ŭ����(�ڽ� Ŭ����) ��� �ν��Ͻ� ����
		Circle112 ob3 = new Circle112("��");
		//== SuperTest112... ���� ���� ������					super(title); �ֱ� ��
		//== SuperTest112... ���ڿ��� �Ѱܹ޴� ������			super(title); ���� ��

		ob1.calc(10, 5);

		ob3.calc(10);


	}
}