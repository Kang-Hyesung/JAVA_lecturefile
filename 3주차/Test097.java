/*====================
  ■■■ 배열 ■■■
    - 배열의 복사
====================*/
/*
Test096.java 파일과 비교

	자바에서 배열 변수의 복사에는 데이터 복사, 주소값 복사 두 가지 형태가 존재한다.

	주소값 복사 -> 얕은 복사
	원본을 수정하면 복사본에 영향을 미치게 되는 복사 방법
	(자바의 배열 뿐 아니라 모든 참조형 데이터에 해당하는 복사 방법)

	데이터 복사 -> 깊은 복사
	실제 요소로 들어있는 값에 대한 복사로
	원본을 수정해도 복사본에 영향을 미치지 않는 복사 방법

 데이터 복사
 - int 형 배열에 대한 깊은 복사를 처리하는
   메소드를 정의하는 형태로 실습 진행
*/
public class Test097
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};		// 배열 원본

		int[] copys1 = nums;					// 주소값 복사(얕은 복사)

		int[] copys2 = copyArray(nums);			// 데이터 복사(깊은 복사)
												// 사용자 정의 메소드 호출

		int[] copys3 = (int[])nums.clone();		// 데이터 복사(깊은 복사)
												// 자바 제공 메소드 호출(close), int[] 형으로 형변환

		// 원본 배열(nums) 요소의 수정 발생
								nums[1] = 2345; // 원본의 값을 변경했다.

		// 결과 확인
		for(int i = 0; i < nums.length; i++)	// 배열 원본
			System.out.printf("%5d", nums[i]);	//==    10 2345   30   40   50
		System.out.println();

		for(int i = 0; i < copys1.length; i++)	// 주소값 복사(얕은 복사)
			System.out.printf("%5d", copys1[i]);//==    10 2345   30   40   50
		System.out.println();

		for(int i = 0; i < copys2.length; i++)	// 데이터 복사(깊은 복사), 사용자 정의 메소드
			System.out.printf("%5d", copys2[i]);//==    10   20   30   40   50
		System.out.println();

		for(int i = 0; i < copys3.length; i++)	// 데이터 복사(깊은 복사), 자바 제공 메소드 호출
			System.out.printf("%5d", copys3[i]);//==    10   20   30   40   50
		System.out.println();



	}

/*	매개변수로 int 배열 타입을 넘겨받아
	이 배열을 복사한 후
	복사한 배열을 반환하는 기능을 가진 메소드 정의
*/

	public static int[] copyArray(int[] os)		// int배열 타입을 매개변수로 넣어준다, 복사한 배열을 반환하므로 반환형은 int배열형
	{
		// 매개변수로 넘겨받은 배열(os)
		// 즉, 원본 배열만큼의 배열방(메모리 공간)을 확보한
		// 복사할 배열 생성
		int[] result = new int[os.length];		// 매개변수로 받은 배열의 길이로 배열의 크기 만들어준다.

		// 원본 배열(os)에 담겨있는 각각의 요소들을 복사 배열(result)에 담아내기
		// result = os;							// 데이터 복사가 목적이기 때문에 주소값 복사(참조변수)를 하면 안된다.
		for(int i = 0; i < result.length; i++)	// os.length도 같다.
		{
			result[i] = os[i];
		}

		// 복사한 배열(result) 반환

		return result;
	}
}