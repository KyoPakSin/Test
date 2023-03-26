package _arrTest;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int [100];
		int i , count = 0;
		
		for(i=0;i<100;i++)
		{
			arr[i]= sc.nextInt();
			count++;
			
			if(arr[i]==0)
			{
				break;
			}
		}
		
		int max=0;
		int min=arr[0];
		int minidx=0; //제일 작은 값의 인덱스 알기
		
		for(i=0;i<count;i++) //모든 배열 검토
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min&&arr[i]!=0)
			{
				min=arr[i];
				minidx=i; //제일 작은 값의 인덱스 찾은 후 저장 
			}
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("배열 중 제일 큰 값은 :" + max + " 입니다.");
		System.out.println("배열 중 제일 작은 값은 :" + min + " 입니다.");
		System.out.println("배열 중 제일 작은 값의 위치는 :" + minidx+1 + " 입니다.");
	}
}
