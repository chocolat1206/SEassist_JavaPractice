package com.example.demo.calculator.service;

public class CalculatorService { // ユーザーが + を選ぶと、その値は "add" という文字列としてサーバーに送信される
	public static int calculate(int num1, int num2, String operator) {
		switch (operator) {
		case "add":
			return num1 + num2;
		case "sub":
			return num1 - num2;
		case "mul":
			return num1 * num2;
		case "div":
			if (num2 == 0) {
				throw new ArithmeticException("ゼロで割ることはできません。");
			}
			return num1 / num2;

		default:
			throw new IllegalArgumentException("無効な演算です。");
		}
	}
}
