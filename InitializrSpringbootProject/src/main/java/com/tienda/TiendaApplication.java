package com.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TiendaApplication {
        @GetMapping("Hola?")
        public String hello(){
            return "Buenos(as) dias/tardes/noches";
        }
	public static void main(String[] args) {
		SpringApplication.run(TiendaApplication.class, args);
                
	}

}
