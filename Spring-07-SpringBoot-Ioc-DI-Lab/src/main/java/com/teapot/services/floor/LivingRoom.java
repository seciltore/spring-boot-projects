package com.teapot.services.floor;

import com.teapot.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;

import java.math.BigDecimal;

public class LivingRoom implements Floor {

    @Value("${width}")
    BigDecimal width;
    @Value("${length}")
    BigDecimal length;

    @Override
    public BigDecimal getArea() {
        return width.multiply(length);
    }
}
