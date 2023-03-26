package chapter6;

class Student {
	String studentID;
	int grade;
	int money;

	public Student(String studentID, int money) {
		this.studentID = studentID;
		this.money = money;
	}
	public void takeTaxi(Taxi taxi) {
		taxi.taxiIncome(10000);
		this.money -= 10000;
	}
	public void showStudentInfo() {
		System.out.println("학생이름 : " + studentID + "\n돈 : " + money);
	}
}

class Taxi {
	int taxiNum;
	int money;

	public Taxi(int taxiNum) {
		this.taxiNum = taxiNum;
	}

	public void taxiIncome(int money) {
		this.money += money;
	}

	public void showTaxiInfo() {
		System.out.println("택시이름 : " + taxiNum + "\n수입 :" + money);
	}

}

public class Test1 {

	public static void main(String[] args) {
		
		Student CEJstudent = new Student("CEJ", 30000);
		Taxi CEJtaxi = new Taxi(888);
		CEJstudent.takeTaxi(CEJtaxi);
		CEJstudent.showStudentInfo();
		CEJtaxi.showTaxiInfo();

	}

}
