package com.taha.starter.services.impl;

import com.taha.starter.services.BluePrinter;
import org.springframework.stereotype.Service;

@Service
public class PersianbluePrinter implements BluePrinter {
    @Override
    public String print() {
        return "آبی";
    }
}
