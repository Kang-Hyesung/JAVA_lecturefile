/*=====================================================================================
  ���� Ŭ������ �ν��Ͻ� ����
  - ���� ���а� ��������������(���� ������, ���� ������, ���� ������, ���� ������, ...)
=====================================================================================*/
/*
*/
import java.util.Scanner;

class CircleTest2
{
	// ��� ����, �ν��Ͻ� ����, ���� ����
	// int num;
	// ���� ����(Information Hiding) �� ��ġ��
	private int num;		// private�̶�� ���������������� ������ Ŭ���� ���ο����� ���� �� ������ �����ϰ� �ϰڴٴ� �ǹ�
							// int�� ���������̱� ������ �ڵ����� 0���� �ʱ�ȭ �ȴ�.
	// getter / setter ����
	/*
	public int getNum()
	{
		return num;
	}

	public setNum(int num)
	{
		this.num = num;
	}
	*/


	public void input()			// �̷��� public�� �ٿ��൵ class�� default�� �⺻���� �ֱ� ������ 
								// �ٸ� ��Ű���� ��쿡�� class������ �� ���� input()�� ���� �Ұ�
								// public�� ���� class�� ���Ͽ� �ϳ��� �־�� �Ѵ�. �׷��� �и��ϴ� ��
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է� : ");
		num = sc.nextInt();
	}

	public double calArea()
	{
		return num * num * 3.141592;
	}

	public void write(double area)
	{
		System.out.println(">> ������ : " + num);
		System.out.println(">> ����   : " + area);
	}
}

public class Test098
{
	public static void main(String[] args)
	{
		// CircleTest2 �ν��Ͻ� ����
		CircleTest2 ob1 = new CircleTest2();

		// ob1.num = 10; Ŭ���� �ȿ��� private�̶� �Ұ���
		// ob1.setNum(10);

		// System.out.println("���� ������ : " + ob1.num);
		// System.out.println("���� ������ : " + ob1.getNum);

		// ���ͼ��͸� ������� �ʰ� �Ϸ��� ���� �����ϰ� num���� ������ �� �ִ� ���
		ob1.input();			// ������ �Է� : 500 -> ob1.num�� 500�� �����϶�

		double result = ob1.calArea();

		ob1.write(result);

/*
������ �Է� : 500
>> ������ : 500
>> ����   : 785398.0
����Ϸ��� �ƹ� Ű�� �����ʽÿ�
*/

	}
}