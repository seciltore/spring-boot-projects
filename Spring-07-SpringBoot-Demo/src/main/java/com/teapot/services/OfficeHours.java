package com.teapot.services;

import com.teapot.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {

    @Override
    public int getHour() {
        return 2;
    }
}
