package com.callor.student;

import java.util.Random;

public class Exam {// 10부터 100까지 임의 수 중에서 100개를 뽑아서..
	// 소수(자기 수의 -1 수까지 나눴을때 나머지가 0이 아닌것... 자기자신의 수가 안나올때)를 보여줘라.

	public static void main(String[] args) {

		int[] num = new int[100];
		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			num[i] = rnd.nextInt(91) + 10;

			int index = 0;
			for (index = 2; index < num[i]; index++) {

				if (num[i] % index == 0) {
					break;

				}
			}
			if (index < num[i]) {
			} else {
				System.out.println("소수:" + num[i]);

			}

		}

	}
}
