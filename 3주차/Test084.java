/*=======================
   ���� �迭 ����
  - �迭�� ����� �ʱ�ȭ
  - �迭�� �⺻�� Ȱ��
========================*/
/*
�� ����
   ����ڷκ��� ������ �л� ���� �Է¹ް�
   �׸�ŭ�� ����(���� ����)�� �Է¹޾�
   ��ü �л� ������ ��, ���, ������ ���ؼ�
   ����� ����ϴ� ���α׷��� �����Ѵ�.

   ���� ��)
   �л� �� �Է� : 5
   1�� �л��� ���� �Է� : 90
   2�� �л��� ���� �Է� : 82
   3�� �л��� ���� �Է� : 64
   4�� �л��� ���� �Է� : 36
   5�� �л��� ���� �Է� : 98

   >> �� : 370
   >> ��� : 74.0
   >> ����
   90 : -16.0
   82 : -8.0
   64 : 10.0
   36 : 38.0
   98 : -24.0
   ����Ϸ��� �ƹ� Ű�� ��������..
*/
import java.io.IOException;
import java.util.Scanner;


public class Test084
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�л� �� �Է� : ");
		int n = sc.nextInt();					// �л��� n �Է� ����
		int total = 0;							// ��
		double avg = 0.0;						// ���
		double dev = 0.0;						// ����

		int[] score = new int[n];				// ������ �Է¹޾� ������ �迭

		for(int i = 0; i < n; i++)
		{
			System.out.printf("%d�� �л��� ���� �Է� : ", i + 1);
			score[i] = sc.nextInt();			// ������ �Է¹޾� �迭�� �־��ش�.
			total += score[i];					// ������ ���
		}

		avg = (double)total / n;				// �հ� n ��� int���̶� double������ ���� ����ȯ ���ش�.

		System.out.println();

		System.out.printf(">> �� : %d\n", total);
		System.out.printf(">> ��� : %.1f\n", avg);
		System.out.println(">> ����");

		for(int i = 0; i < n; i++)
		{
			System.out.printf("%d : %.1f\n", score[i], avg - score[i]);
		}
/*
������
�л� �� �Է� : 5
1�� �л��� ���� �Է� : 90
2�� �л��� ���� �Է� : 82
3�� �л��� ���� �Է� : 64
4�� �л��� ���� �Է� : 36
5�� �л��� ���� �Է� : 98

>> �� : 370
>> ��� : 74.0
>> ����
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
*/
	}
}