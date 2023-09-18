/*==========================
  ���� Ŭ���� ��� ����
       - ��ø Ŭ����
==========================*/

/*
�� Annonymous Ŭ����(�͸��� Ŭ���� : ���� Ŭ����)

   - AWT �� �ȵ���̵� �̺�Ʈ ó������ �Ϲ������� ���
   - ���� Ŭ���� �޼ҵ带 �ϳ� ���� �������� �ʿ伺�� ���� �� ���
   - Ŭ������ ��ü�� �ǿ��ϸ� �� �ٽ� Ŭ������ �����ؾ� �ϴ�
     ���ŷο����� ���� ����ϰ� ��ü ������ �ʿ��� ���
	 �͸��� Ŭ������ �����Ͽ� ó���� �� �ִ�.


�� ���� �� ����

   new ���� Ŭ������ ������()
   {
	   �������������� �ڷ��� �޼ҵ�()
	   {
		   ...;
	   }
   };			<- üũ  �����ݷ�
*/

// import java.lang.Object;
import java.lang.*;		// �� ������ �׻� import �Ǿ� �ִ�.

class TestObj // extends Object
{
	/*
	Object �� �����
	...;

	public String toString()
	{
		...;
	}

	...;
	*/
/*
	@Override
	public String toString()
	{
		...; // ��ӹ��� �޼ҵ��̹Ƿ� �������̵� ����
	}
*/	
	public Object getString()
	{
		/*
		Object ob = new Object();
		ob.xx();
		ob.yyy();
		ob.zzzz();

		return ob;
		*/

		//return new Object(); // �� �ּ��� ���� �ǹ�
		//	     ------------ Object ��

		return new Object()
		{
			// Ư�� �޼ҵ� �籸�� -> ������
			@Override
			public String toString()
			{
				return "�͸��� Ŭ����";
			}

		};
	}
}

// import java.lang.*

public class Test125		// extends Object
{
	/*
	Object�� ����� ���
	*/

	public static void main(String[] args)
	{
		TestObj ob = new TestObj();

		System.out.println(ob.toString());
		//TestObj@15db9742

		System.out.println(ob.getString());
		//�͸��� Ŭ����
	}
}