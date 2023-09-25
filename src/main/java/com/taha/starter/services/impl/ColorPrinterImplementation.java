package com.taha.starter.services.impl;

import com.taha.starter.services.BluePrinter;
import com.taha.starter.services.ColorPrinter;
import com.taha.starter.services.GreenPrinter;
import com.taha.starter.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImplementation implements ColorPrinter {
    //These are our three dependencies
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorPrinterImplementation(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join(", ",redPrinter.print(),bluePrinter.print(), greenPrinter.print());
    }
}
