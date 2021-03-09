package com.callor.score.service;


/*
 *  (ScoreService 인터페이스)
 *  성적처리를 할때 가장많이 사용되는 클래스 정의
 *  주 업무 처리 클래스 정의
 *  1. 학생성적 입력,
 *  2. 학생 성적 파일에 저장
 *  3. 파일을 읽어서 성적 결과 출력
 *  4. Raddom클래스를 사용하여 가상의 점수를 만들자.
 *  
 * 
 */
public interface ScoreService {
	
	public void inputScore()								;
	
	
	public void makeScore();
	
	
	public void saveScoreToFile();
	
	
	
	public void loadScoreFromFile();//파일 읽기만 하는거임.
	
	public void printScore();
	
	
}
