/*==============================================
    ■■■ 자바 기본 프로그래밍 ■■■
	- 변수와 자료형
	- 자바의 기본 입출력 : BufferedRader 클래스
===============================================*/

// 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
// 이름과 총점을 출력하는 프로그램을 구현한다.

// 실행 예)
// 이름을 입력하세요 : 정한울
// 국어 점수 입력 : 90
// 영어 점수 입력 : 80
// 수학 점수 입력 : 70

// ====[결과]====
// 이름 : 정한울
// 총점 : 240
// 계속하려면 아무 키나 누르세요
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
/*		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int kor = 0, eng = 0, mat = 0, total = 0;
		String name;

		System.out.print("이름을 입력하세요 : ");	
		name = br.readLine();

		System.out.print("국어 점수 입력 : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("영어 점수 입력 : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("수학 점수 입력 : ");
		mat = Integer.parseInt(br.readLine());

		total = kor + eng + mat;

		System.out.println();


		System.out.println("====[결과]====");
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + total);
*/
// 결과 확인
/*
이름을 입력하세요 : 정한울
국어 점수 입력 : 90
영어 점수 입력 : 80
수학 점수 입력 : 70

====[결과]====
이름 : 정한울
총점 : 240
계속하려면 아무 키나 누르십시오 . . .
*/
		// 주요 변수 선언

		// BufferedReader 인스턴스 생성
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 아래 두 줄과 같다. isr에 대입하면 아래 두 줄과 정확하게 같다.

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strName;			// 이름 변수
		int nKor, nEng, nMat;	// 국어점수, 영어점수, 수학점수 변수
		int nTot;				// 총점 변수
		String strTemp;			// 문자열 임시 저장 변수

		// 연산 및 처리
		// - 사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print("이름을 입력하세요 : ");

		// - 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strName = br.readLine();
		
		// - 사용자에게 안내 메세지 출력(국어점수 입력 안내)
		System.out.print("국어 점수 입력 : ");

		// - 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();

		// - 담아낸 데이터를 변환한 후 필요한 변수에 다시 담기
		nKor = Integer.parseInt(strTemp);

		// - 사용자에게 안내 메세지 출력(영어점수 입력 안내)
		System.out.print("영어 점수 입력 : ");

		// - 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();

		// - 담아낸 데이터를 변환한 후 필요한 변수에 담아내기
		nEng = Integer.parseInt(strTemp);

		// - 사용자에게 안내 메세지 출력(수학점수 입력 안내)
		System.out.print("수학 점수 입력 : ");

		// - 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();

		// - 담아낸 데이터를 변환한 후 필요한 변수에 담아내기
		nMat = Integer.parseInt(strTemp);

		// - 각 점수 변수에 담겨있는 데이터(사용자가 입력한 데이터)들을
		//	 종합하여 총점을 산출하고 그 결과를 총점 변수에 담아내기
		nTot = nKor + nEng + nMat;

		// 결과 출력
		System.out.println("\n====[결과]====");
		System.out.println("이름 : " + strName);
		System.out.println("총점 : " + nTot);

	}
}
