package com.alwyncodebuffer.retailshop.services;

import com.alwyncodebuffer.retailshop.models.Bill;
import com.alwyncodebuffer.retailshop.models.User;

import java.math.BigDecimal;

public interface DiscountService {
    BigDecimal discountCalculation(User user, Bill bill);
}
