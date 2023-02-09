package ezen.oop2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MyAnnotation {
	int count() default 0;
	String testBy();
	String[] testTools();
	TestType testType();
	DateTime testDate();
	
	
}
