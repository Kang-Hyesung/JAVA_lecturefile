/*===============================
   ■■■ 연산자(Operator) ■■■
 - 조건 연산자 == 삼항 연산자
================================*/

// 사용자로부터 임의의 문자 하나를 입력받아
// 알파벳 대문자이면 소문자로
// 알파벳 소문자이면 대문자로
// 알파벳이 아닌 기타 문자라면 그 문자를 그대로
// 출력하는 프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A -> a
// 계속하려면 아무 키나 누르세요...

// 한 문자 입력 : b
// b -> B
// 계속하려면 아무 키나 누르세요

// 한 문자 입력 : 7
// 7 -> 7
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		// 내 풀이
/*
		char ch, result;

		System.out.print("한 문자 입력 : ");

		ch = (char)System.in.read();

		result = (ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;

		System.out.println(ch + " -> " + result);
*/



		// 수업
/*
알파벳대문자 ? 알파벳소문자로변환 : (알파벳소문자 ? 알파벳대문자로변환 : 있는그대로);

		String result = temp >=65 && temp <=90 ? "대문자" : "대문자 아님";
		System.out.println("결과 : " + result);

		String result = temp >= 'a' && temp <= 'z' ? "소문자" : "소문자 아님";
		System.out.println("결과 : " + result);
		
		// 대문자 -> 소문자

*/

		char ch,result;

		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();  // system.in.read가 int형 이므로

		result = ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch >= 'a' && ch <= 'z' ? (char)(ch - 32) : ch;
		
		System.out.println(ch + " -> " + result);
	}
}