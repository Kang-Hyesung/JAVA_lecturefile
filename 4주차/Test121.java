/*==========================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface)
==========================*/
/*
○ 실습 문제
   성적 처리 프로그램을 구현한다.
   단, 인터페이스를 활용할 수 있도록 한다.


 실행 예)
 인원 수 입력(1~10) : 11
 인원 수 입력(1~10) : 0
 인원 수 입력(1~10) : 2

 1번째 학생의 학번 이름 입력(공백 구분) : 2309123 aaa
 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
 2번째 학생의 학번 이름 입력(공백 구분) : 2309125 bbb
 국어 영어 수학 점수 입력   (공백 구분) : 85 70 60

 2309123 aaa   90 100  85   총점   평균.xx
 				  수  수  우
 2309125 bbb   85  70  60   총점   평균.xx
 				  우  미  양

 계속하려면...

 90 이상	     수
 80 이상 90 미만 우
 70      80      미
 60		 70		 양
 				 가
*/
import java.util.Scanner;
import java.io.IOException;

// 속성만 존재하는 클래스 -> 자료형 활용
class Record
{
	String hak, name;			// 학번 이름
	int kor, eng, mat;			// 국어 영어 수학
	int tot;					// 총점
	double avg;					// 평균
}



interface Sungjuk
{
	public void set();			// 인원 세팅
	public void input();		// 데이터 입력
	public void print();		// 결과 출력
}



// 문제 해결 과정에서 설계해야 할 클래스 -> Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	private int inwon;
	private Record[] rec;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = sc.nextInt();

		}
		while (inwon > 10 || inwon < 1);

		rec = new Record[inwon];
	}

	@Override
	public void input()
	{
		for(int i = 0; i < inwon; i++)
		{
			rec[i] = new Record();

			Scanner sc = new Scanner(System.in);
			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i + 1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3.0;
		}
	}

	@Override
	public void print()
	{
		for(int i = 0; i < inwon; i++)
		{
			System.out.printf("%s %s   %d %d %d   %d   %.2f\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("%14s %s %s\n", panJung(rec[i].kor), panJung(rec[i].eng), panJung(rec[i].mat));
		}
	}

	// 내부적으로 등급에 대한 판정을 수행할 메소드

	private String panJung(int Score)
	{
		if(Score >= 90)
			return "수";
		else if (Score >= 80)
			return "우";
		else if(Score >= 70)
			return "미";
		else if(Score >= 60)
			return "양";
		else
			return "가";

	}

}


// main() 메소드를 포함하는 외부의 다른 클래스
public class Test121
{
	public static void main(String[] args) throws IOException
	{
		//Sungjuk ob;
		Sungjuk ob = new SungjukImpl();  // 업캐스팅

		// 문제 해결 과정에서 작성해야 할 ob 구성 및 객체 생성

		ob.set();
		ob.input();
		ob.print();

		// 판정이 public 일때
		// System.out.print(((SungjukImpl)ob).panJung(90));

		// 이렇게도 가능
		// ((SungjukImpl)ob).set();
		// ((SungjukImpl)ob).input();
		// ((SungjukImpl)ob).print();
	}

/*
인원 수 입력(1~10) : 11
인원 수 입력(1~10) : 0
인원 수 입력(1~10) : 2
1번째 학생의 학번 이름 입력(공백 구분) : 2309123 aaa
국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
2번째 학생의 학번 이름 입력(공백 구분) : 2309125 bbb
국어 영어 수학 점수 입력   (공백 구분) : 85 70 60
2309123 aaa   90 100  85   275   91.67
                   수 수  우
2309125 bbb   85 70  60   215   71.67
                   우 미  양
*/
}