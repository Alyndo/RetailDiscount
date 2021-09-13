package com.alwyncodebuffer.retailshop.services;

import com.alwyncodebuffer.retailshop.helper.DiscountHelper;
import com.alwyncodebuffer.retailshop.models.Bill;
import com.alwyncodebuffer.retailshop.models.ItemType;
import com.alwyncodebuffer.retailshop.models.User;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DiscountServiceImpl implements DiscountService{
    @Override
    public BigDecimal discountCalculation(User user, Bill bill) {

        DiscountHelper helper = new DiscountHelper();

        BigDecimal totalAmount = helper.calculateTotal(bill.getItems());
        BigDecimal groceryAmount = helper.calculateTotalPerType(bill.getItems(), ItemType.GROCERY);
        BigDecimal nonGroceryAmount = totalAmount.subtract(groceryAmount);
        BigDecimal userDiscount = helper.getUserDiscount(user);
        BigDecimal billsDiscount = helper.calculateBillsDiscount(totalAmount, new BigDecimal(100), new BigDecimal(5));
        if (nonGroceryAmount.compareTo(BigDecimal.ZERO) > 0) {
            nonGroceryAmount = helper.calculateDiscount(nonGroceryAmount, userDiscount);
        }

        BigDecimal finalAmount = (groceryAmount.add(nonGroceryAmount).subtract(billsDiscount));
        return finalAmount;
    }
}
