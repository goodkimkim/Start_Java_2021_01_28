package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV2 implements CartService {
	private List<CartVO> cartList;//cartList와 scan 인스턴스 객체변수를 선언 "만" 함.
	private Scanner scan;

	public CartServiceV2() {

		cartList = new ArrayList<CartVO>();//생성자 메서드에서 초기화를 분리해서 했음.메모리 관리때문에
		scan = new Scanner(System.in);
	}

	@Override
	public void inputCart() {
		
		System.out.println("구매자>>");

		String strUserName = scan.nextLine();
		System.out.println("상품명>>");
		String strProductName = scan.nextLine();

		int intQty = 0;

		while (true) {
			System.out.println("수량>>");

			String strQty = scan.nextLine();
			try {
				intQty = Integer.valueOf(strQty);//예외처리, 유효성검사를 통과해야 오류 없이 할수 있음.
				if (intQty < 1) {
					System.out.println("수량은 1이상으로 입력");
					// if(){continue}break; 이렇게 되고... else쓰게된다면 콘티뉴없어도 됨. //if(){}else{break;}
				} else {

					break;
				}
			} catch (Exception e) {
				System.out.println("수량은 숫자로만 입력");

			}

		}
		int intiprice = 0;

		while (true) {

			System.out.println("단가>>");

			String striprice = scan.nextLine();
			try {
				intiprice = Integer.valueOf(striprice);
				if (intiprice < 100) {
					System.out.println("단가는 100이상으로 입력");

				} else {

					break;
				}
			} catch (Exception e) {
				System.out.println("단가는 숫자로만 입력");

			}

		}

		int intSum = 0;
		intSum = intQty * intiprice;

		CartVO cartVO = new CartVO();//카트를 생성하고 데이터 저장
		
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProductName);
		cartVO.setQty(intQty);
		cartVO.setPrice(intiprice);
		cartVO.setTotal(intSum);// set으로 개별 값들을 저장...

		cartList.add(cartVO);// 개별값들을....리스트로..만들어줬다..

	}

	public void printAllcart() {

		
		int total = 0;
		int count = 0;

		System.out.println("* 전체 장바구니 리스트");
		System.out.println("===============================");
		System.out.println("구매자\t상품명\t수량\t단가\t합계");
		System.out.println("-----------------------------------");

		int nsize = cartList.size();
		for (int i = 0; i < nsize; i++) {
			System.out.printf("%s\t%s\t%d\t%d\t%d\n", cartList.get(i).getUserName(), cartList.get(i).getProductName(),
					cartList.get(i).getQty(), cartList.get(i).getPrice(), cartList.get(i).getTotal()); //get 으로 불러줬음.
			total += cartList.get(i).getTotal();
			count++;
		}

		System.out.println("---------------------------------------");
		System.out.println("합계\t" + count + "\t\t\t" + total);

	}

	@Override
	public void printCart() {
		int total = 0;
		int count = 0;
		int nSize = cartList.size();
		System.out.println("==========================");
		System.out.println("출력할 구매자 이름을 입력하세요");
		System.out.println("이름>>");
		String strUserName = scan.nextLine();
		for (int i = 0; i < nSize; i++) {
			if (strUserName.equals(cartList.get(i).getUserName())) {
				System.out.println("* "+strUserName+ " 장바구니 리스트");
				System.out.println("=====================================");
				System.out.println("구매자\t상품명\t수량\t단가\t합계");
				System.out.println("-------------------------------------");
				System.out.printf("%s\t%s\t%d\t%d\t%d\n", cartList.get(i).getUserName(),
						cartList.get(i).getProductName(), cartList.get(i).getQty(), cartList.get(i).getPrice(),
						cartList.get(i).getTotal());
				total += cartList.get(i).getTotal();
				count++;

			}

		}
		System.out.println("---------------------------------------");
		System.out.println("합계\t" + count + "\t\t\t"+ total);
		System.out.println("=======================================");
	}
}
