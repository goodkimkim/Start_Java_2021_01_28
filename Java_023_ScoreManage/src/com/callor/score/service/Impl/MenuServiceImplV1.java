package com.callor.score.service.Impl;

import java.util.Scanner;


import com.callor.score.service.MenuService;
import com.callor.score.service.Values;


public class MenuServiceImplV1 implements MenuService {
	
	
	private final Scanner scan;
	
	public MenuServiceImplV1() {
		
		scan = new Scanner(System.in);
	}
	
	@Override
	public Integer selectMenu() {
		
		while(true) {
			System.out.println(Values.dLine);
			System.out.println("빛나라 성적처리 시스템");
			System.out.println(Values.sLine);
			
			System.out.printf("%d. 학생성적 점수 생성\n",
					Values.MENU_SCORE);
			System.out.printf("%d. 학생성적 점수 파일에 저장\n",
					Values.MENU_SCORE_FILE_SAVE);
			System.out.printf("%d. 성적 결과 확인\n",
					Values.MENU_PRINT);
		
			
			System.out.println("QUIT. 끝내기");
			System.out.println(Values.sLine);
			
			System.out.print("선택>> ");
			String strMenu = scan.nextLine();
			
			if(strMenu.equals("QUIT")) {
				return null;
			}
			
			Integer intMenu = null;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.printf("메뉴는 QUIT, "
						+ "%d ~ %d 까지만 가능",
						Values.MENU_START,
						Values.MENU_LAST);
				continue;
			}
			if(intMenu >= Values.MENU_START 
					&& intMenu <= Values.MENU_LAST) {
				return intMenu;
			} else {
				System.out.printf("업무는 "
						+ "%d ~ %d까지 중에서 선택",
						Values.MENU_START,
						Values.MENU_LAST);
			}
		}
	}
	
}


	
