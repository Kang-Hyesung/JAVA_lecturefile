/*=======================
   ���� �迭 ����
  - �迭�� ����� �ʱ�ȭ
  - �迭�� �⺻�� Ȱ��
========================*/

// �۰���
//   ����ڷκ��� ������ ������ ������ ������ŭ �Է¹޾�
//   �Է¹��� �� �߿��� ���� ū ���� ����ϴ� ���α׷��� �����Ѵ�.\
//   ��, �迭�� Ȱ���Ͽ� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// �Է��� �������� ����   : 11
// ������ �Է�(���� ����) : 45 11 26 35 66 97 50 2 123 10 7 

// >> ���� ū �� -> 123
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.io.IOException;
import java.util.Scanner;

public class Test083
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);								
		System.out.print("�Է��� �������� ����   : ");
		int n = sc.nextInt();								// �Է��� �������� ���� n

		int[] num = new int[n];	// �Է¹��� n������ �迭 ����� ��
	
		System.out.print("������ �Է�(���� ����) : ");

		int max = num[0];
		for(int i = 0; i < n; i++)				
		{
			num[i] = sc.nextInt();							// �������� ����
			if(num[i] > max)								// num[i]�� ���� max���� ũ��
				max = num[i];								// max�� num[i] ����
		}

		System.out.printf("\n>> ���� ū �� �� %d\n",max);
/*
�Է��� �������� ����   : 5
������ �Է�(���� ����) : 75 15 48 75 36

>> ���� ū �� �� 75
*/



	}
}