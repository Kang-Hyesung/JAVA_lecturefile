// ����ڷκ��� ������ ������ �Է¹޾�
// ������ ���� �Ǻ� ����� ����ϴ� ���α׷��� �����Ѵ�.
// - 2�� ���
// - 3�� ���
// - 2�� 3�� ���
// - 2�� 3�� ��� �ƴ�

// ���� ��)
// ������ ���� �Է� : 4
// 4 -> 2�� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���� ��)
// ������ ���� �Է� : 9
// 9 -> 3�� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���� ��)
// ������ ���� �Է� : 12
// 12 -> 2�� 3�� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// ���� ��)
// ������ ���� �Է� : 17
// 17 -> 2�� 3�� ��� �ƴ�
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// �� Ǯ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());

		String ans = "ERROR";
		if(n == 0)
		{
			ans = "2�� 3�� ��� �ƴ�";
		}
		else if(n % 2 == 0 && n % 3 == 0 )
		{
			ans = "2�� 3�� ���";
		}
		else if(n % 2 == 0)
		{
			ans = "2�� ���";
		}
		else if(n % 3 == 0)
		{
			ans = "3�� ���";
		}
		else
		{
			ans = "2�� 3�� ��� �ƴ�";
		}

		System.out.println(n + " -> " + ans);

		
		// ����

		if(n % 2 == 0 && n % 3 == 0 )
		{
			ans = "2�� 3�� ���";
		}
		else if(n % 2 == 0)
		{
			ans = "2�� ���";
		}
		else if(n % 3 == 0)
		{
			ans = "3�� ���";
		}
		else if(n % 2 !=0 || n % 3 != 0)
		{
			ans = "2�� 3�� ��� �ƴ�";
		}
		else
		{
			System.out.println(n + " -> ���� �Ұ�");
		}

	}
}