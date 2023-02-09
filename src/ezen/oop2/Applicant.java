package ezen.oop2;

public class Applicant<T> {
	T kind;
	
	public Applicant() {}

	public Applicant(T kind) {
		this.kind = kind;
	}

	public T getKind() {
		return kind;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}
	
	
}
