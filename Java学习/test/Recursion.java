//public class Recursion
//{
//	public static void main(String[] arg)
//	{
//		int n=4;
//		System.out.println(sum(n));
//	}
//
//	public static int sum(int n)
//	{
//		if(n==1)
//			return 1;
//		return sum(n-1)+n;
//	}
//}

public class Recursion
{
	public static void main(String[] arg){
		int i=4;
		System.out.println(multi(i));
	}

	public static int multi(int n){
		if(n==1)
			return 1;
		return n*multi(n-1);
		
	}
}