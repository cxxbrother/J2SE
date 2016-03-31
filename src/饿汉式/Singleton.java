package 饿汉式;
/**
 * 饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的  
 * @author chenxu
 *
 */
public class Singleton {

	private static final Singleton single=new Singleton();
	private Singleton(){}
	public static Singleton getInstance(){
		return single;
	}
	
}
