package com.callor.student.model;

public class StudentVO {

	private String sNum;// 배열[0] 학번
	private String strName;// [1] 학생이름
	private String sDep;// [2]학과

	private int sGrade;// [3]학년

	private String sClass;// [4]반
	private String sAdd;// [5][주소]
	private String sTel;//[6] [전화번호]

	public StudentVO(String strName, String sDep, int sGrade, String sClass, String sAdd, String sTel) {
		super();
		this.strName = strName;
		this.sDep = sDep;
		this.sGrade = sGrade;
		this.sClass = sClass;
		this.sAdd = sAdd;
		this.sTel = sTel;
	}

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getsNum() {
		return sNum;
	}

	public void setsNum(String sNum) {
		this.sNum = sNum;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getsDep() {
		return sDep;
	}

	public void setsDep(String sDep) {
		this.sDep = sDep;
	}

	public int getsGrade() {
		return sGrade;
	}

	public void setsGrade(int sGrade) {
		this.sGrade = sGrade;
	}

	public String getsClass() {
		return sClass;
	}

	public void setsClass(String sClass) {
		this.sClass = sClass;
	}

	public String getsAdd() {
		return sAdd;
	}

	public void setsAdd(String sAdd) {
		this.sAdd = sAdd;
	}

	public String getsTel() {
		return sTel;
	}

	public void setsTel(String sTel) {
		this.sTel = sTel;
	}

	@Override
	public String toString() {
		return "StudentVO [sNum=" + sNum + ", strName=" + strName + ", sDep=" + sDep + ", sGrade=" + sGrade
				+ ", sClass=" + sClass + ", sAdd=" + sAdd + ", sTel=" + sTel + "]";
	}

}
