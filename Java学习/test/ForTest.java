public class ForTest
{
	public static void main(String[] arg){
		//1-100������
		for(int i=1;i<=100;i++){
			boolean flag=true;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=false;
					break;
				}		
			}
			if(flag)
				System.out.println(i);
		}


		//�˷��ھ����
//		for(int i=1;i<=9;i++){
//			for(int j=1;j<=i;j++){
//				System.out.print(i+"*"+j+"="+(i*j));
//				System.out.print('\t');
//			}
//			System.out.print('\n');//System.out.println()Ҳ��
//		}
	}
}