package _arrTest;

import java.util.Scanner;

public class test1 {

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
		
		for(i=count;i>0;i--)
		{
			if(arr[i]!=0&&arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}
