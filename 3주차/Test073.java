	/*================================
	   ■■■ 클래스와 인스턴스 ■■■
	=================================*/

	// 사용자로부터 임의의 두 정수와 연산자를 입력받아
	// 해당 연산을 수행하는 프로그램을 구현한다.
	// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.
	// (Calculate 클래스 설계)

	// 실행 예)
	// 임의의 두 정수 입력(공백 구분) : 100 51
	// 임의의 연산자(+ - * /)		  : +

	// >> 100 + 51 = 151
	// 계속하려면 아무 키나 누르세요...

	import java.util.Scanner;
	import java.io.IOException;

	class Calculate
	{
		int su1, su2;
		char op;
		
		void input() throws IOException		
		{
			Scanner sc = new Scanner(System.in);

			System.out.print("임의의 두 정수 입력(공백 구분) : ");
			su1 = sc.nextInt();
			su2 = sc.nextInt();

			System.out.print("임의의 연산자(+ - * /)		: ");
			op = (char)System.in.read();
		}

		int cal()									// 연산 기능 -> 나눗셈 연산도 정수 기반으로 처리
		{
			int result = -1;

			switch(op)
			{
				case '+': result = su1 + su2; break;
				case '-': result = su1 - su2; break;
				case '*': result = su1 * su2; break;
				case '/': result = su1 / su2; break;
				//default : result = -1;
			}

			return result;	
		}

		void print(int s)							// 출력
		{
			System.out.printf("\n>> %d %c %d = %d\n", su1, op, su2, s);
		}
	}
	/*
	{
		int a,b,ans;		// 입력 받을 두 숫자와 연산 결과
		char c;

		void input() throws IOException
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("임의의 두 정수 입력(공백 구분) : ");
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.print("임의의 연산자(+ - * /)		: ");
			c = (char)System.in.read();
		}

		void cal()
		{
			if(c == '+')
				ans = a + b;
			else if(c == '-')
				ans = a - b;
			else if(c == '*')
				ans = a * b;
			else
				ans = a / b;
		}

		void print()
		{
			System.out.printf("\n>> %d %c %d = %d\n", a, c, b, ans);
		}

	}				
	*/
	public class Test073
	{
		public static void main(String[] args) throws IOException
		{	
	/*		내 풀이
			Calculate cl = new Calculate();

			cl.input();

			cl.cal();

			cl.print();
			수업--------------------------------------------------*/
			
			Calculate cal = new Calculate();

			cal.input();			// 생성한 인스턴스를 통한 입력 메소드 호출
			int r = cal.cal();		// 생성한 인스턴스를 통한 연산 메소드 호출
			cal.print(r);			// 생성한 인스턴스를 통한 출력 메소드 호출
		}
	}