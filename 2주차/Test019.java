/*==========================================
     ＝＝＝ 切郊 奄沙 覗稽益掘講 ＝＝＝
- 痕呪人 切戟莫
- 切郊税 奄沙 脊窒径 : System.util.Scanner
===========================================*/

// 姥歳切 走舛(, / . 去)

import java.util.Scanner;

public class Test019
{
	public static void main(String args[])
	{
		// 爽推 痕呪 識情
		Scanner sc = new Scanner(System.in);
		String name;
		int kor,eng,mat, tot;

		// 尻至 貢 坦軒
		System.out.print("戚硯,厩嬢,慎嬢,呪俳 脊径(, 姥歳) : ");
		// 戚硯,厩嬢,慎嬢,呪俳 脊径(, 姥歳) : けけけ,90,80,70

		sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); 
		//				 ---------
		//			 "けけけ,90,80,70"
		//
		//new Scanner(sc.next()).useDelimiter("\\s*,\\s*"); 什蝶格 照拭 usdDelimiter 紫遂
		//						.姥歳切紫遂();
		//									  "\\s*,\\s*"
		//										\s*,\s*

		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();

		tot = kor + eng + mat;


		// 衣引 窒径
		System.out.println("\n>> 戚硯 : " + name);
		System.out.println(">> 恥繊 : " + tot);

		//叔楳 衣引
/*
戚硯,厩嬢,慎嬢,呪俳 脊径(, 姥歳) : けけけ,90,80,70

>> 戚硯 : けけけ
>> 恥繊 : 240
*/
	}
}
