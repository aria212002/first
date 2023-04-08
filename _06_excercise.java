package TEST;

import java.util.Scanner;

public class _06_excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		boolean run=true;
		int score=0;
		int n=0;
		String[][] sol=null;
		
		while(run) {
			System.out.println("================================================");
			System.out.println("1. 문제수 2. 문제출제 3. 문제풀기 4. 점수분석 5. 종료 ");
			System.out.println("================================================");
			System.out.print("메뉴 선택 : ");
			int menu=sc.nextInt();
			switch(menu) {
			case 1 :
				System.out.print("문제 수 입력 : ");
				n=sc.nextInt();
				break;
			case 2 :
				sol=new String[n][3];
				for(int i=0;i<sol.length;i++) {
					System.out.println((i+1)+"번째 문제 입력 : ");
					sol[i][0]=sc.next();
					System.out.println((i+1)+"번째 정답 입력 : ");
					sol[i][1]=sc.next();
					sc.nextLine().trim();
					System.out.println((i+1)+"번째 예문 입력 : ");
					sol[i][2]=sc.nextLine();
				}
				break;
			case 3 :
				score=0;
				for(int i=0;i<sol.length;i++) {
					System.out.println((i+1)+"번째 문제  : "+sol[i][0]);
					String answer=sc.next();
					if(answer.equals(sol[i][1])) {
						System.out.println("정답입니다.");
						score++;
					}
					else {
						System.out.println("오답입니다. 정답은 "+sol[i][1]);
					}
					System.out.println("예문은 "+sol[i][2]);

				}
				
				break;
			case 4 :
				System.out.println(n+"개 문제 중 "+ score+"개 맞췄습니다");
				System.out.println("정답율은"+score*100/n+"%입니다");
				break;	
			case 5 :
				System.out.println("이용해 주셔서 감사합니다");
				run=false;
				break;	
			default :
				System.out.println("다시 입력하세요");
				break;
			}
			System.out.println();
		
		}
	}
}
