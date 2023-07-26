package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	

	public void menu() {
		String kind; String name; String flavor; int numOf; int price;
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		kind = sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("맛 : ");
		flavor = sc.nextLine();
		System.out.print("개수 : ");
		numOf = sc.nextInt(); sc.nextLine();
		System.out.print("가격 : ");
		price = sc.nextInt(); sc.nextLine();

		System.out.println(scr.saveData(kind, name, flavor, numOf, price));
		
		System.out.println("저장한 정보를 확인하시겠습니까?(y/n) : ");
		String yn = sc.nextLine();
		
		if(yn.equals("y")) {
			System.out.println(scr.confirmData());	
		} else if(yn.equals("n")) {
			return;
		}
		
	}
	
}