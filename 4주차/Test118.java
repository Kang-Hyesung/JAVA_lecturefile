/*==========================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface)
==========================*/

// 인터페이스
interface ADemo
{
	public void write();
}

// 인터페이스
interface BDemo
{
	public void print();		
}

// 인터페이스는 2개 이상을 구현(implements)할 수 있다.
// -> 클래스에서 다중 상속이 되지 않는 부분을 보완(보충)하는 개념

// 클래스
// class DemoImpl
// class DemoImpl extends ADemo, BDemo   // x
// class DemoImpl implements ADemo, BDemo

// 추상 클래스 - 두 인터페이스를 구현하는 추상 클래스
//abstract class DemoImpl implements ADemo, BDemo

// 클래스 - 두 인터페이스를 구현한 후 -> 두 인터페이스의 모든 메소드를 Overriding -> 일반 클래스
class DemoImpl implements ADemo, BDemo
{
	// JDK 1.5(5.0)에서는 인터페이스 메소드를 오버라이딩(Overriding)할 때 @Override 어노테이션을 사용할 수 없다.
	// JDK 1.6(6.0) 이후부터 적용 가능한 문법이다. 단, 상속받은 클래스의 메소드를 오버라이딩(Overriding)할 때에는
	// JDK 1.5(5.0)에서도 어노테이션(anotation) 사용이 가능하다.
	@Override
	public void write()
	{
		System.out.println("ADemo 인터페이스 메소드 write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo 인터페이스 메소드 print()...");
	}
}


// main() 메소드를 포함하는 외부의 다른 클래스
public class Test118
{
	public static void main(String[] args)
	{
		// ADemo ob = new ADemo(); 인터페이스로 인스턴스 생성 불가능(추상클래스도 안되는데)
		// BDemo ob = new BDemo(); 인터페이스로 인스턴스 생성 불가능(추상클래스도 안되는데)
		
		// ADemo, BDemo 인터페이스를 구현(implements)한
		// 클래스(-> DemoImpl) 기반의 인스턴스 생성
		DemoImpl ob1 = new DemoImpl();	// 이상 없음

		ob1.write();
		//== ADemo 인터페이스 메소드 write()...

		ob1.print();
		//== BDemo 인터페이스 메소드 print()...
		

		// 둘 다 업 캐스팅
		ADemo ob2 = new DemoImpl();
		BDemo ob3 = new DemoImpl();

		//ob2.print();		//ob2에는 print메소드가 없다
		//==  cannot find symbol 컴파일 에러
		//ob3.write();		//ob3에는 write메소드가 없다
		//==  cannot find symbol 컴파일 에러

		ob2.write();
		ob3.print();
		// ADemo 인터페이스 메소드 write()...
		// BDemo 인터페이스 메소드 print()...

		((BDemo)ob2).print();
		//== BDemo 인터페이스 메소드 print()...
		((ADemo)ob3).write();
		//== ADemo 인터페이스 메소드 write()...
		// DemoImpl 클래스가 두 인터페이스(ADemo, BDemo)를 모두 구현했기 때문에
		// 이와 같은 처리가 가능하다.
		// 만약, DemoImpl 클래스가 두 인터페이스들 중 한 인터페이스만 구현했다면
		// 이 구문은 런타임 에러가 발생하는 구문이 된다.
		

		// 다운 캐스팅
		((DemoImpl)ob3).write();


	}
}

// 각각의 인터페이스에 같은 이름의 메소드가 있을 때 구별해서 Overriding하는 방법이 있는지 컴파일 오류가 생기는지