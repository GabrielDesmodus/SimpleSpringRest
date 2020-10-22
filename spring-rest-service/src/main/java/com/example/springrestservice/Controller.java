package com.example.springrestservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	public static final String template = "A cor do seu carro é: %s";
	public final AtomicLong counter = new AtomicLong();
	
	@GetMapping("/cordocarro")
	public Carro carro(@RequestParam(value="cor", defaultValue="cor não especificada!") String cor){
		return new Carro(counter.incrementAndGet(), String.format(template,cor));
	}
}
