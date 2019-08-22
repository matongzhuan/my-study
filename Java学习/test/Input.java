public class Input
{
	public static void main(String[] arg){
		java.util.Scanner s=new java.util.Scanner(System.in);
		
		//next()接收的是字符串文本
		//nextIn()接收的是整型Int
		System.out.print("请输入您的年龄:");

		int num=s.nextInt();
		String str="老年";
		if(num<0||num>150){
			str="您输入的年龄不合法";
			System.out.println(str);
		}else{
			if(num<=10){
				str="少儿";
			}else if(num<=18){
				str="青少年";
			}else if(num<=35){
				str="青年";
			}else if(num<=55){
				str="中年";
			}
			System.out.println("您处于生命周期的："+str);
		}	
	}
}