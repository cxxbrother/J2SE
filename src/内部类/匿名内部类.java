package 内部类;

public class 匿名内部类 {

	public void outMethod(){
		
		/**
		 * 没出现class关键字，但实际上却创建了类
		 * 没有具体名字，十分灵活，工作原理相当与局部内部类
		 * 命名有排序后得到，如：匿名内部类$1.class,匿名内部类$2.class
		 */
		new OneInterface(){
			@Override
			public void interMethod() {
				
			}
		};
	}
}
