package com.taha.starter;


import com.taha.starter.services.ColorPrinter;
import com.taha.starter.services.impl.ColorPrinterImplementation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;
@SpringBootApplication
@Log
public class StarterApplication implements CommandLineRunner {

	private ColorPrinter colorPrinter;

	public StarterApplication(ColorPrinter colorPrinter){
		this.colorPrinter = colorPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(StarterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(colorPrinter.print());
	}
}
