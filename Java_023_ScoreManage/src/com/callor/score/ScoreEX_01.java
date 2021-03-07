package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.Values;
import com.callor.score.service.Impl.MenuServiceImplV1;
import com.callor.score.service.Impl.ScoreServiceV1;

public class ScoreEX_01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
