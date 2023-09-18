/*=================================
  ���� ����(Sort) �˰��� ����
=================================*/
/*
�۰���
  ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
  ������ ���� �л����� ���� ������ ����� �ο��Ͽ�
  ����� ����ϴ� ���α׷��� �����Ѵ�.
  ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

 ���� ��)
 �ο� �� �Է� : 5
 �̸� ���� �Է�(1, ���� ����) : ȫ�浿 90
 �̸� ���� �Է�(2, ���� ����) : aaa 80
 �̸� ���� �Է�(3, ���� ����) : bbb 85
 �̸� ���� �Է�(4, ���� ����) : ccc 75
 �̸� ���� �Է�(5, ���� ����) : ddd 95

 ----------------------
 1�� ddd 95
 2�� ȫ�浿 90
 3�� bbb 85
 4�� aaa 80
 5�� ccc 75
 ----------------------
����Ϸ���...

*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test110
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�ο� �� �Է� : ");
		int N = Integer.parseInt(br.readLine());				// �Է¹��� �� ����N�� ����
	
		String[] arrSt = new String[N];							// �Է¹��� ��ü�� ���� ���ڿ� �迭
		int[] arrSc = new int[N];								// ������ ���� ���� ������ �迭

		for(int i = 0; i < N; i++)							
		{
			arrSt[i] = br.readLine();							// �Է� ���� ��ü�� arrSt �迭�� ��´�
			arrSc[i] = Integer.parseInt(arrSt[i].substring(4)); // �Է� ���� ��ü���� ���ڸ� arrSc �迭�� ��´�.
		}
		
		String str;									
		boolean flag;
		int pass = 0;

		do
		{
			flag = false;										// �̹� ȸ������ �ڸ��ٲ��� �߻����� ���� ���̴�.	

			for(int i = 1; i < arrSc.length; i++)
			{
				if(arrSc[i - 1] < arrSc[i])						// ��������
				{
					str = arrSt[i];								// ���ڿ� ��ü�� �ٲ��ش�
					arrSt[i] = arrSt[i - 1];					// i�� 1�� �����ϰ� 01 ���ؾ��ϱ� ������ i - 1���ش�.
					arrSt[i - 1] = str;				

					arrSc[i] = arrSc[i] ^ arrSc[i - 1];			// ������ ���� �� �迭�� �ٲ��ش�
					arrSc[i - 1] = arrSc[i - 1] ^ arrSc[i];
					arrSc[i] = arrSc[i] ^ arrSc[i - 1];
					flag = true;				
				}
			}
			System.out.println("a");
		}
		while (flag);		
		
		for(int i = 0; i < N; i++)
		{
			System.out.println(arrSt[i]);						// ������ �Ϸ�� ���ڿ� �迭 ������� ���
		}
	}
}