package game;

import java.util.Scanner;

public class PlayGame extends Player {
	Player p = new Player();
	Scanner scan = new Scanner(System.in);
	
	// �α��� �� ���� ���� ȭ��
	public void runGame() {
		System.out.println("1. ������ | 2. ���������� | 3. ���ư��� ");
		System.out.print(">>");
		int choiceNum = scan.nextInt();
		scan.nextLine();
		if(choiceNum == 1) {
			GooGooDan();
		}
		else if(choiceNum == 2) {
			RockSissorPaper();
		}
		else if (choiceNum == 3) { // �ʱ�ȭ������ ���ư���
			p.run();
		}
		else {
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		}
	}
	
	// ������ ����
	public void GooGooDan() {
		int score = 0;
		
		while(true) {
			int r1 = (int)(Math.random()*9)+1;
			int r2 = (int)(Math.random()*9)+1;
			
			System.out.print("QUIZ : " + r1 + " * " + r2 + " = ");
			int anw = scan.nextInt();
			
			if(anw == (r1*r2)) {
				System.out.println("�����Դϴ�.");
				score += 10;
				System.out.println("���� ����: " + score);
				System.out.println();
			} else {
				System.out.println("�����Դϴ�.");
				score -= 10;
				System.out.println("���� ����: " + score);
				System.out.println();
			}
			
			if(score == 30) {
				System.out.println("���� ���ھ�� " + score + "�� �Դϴ�.");
				System.out.println("������ �����մϴ�.");
				System.out.println();
				break;
			}
		}
		runGameRe();
	}
	
	// ���������� ����
	public void RockSissorPaper(){
		
		String arr[] = {"����","����","��"};
		
		int match = 0;
		int score = 0;

		while(true) {
			int computer = (int)(Math.random()*3);
			System.out.print("����� ���ðڽ��ϱ�?");
			String user = scan.nextLine();
			System.out.println("���� : " + user);
			System.out.println("��ǻ�� : " + arr[computer]);
			
			if(user.equals("����")) {
				match++;
				if(arr[computer].equals("����")) {
					System.out.println("���  : ���º�");
				}else if(arr[computer].equals("����")){
					System.out.println("��� : ����");
					score--;
				}else {
					System.out.println("��� :�̱�");
					score++;
				}
				System.out.println();
			} 
			
			if(user.equals("����")) {
				match++;
				if(arr[computer].equals("����")) {
					System.out.println("��� : ���º�");
				}else if(arr[computer].equals("��")){
					System.out.println("��� : ����");
					score--;
				}else {
					System.out.println("��� : �̱�");
					score++;
				}
				System.out.println();
			}
			
			if(user.equals("��")) {
				match++;
				if(arr[computer].equals("��")) {
					System.out.println("��� : ���º�");
				}else if(arr[computer].equals("��� : ����")){
					System.out.println("��� : ����");
					score--;
				}else {
					System.out.println("��� : �̱�");
					score++;
				}
				System.out.println();
			}
			
			if(match==3 && score>0) {
				System.out.println("���ӿ��� �¸��ϼ̽��ϴ�");
				System.out.println();
				break;
			} 
			else if (match==3 && score<0 ) {
				System.out.println("���ӿ��� �й��ϼ̽��ϴ�");
				System.out.println();
				break;
			} 
		}
		runGameRe2();
	}
	
	// ������ ���� - �ٽý��� ����
	public void runGameRe(){
		System.out.println("�� ������ �ٽ� �Ͻðڽ��ϱ�?");
		System.out.println("1. �� || 2. �ƴϿ� ");
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
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		}
	
	}
	
	// �������������� - �ٽý��� ���� 
	public void runGameRe2(){
		System.out.println("�� ������ �ٽ� �Ͻðڽ��ϱ�?");
		System.out.println("1. �� || 2. �ƴϿ� ");
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
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		}
	
	}
	
	// �ٽý��� ����   - �ƴϿ�  
	public void runGameBack() {
		System.out.println("1. �ٸ����� ���� | 2. ���� ���� ");
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
			System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է����ּ���.");
		}
	}
	
	// 
	public void back() { 
		System.out.println("�ʱ� ȭ������ ���ư��ϴ�");
	}
}
