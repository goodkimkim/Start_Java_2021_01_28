package com.callor.score;

import com.callor.score.Impl.ScoreServiceImplV1;
import com.callor.score.service.ScoreService;

public class ScoreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreService stService=new ScoreServiceImplV1();
		stService.scankeyInput();
		stService.fileSave();
		stService.scorePrint();
		
	
	}

}
