package com.basic.bai3;

import java.text.DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MainScreen {
	public static void main(String[] args) throws ParseException {
		String fullName = "";
		String address = "";
		String dob = "";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String gender = "";
		float finalGrade = 0.0f;
		char lt = 'Y';

		int count = 1;

		ArrayList<Student> st = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.println("Studen " + count);
				System.out.println("Nhập họ tên đầy đủ: ");
				fullName = scanner.nextLine();
				System.out.println("Nhập địa chỉ: ");
				address = scanner.nextLine();
				System.out.println("Nhập ngày tháng năm sinh: ");
				dob = scanner.nextLine();
				LocalDate date = LocalDate.parse(dob, formatter);
				System.out.println("Nhập giới tính: ");
				gender = scanner.nextLine();
				System.out.println("Nhập điểm tổng kết: ");
				finalGrade = Float.parseFloat(scanner.nextLine());
				if(0.0<finalGrade && finalGrade>10.0) {
					throw new ArithmeticException();
				}
				Student hs = new Student(fullName, address, dob, gender, finalGrade);
				st.add(hs);
				System.out.println("Do you want to continue(Y/N)? ");
				lt = scanner.next().charAt(0);
				;
				scanner.nextLine();
				if (lt == 'N') {
					System.out.println("Dừng nhập thông tin học sinh");
				}
				if (lt == 'Y') {
					count += 1;
				}
			} catch (DateTimeException e) {
				System.out.println("dữ liệu ngày thàng không hợp lệ");

			} catch (ArithmeticException e) {
				System.out.println("điểm nhập không hợp lệ");
			}

			finally {
				System.out.println("Chúc mừng tiếp tục thực hiện thao tác  tiếp theo, nếu sai vui lòng nhập lại");
			}

		} while (lt == 'Y');
		// in ra danh sách học sinh theo định dạng
		for (int i = 0; i < st.size(); i++) {
			System.out.println("Studen " + (i + 1) + ":");
			System.out.println("FullName: " + st.get(i).getFullName());
			System.out.println("Address: " + st.get(i).getAddress());
			System.out.println("DOB: " + st.get(i).getDob());
			System.out.println("Gender: " + st.get(i).getGender());
			System.out.println("FinalGrade: " + st.get(i).getFinalGrade());

		}
		// in danh sách học sinh theo anwh lực
		for (int i = 0; i < st.size(); i++) {
			if (finalGrade < 4.0) {
				System.out.println("Học sinh " + st.get(i).getFullName() + " học lực yếu");

			} else if (finalGrade >= 4.0 && finalGrade < 5.0) {
				System.out.println("Học sinh " + st.get(i).getFullName() + " học lực trung bình yếu");

			} else if (finalGrade >= 5.0 && finalGrade < 6.5) {
				System.out.println("Học sinh " + st.get(i).getFullName() + " học lực trung bình ");
			} else if (finalGrade >= 6.5 && finalGrade < 7.0) {
				System.out.println("Học sinh " + st.get(i).getFullName() + " học lực trung bình khá ");
			} else if (finalGrade >= 7.0 && finalGrade < 8.0) {
				System.out.println("Học sinh " + st.get(i).getFullName() + " học lực khá ");
			} else if (finalGrade > 8.0 && finalGrade < 8.5) {
				System.out.println("Học sinh " + st.get(i).getFullName() + " học lực trung bình khá giỏi ");
			} else if (finalGrade > 8.5 && finalGrade <= 10) {
				System.out.println("Học sinh " + st.get(i).getFullName() + " học lực giỏi ");
			} else {
				System.out.println("nhập điểm học sinh sai " + st.get(i).getFullName() + " mặc định từ 0 đến 10");
			}
		}
		// tính điểm tổng kết trung bình cửa danh sách học sinh( tổng điểm/số lượng)

		float total = 0;
		for (int i = 0; i < st.size(); i++) {
			total = total + st.get(i).getFinalGrade();
		}
		float average = total / st.size();
		System.out.println("Tổng điểm trung bình là: " + average);
	}

}
