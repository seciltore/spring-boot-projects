package com.TeaPot.services;

import com.TeaPot.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 8;
    }
}
