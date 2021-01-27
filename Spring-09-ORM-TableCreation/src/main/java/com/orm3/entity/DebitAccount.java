package com.orm3.entity;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class DebitAccount extends Account{

    private BigDecimal overDraftFee;
}
