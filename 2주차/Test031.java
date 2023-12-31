/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - if ��
 - if ~ else �� �ǽ�
==========================================*/

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//    �б� ������ ���ϱ� ���� ����ϴ� �������
//    if��, if~else��, ���ǿ�����, ����if��(if�� ��ø), switch���� �ִ�.

// 2. if���� if ������ ������ ��(true)�� ���
//    Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� ó���Ѵ�.

// 90�� �̻�		   : A
// 80�� �̻� 90�� �̸� : B
// 70�� �̻� 80�� �̸� : C
// 60�� �̻� 70�� �̸� : D
// 60�� �̸�		   : F

// ��, BufferedReader �� Ȱ���� �����͸� �Է¹��� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// �̸� �Է� : �����
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70
// 
// >> ����� �̸��� ������Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80.00�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		String name;		// �̸�
		int kor,eng,mat;	// ����,����,���� ����
		int tot;			// ����
		double avg;			// ����
		char grade;			// ���

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3.0;

		if(avg >= 90)
		{
			grade = 'A';
		}
		else if(avg >= 80)
		{
			grade = 'B';
		}
		else if(avg >= 70)
		{
			grade = 'C';
		}
		else if(avg >= 60)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}

		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d,\n", kor);
		System.out.printf(">> ���� ������ %d,\n", eng);
		System.out.printf(">> ���� ������ %d,\n", mat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", tot, avg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);
		*/
		// 1. ����ڵ�κ��� �̸��� �Է¹޴´�.
		System.out.print("�̸� �Է� : ");
		String strName = br.readLine();

		// 2. ����ڷκ��� ����, ����, ���� ������ �Է¹޴´�.
		System.out.print("���� ���� : ");
		String strKor = br.readLine();
		System.out.print("���� ���� : ");
		String strEng = br.readLine();
		System.out.print("���� ���� : ");
		String strMat = br.readLine();

		// 3. ���ڿ� ���·� �Է¹��� ���� ������ ���� ���·� ��ȯ�Ѵ�.
		int nKor = Integer.parseInt(strKor);
		int nEng = Integer.parseInt(strEng);
		int nMat = Integer.parseInt(strMat);

		// 4. ��� ������ ���� ������ ����� ����Ѵ�.
		int nTot = nKor + nEng + nMat;			//  ����
		double fAvg = (double)nTot / 3;			//  ���

		// 5. ��޿� ���� ���� �˻縦 �����Ѵ�.
		char grade;								//  ���
		char grade = 'F';			
// grade�� �ʱⰪ�� �־��شٸ� �������� else if�� �������� ������ ���� ��������
// �־��� ���� �ֱ� ������ ������. �ʱⰪ�� �־����� �ʴ´ٸ� ���������� else ��
// ������ �Ѵ�.

		if (fAvg >= 90)
		{
			grade = 'A';
		}
		else if(fAvg >= 80)
		{
			grade = 'B';
		}
		else if(fAvg >= 70)
		{
			grade = 'C';
		}
		else if (fAvg >= 60)
		{
			grade = 'D';
		}
		else 
		{
			grade = 'F';
		}

		// 6. ���� ��� ���
		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", strName);
		System.out.printf(">> ���� ������ %d,\n", nKor);
		System.out.printf(">> ���� ������ %d,\n", nEng); // strEng���� ���������� ����, nEng�� ��� ���������� ����
		System.out.printf(">> ���� ������ %d,\n", nMat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", nTot, fAvg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);
// ���� ���
/*
�̸� �Է� : �����
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� ������Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240�̰�, ����� 80.00�Դϴ�.
>> ����� B �Դϴ�.
*/
	}
}