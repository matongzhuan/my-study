public class SwitchTest
{
	public static void main(String[] arg){
		/*
		long x=10L;
		switch(x){} ������󣬾���
		*/
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("�������һ������");
		int num1=s.nextInt();
		System.out.print("�����������");
		String str=s.next();
		System.out.print("������ڶ�������");
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
				System.out.println("���������������Ϸ�");

		}
		


//		int num=s.nextInt();
//		switch(num){
//			case 1:
//				System.out.println("����һ");
//				break;
//			case 2:
//				System.out.println("���ڶ�");
//				break;
//			case 3:
//				System.out.println("������");
//				break;
//			case 4:
//				System.out.println("������");
//				break;
//			case 5:
//				System.out.println("������");
//				break;
//			case 6:
//				System.out.println("������");
//				break;
//			case 7:
//				System.out.println("������");
//				break;
//			default:
//				System.out.println("�������ֲ��Ϸ�");
//				break;
//		}
//		System.out.println("���������ڼ�:");
//		String str=s.next();
//		switch(str){
//			case "����һ"��
//				System.out.println(1);
//				break;
//			default:
//				System.out.println("no 1");
//				break;
//		}
	}
}