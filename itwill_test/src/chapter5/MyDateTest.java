package chapter5;

class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isValid() {
		if ((this.day > 0 && this.day < 32) && (this.month > 0 && this.day < 13) && (this.day > 0 && this.day < 32) && (this.year > 0)) {
			System.out.println("유효한 날짜 입니다.");
			return true;
		} else {
			System.out.println("유효하지 않은 날짜입니다.");
			return false;
		}
	}

}

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate data1 = new MyDate(30, 2, 2000);
		System.out.println(data1.isValid());
		MyDate data2 = new MyDate(2, 10, 2006);
		System.out.println(data2.isValid());

	}

}
