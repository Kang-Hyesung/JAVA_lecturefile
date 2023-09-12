public class Test016
{
	public static void main(String args[])
	{
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC\n");		//-- \n 개행
		// ==AAABBBCCC

		System.out.println();			//-- 개행

		//System.out.print();				 매개변수 없이 사용못함

		System.out.printf("1234567890");
		System.out.printf("1234567890\n");	//-- \n 개행
		System.out.printf("1234567890%n");	//-- %n 개행

		//System.out.printf();				 매개변수 없이 사용못함

		System.out.printf("%d + %d = %d\n", 10, 20, 30);
		//== 10 + 20 = 30

		System.out.printf("%d\n", 123);
		System.out.printf("%10d\n", 123);	// 123을 포함하여 10자리를 확보해서 출력하라
		System.out.printf("%8d\n", 1234);	// 1234을 포함하여 8자리를 확보해서 출력하라
		System.out.printf("%010d\n", 123);	// 123을 포함하여 10자리를 확보하고 빈 자리는 0으로 채워라

		// 실행 결과
		//	123
		//		   123
		//		1234
		//	0000000123

		System.out.printf("%+d\n", 365);
		//== +365
		System.out.printf("+%d\n", 365);
		//== +365
		System.out.printf("%d\n", +365);
		//== 365

		//System.out.printf("%-d\n", 365);
		//== 에러 발생(런타임 에러)
		System.out.printf("-%d\n", 365);
		//== -365
		System.out.printf("%d\n", -365);
		//== -365

		//System.out.printf("%d\n", 'A');
		//== 에러 발생(런타임 에러)
		System.out.printf("%c\n", 'A');
		//== A

		//System.out.printf("%c\n", "ABCD");
		//== 에러 발생(런타임 에러)
		System.out.printf("%s\n", "ABCD");
		//== ABCD


		System.out.printf("%h\n", 365);
		//== 16d   -> 16진수 형태

		System.out.printf("%o\n", 24);
		//== 30

		System.out.printf("%b\n", true);
		System.out.printf("%b\n", false);
		//== true
		//   false

		System.out.printf("%f\n", 123.23);
		System.out.printf("%.2f\n", 123.23); // 소수점 이하 두 번째 자리까지 표현
		//== 123.230000
		//	 123.23

		System.out.printf("%.2f\n", 123.231);
		//== 123.23
		//   소수점 이하 두 번째 자리까지 표현
		//	 (소수점 이하 세 번째 자리 절삭)

		System.out.printf("%.2f\n", 123.235);
		//== 123.24
		//	 소수점 이하 두 번째 자리까지 표현
		//   (소수점 이하 세 번째 자리 올림)

		System.out.printf("%8.2f\n", 123.256);
		//==   123.26  -> .도 자리에 포함된다. 123.26 6개 포함해서 8자리 확보
		System.out.printf("%2.2f\n", 123.236); //표현하려는 데이터보다 확보수가 작으면 무시된다.
		//== 123.24

	}
}

