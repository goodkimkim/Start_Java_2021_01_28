package com.callor.score.model;
/*
 *  성적처리를 위한 기본 데이트를 저장할
 * Value Object 클래스
 * DTO(data Transter object), DD(data define)
 * 
 * 학생의 정보:학번,학생이름
 * 5과목의 점수:국어,영어, 수학, 음악, 역사
 * 연산결과:총점, 평균, 석차
 */
public class ScoreVO {
	//1.변수 이름작명-------->2.변수타입 결정.--------------> 3. 정보은닉 설정(private)
	private String stNum;
	private String stName;
	
	private int num;
	private int kor;
	private int eng;
	private int math;
	private int music;
	private int history;
			
	private int total;
	private float avg;
	
	
	private int rank;
	
	//private으로 선언했기때문에 인스턴스변수에 접근할   getter,setter 만들기..(컨트롤+알트+s)---------->tostring만들고----->생성자 맨밑에 걸로. object체크 ...
	
	
	//기본생성자 정의(수퍼 지워도 됨). score =new () 호출되는 생성자 메서드
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ScoreVO(int num, int kor, int eng, int math, int music, int history) {//컨트롤 알트 s에서 맨 밑 위...
	//필드 생성자 정의.객체를 생성할때 변수값을 지정하면서 만들때 ScoreVo scoreVO=new ScoreVO(  학번, 국어점수, 영어점수, 수학점수, 음악점수, 역사 점수) 
	//	이때 호출되는 메서드임
		// TODO Auto-generated constructor stub
		super()	;
		
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.music = music;
		this.history = history;
	
	
		
	
	
	}
	
	
	public ScoreVO(int total) {
		super();
		int sum=this.kor;
		sum+=this.eng;
		sum+=this.math;
		sum+=this.music;
		sum+=this.history;
		
		total = sum;
		
		
		this.total = total;
	}
	


	public ScoreVO(float avg) {
		super();
		int sum=this.kor;
		sum+=this.eng;
		sum+=this.math;
		sum+=this.music;
		sum+=this.history;
		
		float avgg=(float)sum/5;
		avg=avgg;
		this.avg = avg;
		this.avg = avg;
	}


	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public int getHistory() {
		return history;
	}
	public void setHistory(int history) {
		this.history = history;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
	@Override
	
	
	// Object로 부터 상속받은 toString()method  재정의
	//VO객체에 데이터를 저장한후 잘 저장되어있는지 확인하기 위한  Debuging용  method 재정의
	
	public String toString() {
		return "ScoreVO [num=" + num + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", music=" + music
				+ ", history=" + history + ", total=" + total + ", avg=" + avg + "]";
	}
	
	
	
}
