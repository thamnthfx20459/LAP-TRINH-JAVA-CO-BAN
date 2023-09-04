package com.basic.bai1;

import java.util.Scanner;

public class MyMainClass {
	public static void main(String[] args) {
		double x, y;
		String action = "";
		boolean answer = true;
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Nhập số thứ nhất x = ");
			x = Double.parseDouble(scanner.nextLine());
			System.out.println("Nhập số thứ nhất y = ");
			y = Double.parseDouble(scanner.nextLine());
			System.out.println("Nhập lệnh ACTION = ");
			action = scanner.nextLine().trim().toUpperCase();

			switch (action) {
			case "CONG":
				System.out.println("Kết quả phép cộng là: " + CalculateUtils.Cong(x, y));
				answer = true;
				break;

			case "TRU":
				System.out.println("Kết quả: " + CalculateUtils.Tru(x, y));
				answer = true;
				break;

			case "NHAN":
				System.out.println("Kết quả: " + CalculateUtils.Nhan(x, y));
				answer = true;
				break;

			case "CHIA":
				if (y == 0) {
					throw new ArithmeticException();
				}
				System.out.println("Kết quả: " + CalculateUtils.Chia(x, y));
				answer = true;
				break;

			default:
				System.out.println("Giá trị ACTION không hợp lệ");
				break;

			}

		} catch (ArithmeticException e) {
			System.out.println("Dữ liệu không phù hợp. Xin hãy nhập lại!");
		}
	}
}
