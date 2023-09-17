// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 753
// 두 번째 정수 입력 : 22
// 세 번째 정수 입력 : 124
//
// >> 정렬 결과 : 22 124 753

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 내 풀이
		int num1,num2,num3;

		System.out.print("첫 번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : ");
		num3 = Integer.parseInt(br.readLine());
/*
		int temp;

		if( num1 >= num2)
		{
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if( num1 >= num3)
		{
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if( num2 >= num3)
		{
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
*/		
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", num1, num2, num3);

		// 수업

// 1. 첫 번째 정수, 두 번째 정수 크기 비교
// -> 첫 번째 정수가 두 번째 정수보다 클 경우 자리 바꿈

// 2. 첫 번째 정수, 세 번째 정수 크기 비교
// -> 첫 번째 정수가 세 번재 정수보다 클 경우 자리 바꿈

// 3. 두 번째 정수, 세 번째 정수 크기 비교
// -> 두 번째 정수가 세 번째 정수보다 클 경우 자리 바꿈
		
		// 비트연산자로 값을 바꿔주는 것이 더 빠르다.
		if( a > b)			// 첫 번째 정수가 두 번째보다 클 경우
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}

		if( a > c)		    // 첫 번째 정수가 세 번째보다 클 경우
		{
			a = a^c;
			c = c^a;
			a = a^c;
		}

		if( b > c)			// 두 번째 정수가 세 번째보다 클 경우
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);
	}
}