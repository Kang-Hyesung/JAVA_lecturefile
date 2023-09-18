/*==========================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface)
==========================*/
/*
�� �ǽ� ����
   ���� ó�� ���α׷��� �����Ѵ�.
   ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.


 ���� ��)
 �ο� �� �Է�(1~10) : 11
 �ο� �� �Է�(1~10) : 0
 �ο� �� �Է�(1~10) : 2

 1��° �л��� �й� �̸� �Է�(���� ����) : 2309123 aaa
 ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
 2��° �л��� �й� �̸� �Է�(���� ����) : 2309125 bbb
 ���� ���� ���� ���� �Է�   (���� ����) : 85 70 60

 2309123 aaa   90 100  85   ����   ���.xx
 				  ��  ��  ��
 2309125 bbb   85  70  60   ����   ���.xx
 				  ��  ��  ��

 ����Ϸ���...

 90 �̻�	     ��
 80 �̻� 90 �̸� ��
 70      80      ��
 60		 70		 ��
 				 ��
*/
import java.util.Scanner;
import java.io.IOException;

// �Ӽ��� �����ϴ� Ŭ���� -> �ڷ��� Ȱ��
class Record
{
	String hak, name;			// �й� �̸�
	int kor, eng, mat;			// ���� ���� ����
	int tot;					// ����
	double avg;					// ���
}



interface Sungjuk
{
	public void set();			// �ο� ����
	public void input();		// ������ �Է�
	public void print();		// ��� ���
}



// ���� �ذ� �������� �����ؾ� �� Ŭ���� -> Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = sc.nextInt();

		}
		while (inwon > 10 || inwon < 1);

		rec = new Record[inwon];
	}

	@Override
	public void input()
	{
		for(int i = 0; i < inwon; i++)
		{
			rec[i] = new Record();

			Scanner sc = new Scanner(System.in);
			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i + 1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3.0;
		}
	}

	@Override
	public void print()
	{
		for(int i = 0; i < inwon; i++)
		{
			System.out.printf("%s %s   %d %d %d   %d   %.2f\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%14s %s %s\n", panJung(rec[i].kor), panJung(rec[i].eng), panJung(rec[i].mat));
		}
	}

	// ���������� ��޿� ���� ������ ������ �޼ҵ�

	private String panJung(int Score)
	{
		if(Score >= 90)
			return "��";
		else if (Score >= 80)
			return "��";
		else if(Score >= 70)
			return "��";
		else if(Score >= 60)
			return "��";
		else
			return "��";

	}

}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test121
{
	public static void main(String[] args) throws IOException
	{
		//Sungjuk ob;
		Sungjuk ob = new SungjukImpl();  // ��ĳ����

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ���� �� ��ü ����

		ob.set();
		ob.input();
		ob.print();

		// ������ public �϶�
		// System.out.print(((SungjukImpl)ob).panJung(90));

		// �̷��Ե� ����
		// ((SungjukImpl)ob).set();
		// ((SungjukImpl)ob).input();
		// ((SungjukImpl)ob).print();
	}

/*
�ο� �� �Է�(1~10) : 11
�ο� �� �Է�(1~10) : 0
�ο� �� �Է�(1~10) : 2
1��° �л��� �й� �̸� �Է�(���� ����) : 2309123 aaa
���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
2��° �л��� �й� �̸� �Է�(���� ����) : 2309125 bbb
���� ���� ���� ���� �Է�   (���� ����) : 85 70 60
2309123 aaa   90 100  85   275   91.67
                   �� ��  ��
2309125 bbb   85 70  60   215   71.67
                   �� ��  ��
*/
}