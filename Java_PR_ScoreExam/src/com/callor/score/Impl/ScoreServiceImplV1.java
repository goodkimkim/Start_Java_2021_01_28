package com.callor.score.Impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;

public class ScoreServiceImplV1 implements ScoreService {

	private Scanner scan;
	private String scoreFile;
	private List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		// TODO Auto-generated constructor stub
		scan = new Scanner(System.in);
		scoreFile = "src/com/callor/score/data/Score.txt";
		scoreList = new ArrayList<ScoreVO>();
	}

	@Override
	public void scankeyInput() {// 키보드를 통해 다음 항목을 입력받는다..리스트로 저장한다.
		// TODO Auto-generated method stub

		String scoreFile = "src/com/callor/score/data/Score.txt";

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(scoreFile);
			printer = new PrintWriter(fileWriter);

			System.out.println("학번(숫자0001)을 숫자로 입력하세요");
			String str1Num = scan.nextLine();

			int intstNum = Integer.valueOf(str1Num);
			ScoreVO scVO = new ScoreVO();
			scVO.setStNum(intstNum);

			System.out.println("국어성적((0~100점)을 숫자로 입력하세요");
			String str1Kor = scan.nextLine();
			int intKor = Integer.valueOf(str1Kor);

			scVO.setKor(intKor);

			System.out.println("영어성적((0~100점)을 숫자로 입력하세요");
			String str1Eng = scan.nextLine();
			int intEng = Integer.valueOf(str1Eng);

			scVO.setEng(intEng);

			System.out.println("수학성적((0~100점)을 숫자로 입력하세요");
			String str1Math = scan.nextLine();
			int intMath = Integer.valueOf(str1Math);

			scVO.setMath(intMath);

			System.out.println("음악성적((0~100점)을 숫자로 입력하세요");
			String str1Music = scan.nextLine();
			int intMusic = Integer.valueOf(str1Music);

			scVO.setMusic(intMusic);

			int sum = scVO.getKor() + scVO.getEng() + scVO.getMath() + scVO.getMusic();

			scVO.setSum(sum);

//평균

			float avgg = (float) sum / 4;

			scVO.setAvg(avgg);

			scoreList.add(scVO);

		} catch (Exception e) {
			System.out.println("학번은 0001 형식으로 입력합니다.");
			System.out.println("과목점수는 0~100 으로 입력해주세요.");

			// TODO Auto-generated catch block

		}

		{

		}
		System.out.println("저장완료");

	}

	private void totalsum() {
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();

			vo.setSum(sum);
		}
	}

	private void totalavg() {
		for (ScoreVO vo : scoreList) {
			int sum = vo.getKor();
			sum += vo.getEng();
			sum += vo.getMath();
			sum += vo.getMusic();

			float avg = (float) sum / 4;

			vo.setAvg(avg);
		}
	}

	public void fileSave() {
		// TODO Auto-generated method stub
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(scoreFile);
			printer = new PrintWriter(fileWriter);

			int nsize = scoreList.size();
			for (int i = 0; i < nsize; i++) {

				printer.println();

			}

			printer.close();
			fileWriter.close();

		} catch (

		IOException e) {
			System.out.println("저정완료");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override

	public void scorePrint() {
		// TODO Auto-generated method stub

		System.out.println("==============================================");
		System.out.println("성적일람표");
		System.out.println("==============================================");
		System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");

		int nsize = scoreList.size();
		for (int i = 0; i < nsize; i++) {
			ScoreVO scVO = scoreList.get(i);
			System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%3.2f\n", scVO.getStNum(), scVO.getKor(), scVO.getEng(),
					scVO.getMath(), scVO.getMusic(), scVO.getSum(), scVO.getAvg());

			int intKtotal = scoreList.get(i).getSum();
			intKtotal++;

			float intAtotal = scoreList.get(i).getAvg();
			intAtotal++;

			System.out.println("---------------------------------------------------------------");
			System.out.println("총점:\t\t\t\t\t" + intKtotal);
			System.out.printf("평균:\t\t\t\t\t\t%3.2f\n", intAtotal);
			System.out.println("================================================================");

		}

	}
}