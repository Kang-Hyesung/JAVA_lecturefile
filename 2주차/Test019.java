/*==========================================
     ���� �ڹ� �⺻ ���α׷��� ����
- ������ �ڷ���
- �ڹ��� �⺻ ����� : System.util.Scanner
===========================================*/

// ������ ����(, / . ��)

import java.util.Scanner;

public class Test019
{
	public static void main(String args[])
	{
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,mat, tot;

		// ���� �� ó��
		System.out.print("�̸�,����,����,���� �Է�(, ����) : ");
		// �̸�,����,����,���� �Է�(, ����) : ������,90,80,70

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); 
		//				 ---------
		//			 "������,90,80,70"
		//
		//new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); ��ĳ�� �ȿ� usdDelimiter ���
		//						.�����ڻ��();
		//									  "\\s*,\\s*"
		//										\s*,\s*

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;


		// ��� ���
		System.out.println("\n>> �̸� : " + name);
		System.out.println(">> ���� : " + tot);

		//���� ���
/*
�̸�,����,����,���� �Է�(, ����) : ������,90,80,70

>> �̸� : ������
>> ���� : 240
*/
	}
}
