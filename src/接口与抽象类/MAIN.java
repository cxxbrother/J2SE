package 接口与抽象类;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MAIN {

	public static void main(String[] args) {
		 Class<?> clazz1 = 接口.class;
		 Class<?> clazz2 = 抽象类.class;
		 Class<?> clazz3 = 继承与实现.class;
		 
	     printModif(clazz1);
	     printModif(clazz2);
	     printModif(clazz3);
	}

	private static void printModif(Class<?> clazz) {
		   Field[] fields = clazz.getDeclaredFields();
	       Method[] methods=clazz.getMethods();
	       System.out.println("\n "+clazz.getName());
	       
	       for(Field field : fields)
	       {

	        System.out.print(field.getName() +"->");

	        System.out.println(Modifier.toString(field.getModifiers()));
	        
	       }
	       for(Method method : methods)

	       {

	        System.out.print(method.getName() +"->");

	        System.out.println(Modifier.toString(method.getModifiers()));
	        
	       }
	}

}
