package com.callor.score.service;

public class Values {

	public final static String dLine = "===============================";
	public final static String sLine = "-------------------------------";

	public final static Integer MENU_START = 1;
	public final static Integer MENU_LAST = 3;

	public final static Integer MENU_SCORE = 1;
	public final static Integer MENU_SCORE_FILE_SAVE = 2;
	public final static Integer MENU_PRINT = 3;

	// static final 변수 생성하기..
 public static final String ddLine;//public으로 해야함...private 안됨.
	static {
		ddLine = String.format("%050d", 0)// 생성자 불록에서 초기화시키자...
				.replace("0", "=");

	}
}
