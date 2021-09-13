package com.alwyncodebuffer.retailshop.controller;


import com.alwyncodebuffer.retailshop.models.Bill;
import com.alwyncodebuffer.retailshop.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiscountRequest {

    private User user;
    private Bill bill;
}
