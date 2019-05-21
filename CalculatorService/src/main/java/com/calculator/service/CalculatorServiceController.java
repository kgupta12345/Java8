package com.calculator.service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorServiceController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to Calculator Service Application";
	}

	@RequestMapping(value = "/addition", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public void addition(@RequestBody Book book) {
		this.book = book;
		bookcase = new BookCase();
		bookcase.storeBooks(book);
	}
}
