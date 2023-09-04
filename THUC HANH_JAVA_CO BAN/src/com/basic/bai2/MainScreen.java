package com.basic.bai2;

import java.util.Scanner;

public class MainScreen {
	public static void main(String[] args) {
		int N;
		int sum1 = 0;
		int sum2 = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số nguyên N bất kỳ: ");
		N = Integer.parseInt(scanner.nextLine());
		try {
			if (N <= 0) {
				throw new ArithmeticException();
			}
			for (int i = 1; i <= N; i++) {
				if (i % 2 == 0) {
					sum1 += i;
				} else {
					sum2 += i;
				}

			}
			System.out.println("Tổng các số chẵn từ 0 " + N + " = " + sum1);
			System.out.println("Tổng các số kẻ tử 0 " + N + " = " + sum2);

			for (int i = 0; i <= N; i++) {
				if (i % 3 == 0 && i % 2 != 0) {
					count += 1;
				}
			}
			System.out.println("Tổng các số chia hết cho 3 nhưng không chia hết cho 2 từ 0 đến " + N + " = " + count);
		} catch (ArithmeticException e) {
			System.out.println("Dữ liệu không phù hợp. Xin hãy nhập lại!");

		}
		finally {
			System.out.println("Have a nice day!");
		}
	}
}
