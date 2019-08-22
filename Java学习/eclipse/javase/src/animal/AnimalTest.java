package animal;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a=new Animal();
		a.move();
		
		
		Cat c=new Cat();
		c.move();
		
		
		Bird b=new Bird();
		b.move();
		
		/**
		 * animal是父类，cat是子类
		 * 子类型转换成父类型，向上转型
		 * a2指向的是一个Cat对象，故运行阶段方法执行的是Cat中的方法
		 */
		Animal a2=new Cat();
		a2.move();
		
		/**
		 * 编译阶段，只会把a2看做Animal，只能调用Animal中的方法
		 * 不能调用Cat中的方法
		 */
//		a2.catchmouse();
		
		Animal a3=new Bird();
		/**
		 * 程序编译通过，因为Animal与Cat之间存在继承关系
		 * 运行阶段出现异常java.lang.ClassCastException
		 * 因为在JVM中堆内存中存储的是Bird对象，两种类型之间不存在继承关系
		 * 向下转型存在安全隐患
		 */
//		Cat c3=(Cat)a3;
		if(a3 instanceof Cat){ //a3是否是Cat实例对象
			Cat c3=(Cat)a3;
			((Cat) a3).catchmouse();
		}else if(a3 instanceof Bird){
			Bird b3=(Bird)a3;
			b3.move();
		}
		
	}
}
