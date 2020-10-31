package com.TeaPot.services;

import com.TeaPot.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {

    @Override
    public int getHours() {
        return 5;
    }
}
