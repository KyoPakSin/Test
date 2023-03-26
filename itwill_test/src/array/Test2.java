package array;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 학생 수 카운트
		int temp = 0;
		double sum = 0;
	
		String name [] = new String[num];
		int score[] = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.println("학생 이름을 입력 하세요 : ");
			name[i] = sc.next();
			System.out.println("학생 점수를 입력 하세요 : ");
			score[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("!========학생 정보========!");
		
		for(int i=0;i<num;i++){ //학생 정보 입력 받기
			
			System.out.println(name[i]);
			System.out.println(score[i]);
		}
		
		System.out.println();
		System.out.println("!========정렬 시작========!");
		
		for(int i=0;i<num;i++) { //내림차순 정렬
			for(int j=0;j<num-1;j++){
				if(score[j]<score[j+1]){
					temp = score[j+1];
					score[j+1]=score[j];
					score[j]=temp;
				}
			}
		}
		
		for(int i=0;i<num;i++){ //합계 + 학생 정보 내림차순 정렬 후 다시 출력
			sum += score[i];
			System.out.print("점수 : " + score[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("!========종합 성적========!");
		System.out.println("총   점 : " + sum);
		System.out.println("최고값은 : " + score[0]);
		System.out.println("최소값은 : " + score[num-1]);
		System.out.println("평균값은 : " + (sum/num));
	}

}
