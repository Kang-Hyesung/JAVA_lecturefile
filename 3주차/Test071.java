/*================================
   ���� Ŭ������ �ν��Ͻ� ����
=================================*/

// CircleTest.java ���ϰ� �� ��Ʈ

// BufferedReader�� Input���� �߰����� �ʿ䰡 ����.
import java.io.IOException;


public class Test071
{
	public static void main(String[] args) throws IOException
	{
/*
		CircleTest cr = new CircleTest();

		cr.input();

		double le = cr.calLength();

		double ar = cr.calArea();

		cr.print(ar, le);

				�� Ǯ��
		--------------------------------------		
				 ����
*/
		// CircleTest Ŭ���� ��� �ν��Ͻ� ���� == �ν��Ͻ� ���� == ��ü ����
		CircleTest ob = new CircleTest();

		ob.input();			// �� �޼ҵ� �ȿ� ���� ó���� ���־����� ���� main �޼ҵ忡�� ó���� �־�� �Ѵ�.

		double num1 = ob.calArea();

		double num2 = ob.calLength();

		ob.print(num1, num2);

	}
}