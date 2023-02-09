package ezen.oop2;

@MyAnnotation(count = 5, testBy = "김재훈테스터", testDate = @DateTime(yymmdd = "2023.1.1", hhmmss = "122025"), testTools = {
		"jUnit4", "jUnit5" }, testType = TestType.FIRST)
public class MyAnnotationExample {

	public static void main(String[] args) {

	}

}
