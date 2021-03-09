package com.callor.score;

public class Sort_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "A";
		String strB = "B";
		// 같은가
		boolean byes = strA.equals(strB);
		System.out.println(byes);
		// 원본.compareto( 비교본)
		// 알파벳 순서에 따라 얼마나 거리가 떨어져있는가?

		System.out.println(strA.compareTo(strB));
		System.out.println(strB.compareTo(strA));

		// 원본<비교본==<0
		// 원본>비교본==>0
		System.out.println("A".compareTo("C"));

		System.out.println("A".compareTo("A"));

		System.out.println("A".compareTo("a"));// 아스키코드값의 비교라고 함.

		/*
		 * 문자열 크기(??)비교 문자열을 정렬하고자 할때는 비교를 해야하는데 일반적인 비교연산자(=<>)는 사용이 불가하다. 때문에 String
		 * 클래스에서 제공하는 method 를 활용하여 처리를 수행한다.
		 * 
		 * 같은가(==): euals() method 정렬을 위해 앞,뒤를 구분:compareto() method 문자열의 길이가 다르면 예측하기
		 * 어려운 값이 출력된다. 문자열의 길이가 다른경우 문자열 값을 기준으로 정렬하는 것은 어려움이 있다.
		 */
		System.out.println("ABC".compareTo("A"));

		System.out.println("0001".compareTo("0020"));
		System.out.println("0020".compareTo("0001"));

	}

}
