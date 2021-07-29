package kiosk.controller;
import kiosk.controller.*;
import kiosk.vo.ticket;

import java.util.Scanner;

public class kioskMgr {

	public Scanner sc;
	ticketing Ticket = new ticketing();
	
	public kioskMgr() {
		sc = new Scanner(System.in);
	}


	public void main() {
		while (true) {
			System.out.println("\n============= 포인트 관리 프로그램v1 ===========\n");
			System.out.println("1. 카페 주문 ");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 가입 ");
			System.out.println("4. 티켓 예매 ");
			System.out.println("5. 종료");
			System.out.printf("선택 > ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				Order.orderMenu();
				break;
			case 2:
				Methods.printMember();
				break;
			case 3:
				Methods.signUP();
				break;
			case 4:
				Ticket.main();
				break;
			case 5:
				System.out.println("프로그램 종료 ~~ ");
				return;

			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}
}
