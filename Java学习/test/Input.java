public class Input
{
	public static void main(String[] arg){
		java.util.Scanner s=new java.util.Scanner(System.in);
		
		//next()���յ����ַ����ı�
		//nextIn()���յ�������Int
		System.out.print("��������������:");

		int num=s.nextInt();
		String str="����";
		if(num<0||num>150){
			str="����������䲻�Ϸ�";
			System.out.println(str);
		}else{
			if(num<=10){
				str="�ٶ�";
			}else if(num<=18){
				str="������";
			}else if(num<=35){
				str="����";
			}else if(num<=55){
				str="����";
			}
			System.out.println("�������������ڵģ�"+str);
		}	
	}
}