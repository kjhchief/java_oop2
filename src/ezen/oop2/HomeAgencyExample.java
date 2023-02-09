package ezen.oop2;

public class HomeAgencyExample {

	public static void main(String[] args) {
		HomeAgency agency = new HomeAgency();
		Tvv tv = agency.rent();
		tv.turnon();
	}

}
