package br.com.albert.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.albert.model.First;

@RestController
public class FistController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/first")
	public First first (@RequestParam(value = "name", defaultValue = "World") String name) {
		return new First(counter.incrementAndGet(), String.format(template, name));
		
	}

}
