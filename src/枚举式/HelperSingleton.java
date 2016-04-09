package 枚举式;


/**
 * 好处：
 	   1、 自由序列化；
       2、 保证只有一个实例（即使使用反射机制也无法多次实例化一个枚举量）；
       3、 线程安全；
 * 
 */
public enum HelperSingleton {

    INSTANCE;

    private HelperSingleton(){

    }

    public Object[] buildObject(){
    	final Object[] obj=new Object[2];
    	obj[0]=new String("xxx");
    	obj[1]=new Integer(555);
    	return obj;
    }
    /**
     * 使用
     * @param args
     */
	public static void main(String[] args) {
		Object[] obj=HelperSingleton.INSTANCE.buildObject();
	}
}