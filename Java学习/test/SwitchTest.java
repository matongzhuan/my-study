public class SwitchTest
{
	public static void main(String[] arg){
		/*
		long x=10L;
		switch(x){} 编译错误，精度
		*/
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("请输入第一个数字");
		int num1=s.nextInt();
		System.out.print("请输入运算符");
		String str=s.next();
		System.out.print("请输入第二个数字");
		int num2=s.nextInt();
		switch(str){
			case "+":
				System.out.println(num1+"+"+num2+"="+(num1+num2));
				break;
			case "-":
				System.out.println(num1+"-"+num2+"="+(num1-num2));
				break;
			case "*":
				System.out.println(num1+"*"+num2+"="+(num1*num2));
				break;
			case "/":
				System.out.println(num1+"/"+num2+"="+(num1/num2));
				break;
			default:
				System.out.println("您输入的运算符不合法");

		}
		


//		int num=s.nextInt();
//		switch(num){
//			case 1:
//				System.out.println("星期一");
//				break;
//			case 2:
//				System.out.println("星期二");
//				break;
//			case 3:
//				System.out.println("星期三");
//				break;
//			case 4:
//				System.out.println("星期四");
//				break;
//			case 5:
//				System.out.println("星期五");
//				break;
//			case 6:
//				System.out.println("星期六");
//				break;
//			case 7:
//				System.out.println("星期日");
//				break;
//			default:
//				System.out.println("输入数字不合法");
//				break;
//		}
//		System.out.println("请输入星期几:");
//		String str=s.next();
//		switch(str){
//			case "星期一"：
//				System.out.println(1);
//				break;
//			default:
//				System.out.println("no 1");
//				break;
//		}
	}
}