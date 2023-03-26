package _object;

class Calculator {
	
	int left, right, sum, avg;
	String name;
	
	public void setOparands(int left, int right, String name)
	{
		this.left = left;
		this.right = right; 
		this.name = name;
	}
	
	public void sum() {
		this.sum = this.left + this.right;
	}
	
	public void avg() {
		this.avg = (this.left + this.right)/2;
	}
	
	public void print() {
		System.out.println(this.name + "의 합은 :" + this.sum + "의 평균은 :" + this.avg + "입니다.");
	}
}

public class object {

	public static void main(String[] args) {
			
		Calculator c1 = new Calculator();
		
		c1.setOparands(20, 40, "나는 C1");
		c1.sum();
		c1.avg();
		c1.print();
		
		Calculator c2 = new Calculator();
		
		c2.setOparands(30, 60, "나는 C2");
		c2.sum();
		c2.avg();
		c2.print();
		
	}

}
