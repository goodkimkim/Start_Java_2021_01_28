package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.Values;
import com.callor.score.service.Impl.MenuServiceImplV1;
import com.callor.score.service.Impl.ScoreServiceV1;



/*
 * Scoreservice를 테스트하는 코드 
 */
public class ScoreEX_01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//인터페이스를 통하여  serviceIMpl 와 클래스르 사용하는 코드들 간에 약속이 만들어진다.
		//이런 환경이 되면  method 가 달라서 발생하는 여러 구조적 오류를 최소화할수 있음. 만약 impl을 만들던 개발자가 코드르 
//		미완성하더라도  impl클래스를 사용하는 곳에서 오류가 발생하지 않고 다른 부분 코드를 작성할 수 있게 된다.
		
		MenuService ms1=new MenuServiceImplV1();
			
		ScoreService ss1=new ScoreServiceV1();
		
		
		while(true) {
			Integer menuItem = ms1.selectMenu();
			if(menuItem == null) { 
				break;
			} else if (menuItem == Values.MENU_SCORE) {
			 ss1.makeScore();
			
			} else if (menuItem == Values. MENU_SCORE_FILE_SAVE ) {
			
			ss1.saveScoreToFile();
			} else if (menuItem == Values.MENU_PRINT) {
		
			ss1.loadScoreFromFile();
			}
		}
		System.out.println("업무종료!!");
		
		
		
		
	}

	
	
}
