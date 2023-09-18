/*=====================================================================================
  ■■■ 클래스와 인스턴스 ■■■
  - 정보 은닉과 접근제어지시자(접근 지시자, 접근 제어자, 접근 지정자, 접근 제한자, ...)
=====================================================================================*/
/*
*/
import java.util.Scanner;

class CircleTest2
{
	// 멤버 변수, 인스턴스 변수, 전역 변수
	// int num;
	// 정보 은닉(Information Hiding) 을 거치면
	private int num;		// private이라는 접근제어지시자의 선언은 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
							// int형 전역변수이기 때문에 자동으로 0으로 초기화 된다.
	// getter / setter 구성
	/*
	public int getNum()
	{
		return num;
	}

	public setNum(int num)
	{
		this.num = num;
	}
	*/


	public void input()			// 이렇게 public을 붙여줘도 class에 default가 기본으로 있기 때문에 
								// 다른 패키지의 경우에는 class안으로 못 들어가서 input()에 접근 불가
								// public이 붙은 class는 파일에 하나만 있어야 한다. 그래서 분리하는 것
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력 : ");
		num = sc.nextInt();
	}

	public double calArea()
	{
		return num * num * 3.141592;
	}

	public void write(double area)
	{
		System.out.println(">> 반지름 : " + num);
		System.out.println(">> 넓이   : " + area);
	}
}

public class Test098
{
	public static void main(String[] args)
	{
		// CircleTest2 인스턴스 생성
		CircleTest2 ob1 = new CircleTest2();

		// ob1.num = 10; 클래스 안에서 private이라서 불가능
		// ob1.setNum(10);

		// System.out.println("원의 반지름 : " + ob1.num);
		// System.out.println("원의 반지름 : " + ob1.getNum);

		// 게터세터를 사용하지 않고 하려면 현재 유일하게 num값을 전달할 수 있는 방법
		ob1.input();			// 반지름 입력 : 500 -> ob1.num에 500을 대입하라

		double result = ob1.calArea();

		ob1.write(result);

/*
반지름 입력 : 500
>> 반지름 : 500
>> 넓이   : 785398.0
계속하려면 아무 키나 누르십시오
*/

	}
}