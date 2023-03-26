package array2;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("행 배열 크기를 입력하세요 :");
		int num = sc.nextInt(); //수 카운트
		System.out.print("열 배열 크기를 입력하세요 :");
		int num2 = sc.nextInt(); //수 카운트
	
		
		int index;
		int[][] arr = new int[num][num2];
		
		for(int i=0; i<num; i++)
		{
			for(int j=0; j<num2; j++)
			{
				System.out.print(i +"행" + j +"열에 값을 입력하세요 : ");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("=====입력 종료=====");
		
		for(int i=0; i<num; i++)
		{
			for(int j=0; j<num2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
