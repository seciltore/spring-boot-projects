package com.teapot.interfaces.carpetPrices;

import com.teapot.enums.City;

import java.math.BigDecimal;

public interface Carpet {
    BigDecimal getSqFtPrice(City city);
}
