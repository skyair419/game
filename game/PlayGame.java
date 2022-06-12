package game;

import java.util.Scanner;

public class PlayGame extends Player {
	Player p = new Player();
	Scanner scan = new Scanner(System.in);
	
	// 로그인 후 게임 선택 화면
	public void runGame() {
		System.out.println("1. 구구단 | 2. 가위바위보 | 3. 돌아가기 ");
		System.out.print(">>");
		int choiceNum = scan.nextInt();
		scan.nextLine();
		if(choiceNum == 1) {
			GooGooDan();
		}
		else if(choiceNum == 2) {
			RockSissorPaper();
		}
		else if (choiceNum == 3) { // 초기화면으로 돌아가기
			p.run();
		}
		else {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
	}
	
	// 구구단 게임
	public void GooGooDan() {
		int score = 0;
		
		while(true) {
			int r1 = (int)(Math.random()*9)+1;
			int r2 = (int)(Math.random()*9)+1;
			
			System.out.print("QUIZ : " + r1 + " * " + r2 + " = ");
			int anw = scan.nextInt();
			
			if(anw == (r1*r2)) {
				System.out.println("정답입니다.");
				score += 10;
				System.out.println("현재 점수: " + score);
				System.out.println();
			} else {
				System.out.println("오답입니다.");
				score -= 10;
				System.out.println("현재 점수: " + score);
				System.out.println();
			}
			
			if(score == 30) {
				System.out.println("현재 스코어는 " + score + "점 입니다.");
				System.out.println("게임을 종료합니다.");
				System.out.println();
				break;
			}
		}
		runGameRe();
	}
	
	// 가위바위보 게임
	public void RockSissorPaper(){
		
		String arr[] = {"가위","바위","보"};
		
		int match = 0;
		int score = 0;

		while(true) {
			int computer = (int)(Math.random()*3);
			System.out.print("어떤것을 내시겠습니까?");
			String user = scan.nextLine();
			System.out.println("유저 : " + user);
			System.out.println("컴퓨터 : " + arr[computer]);
			
			if(user.equals("가위")) {
				match++;
				if(arr[computer].equals("가위")) {
					System.out.println("결과  : 무승부");
				}else if(arr[computer].equals("바위")){
					System.out.println("결과 : 졋음");
					score--;
				}else {
					System.out.println("결과 :이김");
					score++;
				}
				System.out.println();
			} 
			
			if(user.equals("바위")) {
				match++;
				if(arr[computer].equals("바위")) {
					System.out.println("결과 : 무승부");
				}else if(arr[computer].equals("보")){
					System.out.println("결과 : 졋음");
					score--;
				}else {
					System.out.println("결과 : 이김");
					score++;
				}
				System.out.println();
			}
			
			if(user.equals("보")) {
				match++;
				if(arr[computer].equals("보")) {
					System.out.println("결과 : 무승부");
				}else if(arr[computer].equals("결과 : 가위")){
					System.out.println("결과 : 졋음");
					score--;
				}else {
					System.out.println("결과 : 이김");
					score++;
				}
				System.out.println();
			}
			
			if(match==3 && score>0) {
				System.out.println("게임에서 승리하셨습니다");
				System.out.println();
				break;
			} 
			else if (match==3 && score<0 ) {
				System.out.println("게임에서 패배하셨습니다");
				System.out.println();
				break;
			} 
		}
		runGameRe2();
	}
	
	// 구구단 게임 - 다시시작 선택
	public void runGameRe(){
		System.out.println("이 게임을 다시 하시겠습니까?");
		System.out.println("1. 예 || 2. 아니오 ");
		System.out.print(">>");
		int choiceNum = scan.nextInt();
		
		if(choiceNum == 1) {
			System.out.println();
			GooGooDan();
		} 
		else if (choiceNum == 2) {
			System.out.println();
			runGameBack();
		} 
		else {
			System.out.println();
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
	
	}
	
	// 가위바위보게임 - 다시시작 선택 
	public void runGameRe2(){
		System.out.println("이 게임을 다시 하시겠습니까?");
		System.out.println("1. 예 || 2. 아니오 ");
		System.out.print(">>");
		int choiceNum = scan.nextInt();
		
		if(choiceNum == 1) {
			System.out.println();
			RockSissorPaper();
		} 
		else if (choiceNum == 2) {
			System.out.println();
			runGameBack();
		} 
		else {
			System.out.println();
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
	
	}
	
	// 다시시작 선택   - 아니오  
	public void runGameBack() {
		System.out.println("1. 다른게임 선택 | 2. 게임 종료 ");
		System.out.print(">>");
		int choiceNum = scan.nextInt();
		
		if(choiceNum == 1) {
			System.out.println();
			runGame();
		} 
		else if (choiceNum == 2) {
			System.out.println();
			back();
		} 
		else {
			System.out.println();
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
	}
	
	// 
	public void back() { 
		System.out.println("초기 화면으로 돌아갑니다");
	}
}
