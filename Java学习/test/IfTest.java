public class IfTest
{
	public static void main (String[] arg){
		System.out.println("��ӭʹ�ñ�ϵͳ");
		System.out.println("˵��1:1��ʾ���꣬0��ʾ����");
		System.out.println("˵��2:1��ʾ�У�0��ʾŮ");
		System.out.println("˵��3���¶���Ϊ����");
		
		System.out.print("��������������");
		java.util.Scanner s=new java.util.Scanner(System.in);
		int weather=s.nextInt();
		System.out.print("�������Ա�");
		int sex=s.nextInt();
		if(weather==1)
		{
			//System.out.println("������");
			if(sex==1){
				System.out.println("�����ɡ");
			}else if(sex==0){
				System.out.println("����ɡ");
			}else{
				System.out.println("��������Ա𲻺Ϸ�");
			}
		}else if(weather==0){
			//System.out.println("����");
			System.out.print("�������¶�");
			int tem=s.nextInt();
			if(tem>30){
				if(sex==1){
					System.out.println("��ī��");
				}else if(sex==0){
					System.out.println("����ɹ");
				}else{
					System.out.println("��������Ա𲻺Ϸ�");
				}
			}else{
				System.out.println("�����ܺ�");
			}
		}else{
			System.out.println("��������������Ϸ�");
		}
	}
}