package game;

import java.util.Scanner;

public class Player {
	Scanner scan = new Scanner(System.in);
	
	String id;
	String password;
	String[] ids = new String[3];
	String[] passwords = new String[3];
	
	int i = 0;
	
	public void run() {
		System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료"); // 3. 종료항목  추가
		System.out.print(">>");
		int choiceNum = scan.nextInt();
		scan.nextLine();
		if(choiceNum == 1) {
			login();
		}
		
		else if(choiceNum == 2) {
			join();
		}
		
		else if (choiceNum == 3) { // 3. 종료
			exit();
		}
		
		else {
			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		}
	}
	
	public void join() {
		System.out.println("[회원가입]");
		System.out.print("아이디:");
		String joinId = scan.nextLine();
		ids[i] = joinId;
		
		System.out.print("비밀번호:");
		String joinPwd = scan.nextLine();
		passwords[i] = joinPwd;
		
		//i++;  
		System.out.println("회원가입에 성공하였습니다.");
		run();
	}
	
	public void login() {
		while(true) {
			System.out.println("[로그인]");
			System.out.print("아이디>>");
			String loginId = scan.nextLine();
			
			boolean flag1 = false;
			for(int i=0; i<ids.length; i++) {
				if(loginId.equals(ids[i])) {
					flag1 = true;
					break;
				}
			}
			if(!flag1) {
				System.out.println("ID가 존재하지 않습니다.");
				run();
				break;
			}
			
			System.out.print("비밀번호>>");
			String loginPwd = scan.nextLine();
			
			boolean flag2 = false;
			for(int i=0; i<ids.length; i++) {
				if(loginPwd.equals(passwords[i])) {
					flag2 = true;
					break;
				}
			}
			if(!flag2) {
				System.out.println("패스워드가 일치하지 않습니다.");
				run();
				break;
			}
			System.out.println("로그인에 성공하였습니다.");
			break;
		}
		//로그인에 성공하면 여기서 호출
	}
	
	public void exit() { // 3. 종료 
		System.out.println("종료하겠습니다");
	}
}