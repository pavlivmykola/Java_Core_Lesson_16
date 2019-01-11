package ua.lviv.lgs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class carClass = Car.class;
		
		System.out.println("Name of class = "+carClass.getName());
		System.out.println("Simple name of class = "+carClass.getSimpleName());
		System.out.println("Class modifier = "+Modifier.toString(carClass.getModifiers()));
		System.out.println("Package of current class = "+carClass.getPackage());
		System.out.println("Super class = "+carClass.getSuperclass());
		System.out.println();
		Constructor[] constructors = carClass.getConstructors();
		for (int i = 0; i < constructors.length; i++) {
			Constructor constructor = constructors[i];
			System.out.println("Constructor = "+constructor);
		}
		
		System.out.println();
		Field[] fields = carClass.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println("Field = "+field);
		}

		System.out.println();
		fields = carClass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println("Field = "+field);
		}
		
		
		System.out.println();
		Method[] methods = carClass.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println("Метод ="+method);
		}
		
		System.out.println();
		Constructor<Car> constructor = carClass.getConstructor(String.class,String.class);
		System.out.println("Constructor "+constructor);
		Car newInstance = constructor.newInstance("Megan","White");
		System.out.println(newInstance);
		
		
		
		
		// MAX
		
		Field fieldColor = carClass.getField("color");
		fieldColor.set(newInstance, "Black");
		System.out.println(newInstance);
		
		
		Method myMethod = carClass.getMethod("setWidth", int.class);
		myMethod.invoke(newInstance, 2000);
		System.out.println(newInstance);
		myMethod=carClass.getMethod("move", null);
		myMethod.invoke(newInstance, null);
		myMethod=carClass.getMethod("setLightOn", null);
		myMethod.invoke(newInstance, null);
		myMethod=carClass.getMethod("getWeight", null);
		System.out.println("Вага авто = "+myMethod.invoke(newInstance, null));
		
		
	}

}
