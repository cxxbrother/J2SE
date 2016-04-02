package 接口与抽象类;

import java.io.Serializable;

//只能继承一个抽象类
public class 继承与实现 extends 抽象类   implements 接口{

	
	//必须重写抽象方法
	@Override
	public void sun() {
		int s=super.ss;
	}
	@Override
	public void interfaceSun() {
		// TODO Auto-generated method stub
		
	}
	
	//可以多继承
	public class 实现 implements 接口,Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 14874L;

		//必须重写抽象方法
		@Override
		public void interfaceSun() {
			// TODO Auto-generated method stub
			
		}

	}




}
