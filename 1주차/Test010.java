/*===============================
���� �ڹ��� ���� �� Ư¡ ����
 
 // �� ����
 //	   ������ �ο��� ������ ������ ����
 //    ���� ���̿� �ѷ��� ���ϴ� ���α׷��� �����Ѵ�
 //    �� ������ : 10

 // ���� ��)
 // ���� : xxxx
 // �ѷ� : xxxx
 // ����Ϸ��� �ƹ� Ű�� ��������...
 ===============================*/
public class Test010
{
	public static void main(String[] args)
	{
	// �� Ǯ��
	int ������ = 10;
	double ���� = 0, �ѷ� = 0;

	���� = ������ * ������ * 3.141592;
	�ѷ� = ������ * 2 * 3.141592;

	System.out.println("���� : " + ����);
	System.out.println("�ѷ� : " + �ѷ�);

	// ���� ���
	// ���� : 314.1592
	// �ѷ� : 62.83184


	//----------------------------------------------------------
	// ����

	// �ֿ� ���� ����
	int r = 10;				// -- ������(r)
	//double pi = 3.141592	// -- ������(��)
	//final double pi = 3.141592	// -- ������(��)
	final double PI = 3.141592;	// -- ������(��)
	// -- final Ű���� : ������ ���ȭ

	// rainbowColor -> RAINBOWCOLOR -> RAINBOW_COLOR
	// userName -> USERNAME -> USER_NAME
	// applePrice -> APPLEPRICE -> APPLE_PRICE
	
	double area, length;			//-- ���� ����, �ѷ�

	// ���� �� ó��
	// 1. ���� ����
	area = r * r * PI; 

	// 2. �ѷ� ����
	length = r * 2 * PI;

	// ��� ���
	//System.out.println("���� : " + area);
	//System.out.println("�ѷ� : " + length);

	// ���� ���
	// ���� : 314.1592
	// �ѷ� : 62.83184

	//System.out.printf("���� : %.3f%n", area);
	//System.out.printf("�ѷ� : %.3f%n", length);
	// ���� ���
	// ���� : 314.159
	// �ѷ� : 62.832

	//System.out.printf("���� : %.3f\n�ѷ� : %.3f\n", area, length);
	// ���� ���
	// ���� : 314.159
	// �ѷ� : 62.832

	}
}