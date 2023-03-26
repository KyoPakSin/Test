package array2;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		int [][]arr = {}; //배열 초기화
		Scanner sc = new Scanner(System.in);  
		System.out.print("배열의 행 크기를 입력하세요 :");
		int num = sc.nextInt(); 
		System.out.print("배열의 열 배열 크기를 입력하세요 :");
		int num2 = sc.nextInt(); 
		int arraySum = 0;
		boolean isStart = true;
		
		while(isStart) 
		{
			System.out.println("1. 배열 내용 넣기" + "    " + "2.배열 내용 출력" + "    " + "3.배열의 합산" + "    " + "4.종료");
			int mode=sc.nextInt();
			switch(mode) {
				case 1:
					arr= makeArray(num, num2 , sc); //배열 선언 함수
					break;
				case 2:
					arraySum = printArray(arr, num, num2 , arraySum);//배열 출력 함수
					break;
				case 3:
					System.out.println("배열의 총 합은 :" + arraySum + "입니다");
					break;
				case 4:
					System.out.println("!!!!!시스템을 종료합니다!!!!!");
					isStart=false;
					break;
				default:
					System.out.println("1~4까지의 숫자를 다시 입력해주세요 ! ");
					break;
			}
		}
	}
	
	public static int printArray(int[][] arr , int num, int num2, int arraySum) 
	{
			
			System.out.println("=====배열을 출력하는 모드입니다=====");
			
			for(int i=0; i<num; i++)
			{
				for(int j=0; j<num2; j++)
				{	
					arraySum+=arr[i][j];
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("");
			return arraySum;
		}
	
		public static int[][] makeArray(int num, int num2, Scanner sc) 
		{
			
			System.out.println("=====배열을 만드는 모드입니다=====");
			int[][] _arr = new int[num][num2];
			
			for(int i=0; i<num; i++)
			{
				for(int j=0; j<num2; j++)
				{
					System.out.print(i +"행" + j +"열에 값을 입력하세요 : ");
					_arr[i][j]=sc.nextInt();
				}
			}
			System.out.println("");
			return _arr;
		}
}


