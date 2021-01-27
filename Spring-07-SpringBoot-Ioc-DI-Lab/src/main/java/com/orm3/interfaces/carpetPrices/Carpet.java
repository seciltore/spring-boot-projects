package com.orm3.interfaces.carpetPrices;

import com.orm3.enums.City;

import java.math.BigDecimal;

public interface Carpet {
    BigDecimal getSqFtPrice(City city);
}
