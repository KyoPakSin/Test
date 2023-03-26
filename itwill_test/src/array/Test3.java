package array;

import java.util.Scanner;


public class Test3 {

	public static void main(String[] args) {
		
		
	

//		Scanner sc = new Scanner(System.in);
//		
//		int num = sc.nextInt(); //수 카운트
//		int score[] = new int[num];
//		//int numcount = 0;
//		//String nums[] = new String[num];
//		
//		for(int i=0;i<num;i++) {
//			System.out.println("숫자를 입력 하세요 : ");
//			score[i] = sc.nextInt();
//		}
//		
//		for(int i=0;i<num;i++){ //수 정보 입력 받기
//			
//			System.out.println(score[i]);
//		}
//		
//		System.out.println();
//		
//		for(int i=0;i<num;i++) {
//			for(int j=0;j<num;j++){
//				
//				if(j==i)
//				continue;
//				
//				if(score[i]<score[j]){
//					System.out.println(i+1 + "번째 : " + score[i] + " : "+ score[j]);
//					System.out.println("크다");
//				}
//				else if(score[i]>score[j]){
//					System.out.println(i+1 + "번째 : " + score[i] + " : "+ score[j]);
//					System.out.println("작다");
//				}
//				else
//				{
//					System.out.println(i+1 + "번째 : " + score[i] + " : "+ score[j]);
//					System.out.println("같다");
//				}
//			}
//		}
//		for(int i=0;i<num;i++){ //입력값 출력
//			System.out.print("입력된 값 : " + score[i] + " ");
//		}
		
		int index;
		int[] arr = {1,2,3,2,1};
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(method(arr,i));
		}
	}
	
	public static String method(int[] arr, int index) {
		int num = arr[index];
		String result = (index + 1) + ": ";
		for(int i=0; i<arr.length;i++)
		{
			if(i==0) continue;
			
			if(num>arr[i])		result += ">";
			else if(num<arr[i])	result += ">";
			else 				result += "=";
		}
		return result;
	}
}



