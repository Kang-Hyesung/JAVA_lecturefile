/*==========================================
   ���� ���� �帣�� ��Ʈ��(���) ����
 - if ��
 - if ~ else �� �ǽ�
==========================================*/

// �� ����
//    ����ڷκ��� ������ ������ �Է¹޾�
//	  �Է¹��� ������ ��������... �������... �Ǻ��Ͽ�
//	  �� ����� ����ϴ� ���α׷��� �����Ѵ�.
//	  ��, �Է��� BufferedReader �� Ȱ���ϰ�
//    if ���ǹ��� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2024
// 2024�� �� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 2023
// 2024�� �� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ �Ǻ� ����
// ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
// 400�� ����̸� ����
// �׷��� ������ ���

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;					// �Է¹��� ����
		String ans;					// �������� �������
		
		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());

		if(  year % 4 == 0 && year % 100 != 0)    // 1.������ 4�� ����̸鼭 100�� ����� �ƴ� ���
		{
			ans = "����";
		}
		else if( year % 400 == 0)				  // 2. ������ 400�� ����� ���
 		{
			ans = "����";
		}
		else
		{
			ans = "���";						  // 3. 1�� ���� 2�� ��찡 �ƴ� ��� -> ��
		}

		System.out.println(year+"�� �� " + ans);
	}
}
