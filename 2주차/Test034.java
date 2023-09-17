/*==========================================
   ■■■ 실행 흐르믜 컨트롤(제어문) ■■■
 - if 문
 - if ~ else 문 실습
==========================================*/

// ○ 과제
//    사용자로부터 임의의 연도를 입력받아
//	  입력받은 연도가 윤년인지... 평년인지... 판별하여
//	  그 결과를 출력하는 프로그램을 구현한다.
//	  단, 입력은 BufferedReader 를 활용하고
//    if 조건문을 활용하여 연산을 수행할 수 있도록 한다.

// 실행 예)
// 임의의 연도 입력 : 2024
// 2024년 → 윤년
// 계속하려면 아무 키나 누르세요...

// 임의의 연도 입력 : 2023
// 2024년 → 평년
// 계속하려면 아무 키나 누르세요...

// 윤년의 판별 조건
// 연도가 4의 배수이면서 100의 배수가 아니거나
// 400의 배수이면 윤년
// 그렇지 않은면 평년

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year;					// 입력받을 연도
		String ans;					// 윤년인지 평년인지
		
		System.out.print("임의의 연도 입력 : ");
		year = Integer.parseInt(br.readLine());

		if(  year % 4 == 0 && year % 100 != 0)    // 1.연도가 4의 배수이면서 100의 배수가 아닌 경우
		{
			ans = "윤년";
		}
		else if( year % 400 == 0)				  // 2. 연도가 400의 배수인 경우
 		{
			ans = "윤년";
		}
		else
		{
			ans = "평년";						  // 3. 1의 경우와 2의 경우가 아닌 경우 -> 평
		}

		System.out.println(year+"년 → " + ans);
	}
}
