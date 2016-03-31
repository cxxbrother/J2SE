package 登记式;

import java.util.HashMap;
import java.util.Map;
/**
 * 登记式单例实际上维护了一组单例类的实例，将这些实例存放在一个Map（登记薄）中，对于已经登记过的实例
 * ，则从Map直接返回，对于没有登记的，则先登记，然后返回。 
 * 这里我对登记式单例标记了可忽略，我的理解来说，首先它用的比较少，
 * 另外其实内部实现还是用的饿汉式单例，因为其中的static方法块，它的单例在类被装载的时候就被实例化了。
 * @author chenxu
 *
 */
//类似Spring里面的方法，将类名注册，下次从里面直接获取。  
public class Singleton{
	private static Map<String ,Singleton> map=new HashMap<String ,Singleton>();
	static {
		Singleton single=new Singleton();
		map.put(single.getClass().getName(), single);
	}
	//保护的默认构造方法
	protected Singleton(){}
	//静态工厂方法,返还此类惟一的实例
	public static Singleton getInstance(String name){
		if(name==null){
			name=Singleton.class.getName();
			System.out.println("name == null"+"--->name="+name);
		}
		if(map.get(name)==null){
			try{
				map.put(name, (Singleton)Class.forName(name).newInstance());
			}catch(InstantiationException e){
				e.printStackTrace();
			}catch(IllegalAccessException e){
				e.printStackTrace();
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
			
		}
		return map.get(name);
	}
	
	public String about(){
		return "Hello, I am RegSingleton.";
	}
	public static void main(String[] args) {
		Singleton single=Singleton.getInstance(null);
		System.out.println(single.about());
	}
}
