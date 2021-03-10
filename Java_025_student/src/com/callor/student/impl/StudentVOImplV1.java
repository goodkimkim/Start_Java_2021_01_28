package com.callor.student.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.student.model.StudentVO;
import com.callor.student.service.StudentService;

public class StudentVOImplV1 implements StudentService {//이건 내가만든거고..선생님께서 수업시간때 해주신것이 Java_025A이다

	private List<StudentVO> student;
	String fileName = "src/com/callor/student/학생정보리스트.txt";

	public StudentVOImplV1() {// 생성자에 배열 선언.
		student = new ArrayList<StudentVO>();

	}

	public void LoadeFile() {
		String fileName = "src/com/callor/student/학생정보리스트.txt";// 읽어올 데이터 파일을 지정

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);
			while (true) {

				String reader = buffer.readLine();// 2번째꺼 하기.맽밑에꺼 아님. //읽은 값은 reader에 담겨있음.

				if (reader == null) {// 더이상 읽을값 없으면 멈추고.
					break;
				}
				String[] stu = reader.split(":"); // 학생정보리스트를 :로 구분해서 stu [] 배열에 담을 거다. 조각조각 나눠줘있음

				// 프린트할것에 필요한것만 모아둔 StudentVO 필드 생성자에다가 이 조각조각의 값을 저장하자.
				// 생성자 2개(빈거랑 매개변수포함) 안만들면 선언과초기화 이거 오류난다함.
				StudentVO studentVO = new StudentVO(stu[1], stu[2], Integer.valueOf(stu[3]), stu[4], stu[5], stu[6]);

				student.add(studentVO);// 조각조각을 저장할 필드생성자객체 studenVO.그리고 전체 배열객체에 저장했다.
			}
			buffer.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 없음");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 읽는 도중 문제발생");
			e.printStackTrace();
		}

	}

	@Override
	public void SearchNamePrint() {
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("=====================================================");
			System.out.println("찾는 학생이름을 입력하세요(종료하려면 QUIT를 입력)");
			System.out.println("----------------------------------------------------");
			System.out.println("이름>>");
			String name = scan.nextLine();

			if (name.equals("QUIT")) {
				System.out.println("종료되었습니다.");
				break;
			}

			for (StudentVO vo : student) {

				if (name.equals(null)) {
					System.out.println("*데이터가 없습니다*");
					System.out.println("===========================================");
					System.out.println(name + " 의  자료는 없습니다.");

				}

				if (name.equals(vo.getStrName())) {

					System.out.println("============================================");
					System.out.println("이름 :" + vo.getStrName());
					System.out.println("학과 :" + vo.getsDep());
					System.out.println("학년 :" + vo.getsGrade());
					System.out.println("반 :" + vo.getsClass());
					System.out.println("주소 :" + vo.getsAdd());
					System.out.println("전화번호 :" + vo.getsTel());

				}
			}

		}

	}

}
