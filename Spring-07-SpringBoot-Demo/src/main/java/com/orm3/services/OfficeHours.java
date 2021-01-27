package com.orm3.services;

import com.orm3.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {

    @Override
    public int getHour() {
        return 2;
    }
}
