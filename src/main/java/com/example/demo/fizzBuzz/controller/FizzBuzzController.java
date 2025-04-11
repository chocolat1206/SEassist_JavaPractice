package com.example.demo.fizzBuzz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzBuzz.service.FizzBuzzService;

@Controller
public class FizzBuzzController {

	@Autowired
	private FizzBuzzService FizzBuzzService;

	@GetMapping("/FizzBuzz")
	public String showFizzBuzz(Model model) {
		model.addAttribute("fizzBuzzList", FizzBuzzService.getFizzBuzzList());
		return "fizzBuzz";
	}
}
