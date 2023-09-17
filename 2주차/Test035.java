// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력    : 10
// 두 번째 정수 입력    : 3
// 연산자 입력[+ - * /] : +

// >> 10 + 3 = 13
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int num1, num2;
		char c;
		

		System.out.print("첫 번째 정수 입력    :   ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력    :   ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] :   ");
		c = (char)System.in.read();
		

		// 내 풀이
		if(c == '+')
		{
			System.out.printf("%d %c %d = %d\n", num1, c, num2, num1 + num2);
		}
		else if(c == '-')
		{
			System.out.printf("%d %c %d = %d\n", num1, c, num2, num1 - num2);
		}
		else if(c == '*')
		{
			System.out.printf("%d %c %d = %d\n", num1, c, num2, num1 * num2);
		}
		else if(c == '/')
		{
			System.out.printf("%d %c %d = %d\n", num1, c, num2, num1 / num2);
		}
		else
		{
			System.out.printf("WRONG MARK\n");
		}
		*/
		// 수업
/*
		int a,b;
		char op;

		System.out.print("첫 번째 정수 입력    :   ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력    :   ");
		b = Integer.parseInt(br.readLine());

		// Integer.parseInt()
		// "1234"  -> Integer.parseInt() -> 1234
		// "abcd"  -> Integer.parseInt() -> (x)

		System.out.print("연산자 입력[+ - * /] :   ");
		//c = (char)Integer.parseInt(br.readLine());		 안됨
		op = (char)System.in.read();
		
		// 테스트
		//System.out.println("입력한 연산자 : " + op);     잘 나옴

		// + == 43       - == 45		 * == 42		/ == 47

		if(op == 43)
		{
			System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a + b);
		}
		else if(op == 45)
		{
			System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a - b);
		}
		else if(op == 42)
		{
			System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a * b);
		}
		else if(op == 47)
		{
			System.out.printf("\n>> %d %c %d = %d\n", a, op, b, a / b);
		}
		else
		{
			System.out.println("\n>>입력 과정에 오류가 존재합니다.");
		}
*/

		// 두 번째 풀이는 내 풀이와 같음
		
		// 세 번재 풀이
		int a, b, result = 0;
		char op;

		System.out.print("첫 번째 정수 입력    : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력    : ");
		b = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		op = (char)System.in.read();

		if(op == '+')
			result=a+b;
		else if(op == '-')
			result=a-b;
		else if(op == '*')
			result=a*b;
		else if(op == '/')
			result=a/b;

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);

	}
}
