package br.com.albert.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.albert.util.MathUtil;

@RestController
public class MathController {

	private final AtomicLong counter = new AtomicLong();

	@GetMapping(value = "/sum/{numberOne}/{numberTwo}")
	public Double sum(
			@PathVariable("numberOne") String numberOne,
			@PathVariable("numberTwo") String numberTwo
			) throws Exception{
			
		return MathUtil.sum(numberOne, numberTwo);
	}

	@GetMapping(value = "/minus/{numOne}/{numTwo}")
	public double minus(
			@PathVariable("numOne") String numOne,
			@PathVariable("numTwo") String numTwo) throws Exception{
		return MathUtil.sub(numOne, numTwo);
	}
	
	@GetMapping(value = "/multiply/{numOne}/{numTwo}")
	public Double multiply(
			@PathVariable("numOne") String numOne,
			@PathVariable("numTwo") String numTwo) throws Exception{
		return MathUtil.multiply(numOne, numTwo);
	}
	
	@GetMapping(value = "divide/{numOne}/{numTwo}")
	public Double divide(
			@PathVariable("numOne") String numOne,
			@PathVariable("numTwo") String numTwo) throws Exception{
		return MathUtil.divide(numOne, numTwo);
	}
	
	@GetMapping(value = "average/{numOne}/{numTwo}")
	public double average(
			@PathVariable("numOne") String numOne,
			@PathVariable("numTwo") String numTwo) throws Exception{
		
		return MathUtil.average(numOne, numTwo)
				;
	}
	
	@GetMapping(value = "sqrt/{num}")
	public double sqrt(@PathVariable("num") String num) throws Exception{
		return MathUtil.sqrt(num);
	}
	

}
