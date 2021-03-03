package ua.lviv.lgs;

import java.lang.reflect.Field;

public class Aplication {
	
	public static void main(String[] args) {
		
		getParams(Dog.class);
		
	}

	
	public static void getParams(Class<?> annotationClass) {
		
		Field[] fields = annotationClass.getDeclaredFields();
		
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if(field.getAnnotation(Description.class) instanceof Description) {
				System.out.print(field.getName() + " ---->  ");
				System.out.println(" annotaion value = " + field.getAnnotation(Description.class).params());
			}
		}
		
	}
}
