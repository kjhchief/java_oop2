package ezen.oop2;

public class Course {

	// 모든 사람 등록 가능
	public void addPerson(Applicant<?> applicant) {
		System.out.println(applicant.getKind().toString());
	}

	// 학생만 등록 가능
	public void addStudent(Applicant<? extends Student2> applicant) {
		System.out.println(applicant.getKind().toString());
	}

	// 직장인과 일반인만 등록 가능
	public void addWorker(Applicant<? super Worker> applicant) {
		System.out.println(applicant.getKind().toString());
	}
	
	public static void main(String[] args) {
		Course course = new Course();
		
		Applicant<Student2> applicant = new Applicant<>();
		applicant.setKind(new Student2());
		course.addPerson(applicant);
		
		Applicant<HighStudent> applicant2 = new Applicant<>();
		applicant2.setKind(new HighStudent());
		course.addStudent(applicant2);
		
		Applicant<Worker> applicant3 = new Applicant<>();
		applicant3.setKind(new Worker());
		course.addWorker(applicant3);
	}

}
