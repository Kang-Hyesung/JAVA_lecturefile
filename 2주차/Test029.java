/*===============================
   ���� ������(Operator) ����
 - ���� ������ == ���� ������
================================*/

// ����ڷκ��� ������ ���� �ϳ��� �Է¹޾�
// ���ĺ� �빮���̸� �ҹ��ڷ�
// ���ĺ� �ҹ����̸� �빮�ڷ�
// ���ĺ��� �ƴ� ��Ÿ ���ڶ�� �� ���ڸ� �״��
// ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// �� ���� �Է� : A
// A -> a
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� �Է� : b
// b -> B
// ����Ϸ��� �ƹ� Ű�� ��������

// �� ���� �Է� : 7
// 7 -> 7
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		// �� Ǯ��
/*
		char ch, result;

		System.out.print("�� ���� �Է� : ");

		ch = (char)System.in.read();

		result = (ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;

		System.out.println(ch + " -> " + result);
*/



		// ����
/*
���ĺ��빮�� ? ���ĺ��ҹ��ڷκ�ȯ : (���ĺ��ҹ��� ? ���ĺ��빮�ڷκ�ȯ : �ִ±״��);

		String result = temp >=65 && temp <=90 ? "�빮��" : "�빮�� �ƴ�";
		System.out.println("��� : " + result);

		String result = temp >= 'a' && temp <= 'z' ? "�ҹ���" : "�ҹ��� �ƴ�";
		System.out.println("��� : " + result);
		
		// �빮�� -> �ҹ���

*/

		char ch,result;

		System.out.print("�� ���� �Է� : ");
		ch = (char)System.in.read();  // system.in.read�� int�� �̹Ƿ�

		result = ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch >= 'a' && ch <= 'z' ? (char)(ch - 32) : ch;
		
		System.out.println(ch + " -> " + result);
	}
}