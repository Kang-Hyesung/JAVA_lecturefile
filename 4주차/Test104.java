/*==================================================================
  ■■■ 클래스와 인스턴스 ■■■
 - 메소드 오버로딩(Method Overloading)이 가능한 형태와 불가능한 형태
===================================================================*/

public class Test104
{
	public static void main(String[] args)
	{
		print('A');

		print(20);

		print(3.14);

		double result = print(3.14);
	}

	public static void print() {}
	//public static void print() {}					         허용x
	public static void print(int i) {}			          // 가능
	//public static void print(int j) []			         14번과 중복 == 허용 x
	public static void print(char c) {}				      // 가능 but 자동 형 변환 조심
	public static void print(int i, int j) {}		      // 가능
	public static void print(double d) {}				  // 가능 but 자동 형 변환 조심
	//public static void print(double e) {return 10.0;}	     반환형 잘못됨
	//public static double print(double d) {return 10.0;} // 안됨
}