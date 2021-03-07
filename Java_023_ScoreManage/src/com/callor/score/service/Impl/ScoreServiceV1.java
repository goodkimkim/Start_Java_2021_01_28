package com.callor.score.service.Impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.service.ScoreService;
import com.callor.score.service.ScoreVO;

public class ScoreServiceV1 implements ScoreService {

	private List<ScoreVO> scoreList;
	private String fileName;
	private Random rnd;

	public ScoreServiceV1() {
		// TODO Auto-generated constructor stub
		scoreList = new ArrayList<ScoreVO>();
		rnd = new Random();
		fileName = ("src/com/callor/score/score_rnd.txt");
	}

	@Override
	public void makeScore() {
		// TODO Auto-generated method stub
		rnd = new Random();
		for (int i = 0; i < 20; i++) {
			Integer num = rnd.nextInt(100) + 1;

			ScoreVO scoreVO = new ScoreVO();

			scoreVO.setNum(num + 1);
			scoreVO.setKor(num);
			scoreVO.setEng(num);
			scoreVO.setMath(num);
			scoreVO.setMusic(num);
			scoreVO.setHistory(num);

			scoreList.add(scoreVO);

			System.out.println("점수생성했음");

		}

	}

	@Override
	public void saveScoreToFile() {
		// TODO Auto-generated method stub
		String fileName = ("src/com/callor/score/score_rnd.txt");

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			int nsize = scoreList.size();
			for (int i = 0; i < nsize; i++) {
				System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n", scoreList.get(i).getNum(), scoreList.get(i).getKor(),
						scoreList.get(i).getEng(), scoreList.get(i).getMath(), scoreList.get(i).getMusic(),
						scoreList.get(i).getHistory());

				printer.close();
				fileWriter.close();
				System.out.println("파일 저장 완료");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void loadScoreFromFile() {

		// int total = 0;
		// int count = 0;
		/*
		 * System.out.println("* 전체 장바구니 리스트");
		 * System.out.println("===============================");
		 * System.out.println("구매자\t상품명\t수량\t단가\t합계");
		 * System.out.println("-----------------------------------");
		 * 
		 * int nsize = cartList.size(); for (int i = 0; i < nsize; i++) {
		 * System.out.printf("%s\t%s\t%d\t%d\t%d\n", cartList.get(i).getUserName(),
		 * cartList.get(i).getProductName(), cartList.get(i).getQty(),
		 * cartList.get(i).getPrice(), cartList.get(i).getTotal()); total +=
		 * cartList.get(i).getTotal(); count++; }
		 * 
		 * }
		 */}
}