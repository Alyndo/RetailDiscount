package com.alwyncodebuffer.retailshop.controller;

import com.alwyncodebuffer.retailshop.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.math.BigDecimal;

@RestController
@RequestMapping("/api/v1/discounts")
public class DiscountController {

    @Autowired
    private DiscountService discountService ;

    @PostMapping
    public BigDecimal createDiscount(@Valid @RequestBody DiscountRequest request){
        return discountService.discountCalculation(request.getUser(), request.getBill());
    }
}
