package ezen.oop2;

public @interface DateTime {
	String yymmdd() default "2000.1.1";
	String hhmmss();
}
