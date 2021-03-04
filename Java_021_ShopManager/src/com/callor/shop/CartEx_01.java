package com.callor.shop;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.CartServiceV1;
import com.callor.shop.service.impl.MenuServiceV1;

public class CartEx_01 {

	public static void main(String[] args) {
		MenuService mService = new MenuServiceV1();
		CartService cService = new CartServiceV1();
		while (true) {
			Integer menu = mService.selectMenu();
			if (menu == null) {
				break;
			} else if (menu == 1) {

				cService.inputCart();
				
			} else if(menu==2) {
				
				cService.printAllcart();
				
				
			}
			
			else if (menu == 3) {
				cService.printCart();
			}

		}

	}
}