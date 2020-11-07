package com.TeaPot.services;

import com.TeaPot.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;


public class MockInterviewHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 5;
    }
}
