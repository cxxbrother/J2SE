package 饿汉式;

/**
 * 使用ThreadLocal修复双重检测借助于ThreadLocal，
 * 将临界资源（需要同步的资源）线程局部化，具体到本例就是将
 * 双重检测的第一层检测条件 if (instance == null) 转换
 * 为了线程局部范围内来作。这里的ThreadLocal也只是用作标示而已，
 * 用来标示每个线程是否已访问过，如果访问过，则不再需要走同步块，
 * 这样就提高了一定的效率。但是ThreadLocal在1.4以前的版本都较慢，
 * 但这与volatile相比却是安全的。
 * @author chenxu
 *
 */
public class SingletonThread {
	 private static final ThreadLocal perThreadInstance = new ThreadLocal();
	 private static SingletonThread singleton ;
	 private SingletonThread() {}
	 
	 public static SingletonThread  getInstance() {
	  if (perThreadInstance.get() == null){
	   // 每个线程第一次都会调用
	   createInstance();
	  }
	  return singleton;
	 }

	 private static  final void createInstance() {
	  synchronized (SingletonThread.class) {
	   if (singleton == null){
	    singleton = new SingletonThread();
	   }
	  }
	  perThreadInstance.set(perThreadInstance);
	 }
	}
