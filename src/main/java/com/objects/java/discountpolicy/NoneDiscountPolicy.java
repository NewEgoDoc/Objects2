package com.objects.java.discountpolicy;

import com.objects.java.model.Money;
import com.objects.java.model.Screening;

public class NoneDiscountPolicy implements DiscountPolicy{
    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
