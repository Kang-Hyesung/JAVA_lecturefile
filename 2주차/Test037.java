// ����ڷκ��� ������ ���� 5���� �Է¹޾�
// ¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�.
// ��, Scanner�� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� 5�� �Է�(���� ����) : 11 12 13 14 15

// >> ¦���� ���� 26 �̰�, Ȧ���� ���� 39 �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...
import java.util.Scanner;

public class Test037
{
	public static void main(String[] args)
	{
/*
		int a,b,c,d,e;
		int oSum = 0, eSum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("������ ���� 5�� �Է�(���� ����) : ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();

		// �� Ǯ��
		if(a % 2 == 0)
			eSum += a;
		else
			oSum += a;

		if(b % 2 == 0)
			eSum += b;
		else
			oSum += b;

		if(c % 2 == 0)
			eSum += c;
		else
			oSum += c;

		if(d % 2 == 0)
			eSum += d;
		else
			oSum += d;

		if(e % 2 == 0)
			eSum += e;
		else
			oSum += e;

		System.out.printf("\n>> ¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.\n", eSum, oSum);
*/
// ���� ���
/*
������ ���� 5�� �Է�(���� ����) : 11 12 13 14 15

>> ¦���� ���� 26 �̰�, Ȧ���� ���� 39 �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
		
		// ����
		// �ֿ� ���� ����
		Scanner sc = new Scanner(System.in);

		// �������� ��Ƴ� ���� �ʱ�ȭ
		int evenSum = 0;			// ¦���� ���� ��Ƴ� ���� ���� , ������ �϶��� 1�� �ʱ�ȭ�Ѵ�.
		int oddSum = 0;				// Ȧ���� ���� ��Ƴ� ���� ����
		int num1, num2, num3, num4, num5;
		// ����ڷκ��� �Է¹��� 5���� ������ ���� ���� ����

		// ���� �� ó��
		System.out.print("������ ���� 5�� �Է�(���� ����) : ");	// 10 20 30 40 50
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if(num1 % 2 == 0)			// num1�� ¦���� ��
		{
			evenSum += num1;		//evenSum �� num1 ��ŭ ����
		}
		else						// num1�� Ȧ���� ��
		{
			oddSum += num1;			//oddSum �� num1 ��ŭ ����
		}
		
		if(num2 % 2 == 0)			// num2�� ¦���� ��
		{
			evenSum += num2;		//evenSum �� num2 ��ŭ ����
		}
		else						// num1�� Ȧ���� ��
		{
			oddSum += num2;			//oddSum �� num2 ��ŭ ����
		}

		if(num3 % 2 == 0)		
			evenSum += num3;		
		else					
			oddSum += num3;	
		
		if(num4 % 2 == 0)		
			evenSum += num4;		
		else					
			oddSum += num4;	

		if(num5 % 2 == 0)		
			evenSum += num5;		
		else					
			oddSum += num5;	

		// ��� ���
		System.out.printf("\n>> ¦���� ���� %d �̰�, Ȧ���� ���� %d �Դϴ�.\n", evenSum, oddSum);
		
	}
}