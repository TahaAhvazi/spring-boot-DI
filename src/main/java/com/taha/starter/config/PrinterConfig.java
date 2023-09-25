package com.taha.starter.config;

import com.taha.starter.services.BluePrinter;
import com.taha.starter.services.ColorPrinter;
import com.taha.starter.services.GreenPrinter;
import com.taha.starter.services.RedPrinter;
import com.taha.starter.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter(){
        return new PersianbluePrinter();
    }
    @Bean
    public RedPrinter redPrinter(){
        return new PersianRedPrinter();
    }
    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        return new ColorPrinterImplementation(redPrinter, bluePrinter, greenPrinter);
    }
}
