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
		System.out.println("1. �α��� | 2. ȸ������ | 3. ����"); // 3. �����׸�  �߰�
		System.out.print(">>");
		int choiceNum = scan.nextInt();
		scan.nextLine();
		if(choiceNum == 1) {
			login();
		}
		
		else if(choiceNum == 2) {
			join();
		}
		
		else if (choiceNum == 3) { // 3. ����
			exit();
		}
		
		else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		}
	}
	
	public void join() {
		System.out.println("[ȸ������]");
		System.out.print("���̵�:");
		String joinId = scan.nextLine();
		ids[i] = joinId;
		
		System.out.print("��й�ȣ:");
		String joinPwd = scan.nextLine();
		passwords[i] = joinPwd;
		
		//i++;  
		System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
		run();
	}
	
	public void login() {
		while(true) {
			System.out.println("[�α���]");
			System.out.print("���̵�>>");
			String loginId = scan.nextLine();
			
			boolean flag1 = false;
			for(int i=0; i<ids.length; i++) {
				if(loginId.equals(ids[i])) {
					flag1 = true;
					break;
				}
			}
			if(!flag1) {
				System.out.println("ID�� �������� �ʽ��ϴ�.");
				run();
				break;
			}
			
			System.out.print("��й�ȣ>>");
			String loginPwd = scan.nextLine();
			
			boolean flag2 = false;
			for(int i=0; i<ids.length; i++) {
				if(loginPwd.equals(passwords[i])) {
					flag2 = true;
					break;
				}
			}
			if(!flag2) {
				System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
				run();
				break;
			}
			System.out.println("�α��ο� �����Ͽ����ϴ�.");
			break;
		}
		//�α��ο� �����ϸ� ���⼭ ȣ��
	}
	
	public void exit() { // 3. ���� 
		System.out.println("�����ϰڽ��ϴ�");
	}
}