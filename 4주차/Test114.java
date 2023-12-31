/*=========================
  ■■■ 클래스 고급 ■■■
  - 상속(Inheritance)
==========================*/
/*
 메소드 오버라이딩(Method Overriding)의 특징

 - 메소드 이름, 리턴 타입, 파라미터 수나 타입이 완전히 일치해야 한다.
 - 반드시 상속 관계가 있어야 한다.
 - 재정의된 하위 클래스의 메소드 접근제어지시자는
   상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
   예를 들어, 상위 클래스 메소드의 접근제어지시자가 protected인 경우
   하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
   접근제어지시자는 public 또는 protected 이어야 한다.
 - static, final, private 메소드는
   오버라이딩(Overriding)할 수 없다.
 - Exception 의 추가가 불가능하다.
   즉, 상위 메소드가 가지고 있는 기존의 예외 사항에
   새로운 Exception 을 추가하는 것은 불가능하다는 것이다.
*/

// 부모 클래스(상위 클래스, super class)
class SuperTest114
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super Write() 메소드 : " + a + " : " + b + " : " + c);
	}
}

// 자식 클래스(하위 클래스, sub class)
class SubTest114 extends SuperTest114
{
	/*
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super Write() 메소드 : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;

	public void print()
	{
		// System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c);
		// 에러 발생(컴파일 에러)
		// 슈퍼클래스에서 선언된 변수 a 에는 접근할 수 없다
		// -> private 변수이기 때문
		System.out.println("Sub print() 메소드 : " + b + " : " + c);
		//== Sub print() 메소드 : 100 : 20      100 20 이 나오는 이유? -> SubTest114클래스에서 선언된 b가 덮어쓰기 함

		System.out.println("Sub print() 메소드 : " + b);			//== 100
		System.out.println("Sub print() 메소드 : " + this.b);		//== 100  == SubTest114.b
		System.out.println("Sub print() 메소드 : " + super.b);		//== 10   == SuperTest114.b
		// 변수 b는 접근 방법에 따라 다른 b로 접근 및 출력이 이루어진다
		// 슈퍼클래스에서 선언된 b, 서브클래스에서 선언된 b
		
		System.out.println("Sub print() 메소드 : " + c);			// 20
		System.out.println("Sub print() 메소드 : " + this.c);		// 20
		System.out.println("Sub print() 메소드 : " + super.c);		// 20
		// 변수 c는 접근하는데 아무런 제약과 제한이 없다
		// 슈퍼클래스에서 선언된 c
	}// end print()

	@Override
	public void write()
	{
		// System.out.println("Super Write() 메소드 : " + a + " : " + b + " : " + c);
		// 에러 발생(컴파일 에러)
		// 슈퍼클래스에서 선언된 변수 a 에는 접근할 수 없다
		// -> private 변수이기 때문

		System.out.println("Sub print() 메소드 : " + b + " : " + c);
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test114
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest114) 인스턴스 생성
		SubTest114 ob = new SubTest114();

		ob.print();

		ob.write();
		//== Super Write() 메소드 : 5 : 10 : 20    오버라이딩 하기 전
		//== Sub print() 메소드 : 100 : 20         a를 출력구문에서 지운 후

		System.out.println("--------------------------------구분선");

		System.out.println(ob.b); //== 100
		System.out.println(((SuperTest114)ob).b); //== 10
		// SubTest114(하위 클래스) 자료형인 ob를 SuperTest114(상위 클래스)자료형으로 형변환하여 b를 부르면
		// 상위 클래스에서 선언된 대로 출력된다 == 슈퍼 부름
		// 반드시 괄호 ((SuperTest114)ob) 이런식으로 해야함!!!!!!

		ob.write();					//== Sub print() 메소드 : 100 : 20
		((SuperTest114)ob).write(); //== Sub print() 메소드 : 100 : 20 
		// 메소드는 변형되면 되돌릴 수 없다 == 메소드는 슈퍼 콜 불가능
		

	}
}