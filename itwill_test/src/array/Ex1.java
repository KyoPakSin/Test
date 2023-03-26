package array;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int [] arrtest;
		arrtest = new int [] {10,20,30};
		
		int [] arr = new int[5];
	
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("배열 arr의 주소 값 : " + arr);
		System.out.println("배열 arr의 크기 : " + arr.length);
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		for(int a :arr){
			System.out.println("포 이치 문 : " + a);
		}
		
		
	}
}
