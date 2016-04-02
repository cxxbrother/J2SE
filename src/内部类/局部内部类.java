package 内部类;

public class 局部内部类 {

	public void outMethod(){
		int i;
		final int j=2;
		class Inner{
			/**
			 * 限制：
			 * 1.无法使用static 关键字，只能使用final和abstract
			 * 2.只能访问final修饰的的局部变量
			 */
			//static int i=1;错误
			//int s=i;错误
			int ss=j;
		}
	}
}
