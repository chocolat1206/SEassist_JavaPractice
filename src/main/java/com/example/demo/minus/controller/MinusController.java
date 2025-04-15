package com.example.demo.minus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.minus.service.MinusService;

@Controller
public class MinusController {
	// 初回表示（フォーム）
    @GetMapping("/minus") // GetMappingを記載するの忘れてたので注意!!
    public String showMinus() {
        return "minus"; // minus.html を表示
    }
	
    // 計算処理
	@PostMapping("/MinusService") // POSTリクエストが/MinusServiceというURLパスに送信されると、このメソッドが呼び出される
	public String minus(
			@RequestParam("num1") int num1, // formに入力されたパラメータをint num1として受け取る
			@RequestParam("num2") int num2,
			Model model) { // 計算結果などをviewに渡すためのオブジェクト
        
		try { // エラーが発生する可能性がある処理
			int result = MinusService.minus(num1, num2); // MInusService.javaのminusメソッドを呼び出し(受け取ったパラメーターを計算してくれるメソッドへ渡している)
			model.addAttribute("result", result); // "result" はviewで使うための名前（キー）。resultはキーに対応する値（計算結果）です。
		} catch (ArithmeticException | IllegalArgumentException e) {
		    model.addAttribute("error", e.getMessage());
		}
		return "minus";
		}
}
