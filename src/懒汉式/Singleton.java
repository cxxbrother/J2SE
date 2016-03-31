package 懒汉式;


//调用时候才加载自己

public class Singleton {

	private Singleton(){}
	
	private static Singleton single=null;
	
	//静态工厂方法
	/**
	 * 方式一
	 * 汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton实例
	 */
	public static Singleton getInstance1(){
		if(single==null){
			single=new Singleton();
		}
		return single;
	}
	/**
	 * 方式二
	 * 实现线程安全
	 * 在getInstance方法上加同步
	 * @return
	 */
	public static synchronized Singleton getInstance2(){
		if(single==null){
			single=new Singleton();
		}
		return single;
	}
	/**
	 * 方式三 线程安全
	 * 双重检查锁定
	 * @return
	 */
	public static Singleton getInstance3(){
		if(single==null){
			synchronized(Singleton.class){
				if(single==null){
					single=new Singleton();
				}
			}
		}
		return single;
	}
	
	
	/**
	 * 静态化内部类
	 * 这种比上面的其他方式都好一些，既实现了线程安全，又避免了同步带来的性能影响
	 * @return
	 */
	public static class LazyHolder{
		private static final Singleton INSTANCE= new Singleton();
	}
	public static final Singleton getInstance4(){
		return LazyHolder.INSTANCE;
	}
}
