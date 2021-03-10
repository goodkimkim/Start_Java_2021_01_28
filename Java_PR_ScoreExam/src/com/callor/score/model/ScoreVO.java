package com.callor.score.model;

public class ScoreVO {

	private int stNum;

	private int kor;
	private int eng;
	private int math;
	private int music;

	private int sum;
	private float avg;
	
	
	
	
	
	
	public ScoreVO(int stNum, int kor, int eng, int math, int music, int sum, float avg) {
		super();
		this.stNum = stNum;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.music = music;
		this.sum = sum;
		this.avg = avg;
	}
	public ScoreVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getMusic() {
		return music;
	}
	public void setMusic(int music) {
		this.music = music;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "ScoreVO [stNum=" + stNum + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", music=" + music
				+ ", sum=" + sum + ", avg=" + avg + "]";
	}

	
}
