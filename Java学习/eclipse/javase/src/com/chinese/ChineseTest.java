package com.chinese;

public class ChineseTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chinese zhansan=new Chinese("1","zhangsan");
		System.out.println(zhansan.id+","+zhansan.name+","+Chinese.country);
		
		Chinese lisi=new Chinese("2","lisi");
		System.out.println(lisi.id+","+lisi.name+","+Chinese.country);
	}

}
