/*=======================
   ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적 활용
========================*/

// 사용자로부터 인원수를 입력받고
// 입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받아
// 이렇게 입력받은 데이터를 이름 배열과 전화번호 배열로 구성하여
// 결과를 출력할 수 있는 프로그램을 구현한다.

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1~10) : 27
// 입력 처리할 학생 수 입력(명, 1~10) : -5
// 입력 처리할 학생 수 입력(명, 1~10) : 3
// 이름 전화번호 입력[1](공백 구분) : 박범구 010-1234-2345
// 이름 전화번호 입력[1](공백 구분) : 엄재용 010-2345-3456
// 이름 전화번호 입력[3](공백 구분) : 오수경 010-3456-4567

// --------------------
// 전체 학생 수 : 3
// --------------------
// 이름    전화번호
// 박범구 010-1234-2345
// 엄재용 010-2345-3456
// 오수경 010-3456-4567
// --------------------
// 계속하려면 아무 키나 누르세요

import java.io.IOException;
import java.util.Scanner;

public class Test082
{
	public static void main(String[] args) throws IOException
	{
/*		내 풀이
		Scanner sc = new Scanner(System.in);

		int n = 0;
		do
		{
		
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			n = sc.nextInt();										// 학생 수 n
		
		}
		while (n < 1 || n > 10);
		
		
		String[] name = new String[n];								// 이름을 담을 문자열 배열
		String[] number = new String[n];							// 번호를 담을 문자열 배열


		for(int i = 0; i < n; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분 ) : ", i + 1);
			name[i] = sc.next();
			number[i] = sc.next();
		}


		System.out.println();
		System.out.println("--------------------");
		System.out.printf("전체 학생 수 : %d\n",n);
		System.out.println("--------------------");
		System.out.println("이름    전화번호");
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(name[i]+ " ");
			System.out.print(number[i] + " \n");
		}
		System.out.println("--------------------");
		수업 ------------------------------------*/	
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력하는 학생 수를 담아낼 변수
		int memberCount = 0;

	//	System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
		//memberCount = sc.nextInt();

		do
		{
		
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memberCount = sc.nextInt();
		
		}
		while (memberCount < 1 || memberCount > 10);

		// 테스트(확인)
		// System.out.println("사용자가 입력한 인원 수 : "+ memberCount);

		// 사용자가 입력한 인원 수를 토대로
		// 이름 배열과 전화번호 배열을 생성해야 한다.

		// 인원 수 만큼의 이름 저장 배열 구성
		String[] names = new String[memberCount];	
		
		// 인원 수 만큼의 전화번호 저장 배열 구성 , 전화번호는 앞에 0이 오기 때문에 -가 없더라도 String으로 해야함
		String[] tels = new String[memberCount]; //String[names.length]로 해도 됨

		// 이름 전화 번호 입력
		// 인원 수 만큼의 안내 메세지 출력 및 입력값 담아내기
		// for(nt i = 0; i < names.length; i++)
		// for(int i = 0; i < tels.length; i++)
		for(int i = 0; i < memberCount; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", i + 1);
			
			// 박범구 010-1234-2345
			// ------
			names[i] = sc.next();
			// 박범구 010-1234-2345
			//        -------------
			tels[i] = sc.next();
		}

		// 최종 결과(이름, 전화번호) 출력
		System.out.println();
		System.out.println("--------------------");
		System.out.printf("전체 학생 수 : %d\n", memberCount);
		System.out.println("--------------------");
		System.out.println("이름    전화번호");
		
		for(int i = 0; i < memberCount; i++)
		{
			System.out.printf("$3s %14s\n", names[i], tels[i]);
		}
		System.out.println("--------------------");
	}
}