public class Test016
{
	public static void main(String args[])
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");		//-- \n ����
		// ==AAABBBCCC

		System.out.println();			//-- ����

		//System.out.print();				 �Ű����� ���� ������

		System.out.printf("1234567890");
		System.out.printf("1234567890\n");	//-- \n ����
		System.out.printf("1234567890%n");	//-- %n ����

		//System.out.printf();				 �Ű����� ���� ������

		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		//== 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);	// 123�� �����Ͽ� 10�ڸ��� Ȯ���ؼ� ����϶�
		System.out.printf("%8d\n", 1234);	// 1234�� �����Ͽ� 8�ڸ��� Ȯ���ؼ� ����϶�
		System.out.printf("%010d\n", 123);	// 123�� �����Ͽ� 10�ڸ��� Ȯ���ϰ� �� �ڸ��� 0���� ä����

		// ���� ���
		//	123
		//		   123
		//		1234
		//	0000000123

		System.out.printf("%+d\n", 365);
		//== +365
		System.out.printf("+%d\n", 365);
		//== +365
		System.out.printf("%d\n", +365);
		//== 365

		//System.out.printf("%-d\n", 365);
		//== ���� �߻�(��Ÿ�� ����)
		System.out.printf("-%d\n", 365);
		//== -365
		System.out.printf("%d\n", -365);
		//== -365

		//System.out.printf("%d\n", 'A');
		//== ���� �߻�(��Ÿ�� ����)
		System.out.printf("%c\n", 'A');
		//== A

		//System.out.printf("%c\n", "ABCD");
		//== ���� �߻�(��Ÿ�� ����)
		System.out.printf("%s\n", "ABCD");
		//== ABCD


		System.out.printf("%h\n", 365);
		//== 16d   -> 16���� ����

		System.out.printf("%o\n", 24);
		//== 30

		System.out.printf("%b\n", true);
		System.out.printf("%b\n", false);
		//== true
		//   false

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23); // �Ҽ��� ���� �� ��° �ڸ����� ǥ��
		//== 123.230000
		//	 123.23

		System.out.printf("%.2f\n", 123.231);
		//== 123.23
		//   �Ҽ��� ���� �� ��° �ڸ����� ǥ��
		//	 (�Ҽ��� ���� �� ��° �ڸ� ����)

		System.out.printf("%.2f\n", 123.235);
		//== 123.24
		//	 �Ҽ��� ���� �� ��° �ڸ����� ǥ��
		//   (�Ҽ��� ���� �� ��° �ڸ� �ø�)

		System.out.printf("%8.2f\n", 123.256);
		//==   123.26  -> .�� �ڸ��� ���Եȴ�. 123.26 6�� �����ؼ� 8�ڸ� Ȯ��
		System.out.printf("%2.2f\n", 123.236); //ǥ���Ϸ��� �����ͺ��� Ȯ������ ������ ���õȴ�.
		//== 123.24

	}
}

