package com.example.demo.calculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.calculator.service.CalculatorService;

@Controller
public class CalculatorController {
	// 初回表示（フォーム）
    @GetMapping("/calculator") // GetMappingを記載するの忘れてたので注意!!
    public String showCalculator() {
        return "calculator"; // calculator.html を表示
    }
	
    // 計算処理
	@PostMapping("/CalculatorService") // POSTリクエストが/CalculatorServiceというURLパスに送信されると、このメソッドが呼び出される
	public String calculate(@RequestParam("num1") int num1, // formに入力されたパラメータをint num1として受け取る
			@RequestParam("num2") int num2,
			@RequestParam("cal") String operator,
			Model model) { // 計算結果などをviewに渡すためのオブジェクト
        
		try { // エラーが発生する可能性がある処理
			int result = CalculatorService.calculate(num1, num2, operator); // CalculatorService.javaのcalculateメソッドを呼び出し(受け取ったパラメーターを計算してくれるメソッドへ渡している)
			model.addAttribute("result", result); // "result" はviewで使うための名前（キー）。resultはキーに対応する値（計算結果）です。
		} catch (ArithmeticException e) {
			model.addAttribute("error", e.getMessage());
		} catch (IllegalArgumentException e) {
			model.addAttribute("error", e.getMessage());
		}
		return "calculator";
	}
}
