package com.callor.score.service.Impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.Values;

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

		for (int i = 0; i < 20; i++) {
			Integer num = rnd.nextInt(100) + 1;

			ScoreVO scoreVO = new ScoreVO();

			scoreVO.setNum(i + 1);

			scoreVO.setKor(num);

			num = rnd.nextInt(100) + 1;
			scoreVO.setEng(num);
			num = rnd.nextInt(100) + 1;
			scoreVO.setMath(num);
			num = rnd.nextInt(100) + 1;
			scoreVO.setMusic(num);
			num = rnd.nextInt(100) + 1;

			scoreVO.setHistory(num);

			// 총점

			int sum = scoreVO.getKor() + scoreVO.getEng() + scoreVO.getMath() + scoreVO.getMusic()
					+ scoreVO.getHistory();
			scoreVO.setTotal(sum);

			// 평균
			float avgg = (float) sum / 5;
			scoreVO.setAvg(avgg);

			scoreList.add(scoreVO);

			System.out.println((i + 1) + "번 순번점수생성했음");
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
				ScoreVO scoreVO = scoreList.get(i);
				printer.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%3.1f\n", scoreVO.getNum(), scoreVO.getKor(),
						scoreVO.getEng(), scoreVO.getMath(), scoreVO.getMusic(), scoreVO.getHistory(),
						scoreVO.getTotal(), scoreVO.getAvg());

			}
			printer.close();
			fileWriter.close();
			System.out.println("파일 저장 완료");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void loadScoreFromFile() {

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {

			fileReader = new FileReader(fileName);

			buffer = new BufferedReader(fileReader);
			while (true) {
				String str = buffer.readLine(); // nextLine()
				if (str == null) {
					break;
				}
				String scores[] = str.split(" ");

				ScoreVO vo = new ScoreVO();

				scoreList.add(vo);

			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		{
			System.out.println(Values.dLine);
			System.out.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
			System.out.println(Values.sLine);

			int nsize = scoreList.size();
			for (int i = 0; i < nsize; i++) {
				ScoreVO scoreVO = scoreList.get(i);
				System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\t%3.1f\n", scoreVO.getNum(), scoreVO.getKor(),
						scoreVO.getEng(), scoreVO.getMath(), scoreVO.getMusic(), scoreVO.getHistory(),
						scoreVO.getTotal(), scoreVO.getAvg());

			}
			System.out.println(Values.sLine);
		}
	}

	@Override
	public void inputScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printScore() {
		// TODO Auto-generated method stub

	}

}
