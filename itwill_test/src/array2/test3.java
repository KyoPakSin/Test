package array2;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("학생 수를 입력하세요 :");
		
		int subject = 3; //총점 포함
		int count = sc.nextInt();
		
		String[] name = new String[count];
		int [][] score = new int[count][subject];
		float [] avg = new float[count];
		
		System.out.println("이름 , 과목을 차례로 입력하세요.");
		
		for(int i=0;i<count;i++)
		{
			System.out.println("==========================");
			System.out.print(i+1 + "번째 학생 이름 : ");
			name[i]=sc.next();
			for(int j=0;j<subject;j++)
			{
				System.out.print(j+1 + "번째 과목 점수 : ");
				score[i][j]=sc.nextInt(); // 과목순서로 입력받기
				score[i][subject-1]+=score[i][j]; //3번째 배열행에 총점 누적
			}
		}
		
		for(int i=0;i<count;i++)
		{
			System.out.println("이름 : " + name[i]);
			for(int j=0;j<3;j++)
			{
				System.out.println(score[i][j]);
			}
		}
		
		
	}

}
