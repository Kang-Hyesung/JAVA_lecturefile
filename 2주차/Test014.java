/*==============================================
    ���� �ڹ� �⺻ ���α׷��� ����
	- ������ �ڷ���
	- �ڹ��� �⺻ ����� : BufferedRader Ŭ����
===============================================*/

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �̸��� �Է��ϼ��� : ���ѿ�
// ���� ���� �Է� : 90
// ���� ���� �Է� : 80
// ���� ���� �Է� : 70

// ====[���]====
// �̸� : ���ѿ�
// ���� : 240
// ����Ϸ��� �ƹ� Ű�� ��������
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor = 0, eng = 0, mat = 0, total = 0;
		String name;

		System.out.print("�̸��� �Է��ϼ��� : ");	
		name = br.readLine();

		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		total = kor + eng + mat;

		System.out.println();


		System.out.println("====[���]====");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + total);
*/
// ��� Ȯ��
/*
�̸��� �Է��ϼ��� : ���ѿ�
���� ���� �Է� : 90
���� ���� �Է� : 80
���� ���� �Է� : 70

====[���]====
�̸� : ���ѿ�
���� : 240
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
		// �ֿ� ���� ����

		// BufferedReader �ν��Ͻ� ����
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �Ʒ� �� �ٰ� ����. isr�� �����ϸ� �Ʒ� �� �ٰ� ��Ȯ�ϰ� ����.

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strName;			// �̸� ����
		int nKor, nEng, nMat;	// ��������, ��������, �������� ����
		int nTot;				// ���� ����
		String strTemp;			// ���ڿ� �ӽ� ���� ����

		// ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();
		
		// - ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		// - ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
		nKor = Integer.parseInt(strTemp);

		// - ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		// - ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ ��Ƴ���
		nEng = Integer.parseInt(strTemp);

		// - ����ڿ��� �ȳ� �޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		// - ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ ��Ƴ���
		nMat = Integer.parseInt(strTemp);

		// - �� ���� ������ ����ִ� ������(����ڰ� �Է��� ������)����
		//	 �����Ͽ� ������ �����ϰ� �� ����� ���� ������ ��Ƴ���
		nTot = nKor + nEng + nMat;

		// ��� ���
		System.out.println("\n====[���]====");
		System.out.println("�̸� : " + strName);
		System.out.println("���� : " + nTot);

	}
}
