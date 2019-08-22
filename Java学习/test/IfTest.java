public class IfTest
{
	public static void main (String[] arg){
		System.out.println("欢迎使用本系统");
		System.out.println("说明1:1表示下雨，0表示晴天");
		System.out.println("说明2:1表示男，0表示女");
		System.out.println("说明3：温度问为数字");
		
		System.out.print("请输入今天的天气");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int weather=s.nextInt();
		System.out.print("请输入性别：");
		int sex=s.nextInt();
		if(weather==1)
		{
			//System.out.println("下雨天");
			if(sex==1){
				System.out.println("带大黑伞");
			}else if(sex==0){
				System.out.println("带花伞");
			}else{
				System.out.println("您输入的性别不合法");
			}
		}else if(weather==0){
			//System.out.println("晴天");
			System.out.print("请输入温度");
			int tem=s.nextInt();
			if(tem>30){
				if(sex==1){
					System.out.println("带墨镜");
				}else if(sex==0){
					System.out.println("擦翻晒");
				}else{
					System.out.println("您输入的性别不合法");
				}
			}else{
				System.out.println("天气很好");
			}
		}else{
			System.out.println("您输入的天气不合法");
		}
	}
}