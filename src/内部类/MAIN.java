package 内部类;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MAIN {

	public static void main(String[] args) {
		Class<?> clazz2 = 成员内部类.class;
		 Class<?> clazz1 = 成员内部类.Inner.class;
		 
		 printModif(clazz2);
	     printModif(clazz1);
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
