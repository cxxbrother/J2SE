package 内部类;

public class 成员内部类 {
	int out;
	void outMethods(){
		
	}
	/**
	 * 需要等外部类创建对象以后才会被加载到JVM
	 * @author chenxu
	 */
	class Inner{
		/*
		 内部类的默认构造方法：
		 class Inner(成员内部类 outter){
		 	this.ooutter=outter;
		 }
		 访问外部类时，可访问到静态和非静态成员
		 默认如下：o.xxx();
		 */
		int i=out;
		void innerMethods() {
			outMethods();
		} //相当于o.out、o.outMethods;
	}
	/**
	 * 创建内部类必须创建一个外部类的实例
	 * @param args
	 */
	public static void main(String[] args) {
		成员内部类 outter =new 成员内部类();
		成员内部类.Inner inner=outter.new Inner();
	}
}
