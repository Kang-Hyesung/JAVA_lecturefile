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

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ Ȧ������, ¦������, ������ Ȯ���Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է� : 14
// 14 -> ¦��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���� ��)
// ������ ���� �Է� : 0
// 0 -> ��
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test032
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �� Ǯ��
		int n = 0;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		String ans; // ��

		if(n % 2 == 0 && n > 0)
		{
			ans = "¦��";
		}
		else if(n % 2 == 1)
		{
			ans = "Ȧ��";
		}
		else
		{
			ans = "��";
		}

		System.out.printf("%d -> %s\n", n, ans);


		// ����
		
		if(n == 0)
		{
			ans = "��";
		}
		else if(n % 2 == 1)
		{
			ans = "Ȧ��";
		}
		else
		{
			ans = "¦��";
		}


		String result = "�����Ұ�";
		if(n == 0)
		{
			ans = "��";
		}
		else if(n % 2 == 1)
		{
			ans = "Ȧ��";
		}
		else if
		{
			ans = "¦��";
		}

		System.out.println(n + " -> " + result);

	}
}