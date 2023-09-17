// 사용자로부터 임의의 정수를 입력받아
// 다음과 같은 판별 결과를 출력하는 프로그램을 구현한다.
// - 2의 배수
// - 3의 배수
// - 2와 3의 배수
// - 2와 3의 배수 아님

// 실행 예)
// 임의의 정수 입력 : 4
// 4 -> 2의 배수
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 임의의 정수 입력 : 9
// 9 -> 3의 배수
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 임의의 정수 입력 : 12
// 12 -> 2와 3의 배수
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 임의의 정수 입력 : 17
// 17 -> 2와 3의 배수 아님
// 계속하려면 아무 키나 누르세요...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		String ans = "ERROR";
		if(n == 0)
		{
			ans = "2와 3의 배수 아님";
		}
		else if(n % 2 == 0 && n % 3 == 0 )
		{
			ans = "2와 3의 배수";
		}
		else if(n % 2 == 0)
		{
			ans = "2의 배수";
		}
		else if(n % 3 == 0)
		{
			ans = "3의 배수";
		}
		else
		{
			ans = "2와 3의 배수 아님";
		}

		System.out.println(n + " -> " + ans);

		
		// 수업

		if(n % 2 == 0 && n % 3 == 0 )
		{
			ans = "2와 3의 배수";
		}
		else if(n % 2 == 0)
		{
			ans = "2의 배수";
		}
		else if(n % 3 == 0)
		{
			ans = "3의 배수";
		}
		else if(n % 2 !=0 || n % 3 != 0)
		{
			ans = "2와 3의 배수 아님";
		}
		else
		{
			System.out.println(n + " -> 판정 불가");
		}

	}
}