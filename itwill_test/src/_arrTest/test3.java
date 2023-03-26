package _arrTest;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr=new int [100];
		int count = 0; //배열 카운팅 변수
		int hitcount=0; //스왑 일어난 횟수 변수
		int temp; //스왑 변수
		
		for(int i=0;i<=5;i++)
		{
			arr[i]= sc.nextInt();
			count++;
			
			if(i==5)
			{
				break;
			}
		}
		
//		for(int i=0;i<count;i++) //모든 배열 검토 내림차순
//		{
//			for(int j=0;j<count-1;j++)
//			{
//				if(arr[j+1]>arr[j])
//				{
//					temp = arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
		
		for(int i=0;i<count;i++) //모든 배열 검토 오름차순
		{
			for(int j=0;j<count-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					hitcount+=1;
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0; i<count; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("배열 중 제일 큰 값은 :" + arr[count-1] + " 입니다.");
		System.out.println("배열 중 제일 작은 값은 :" + arr[0] + " 입니다.");
		System.out.println("스왑이 일어난 횟수는 :" + hitcount + " 입니다.");
	}
}
