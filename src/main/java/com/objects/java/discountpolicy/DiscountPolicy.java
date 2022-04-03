package com.objects.java.discountpolicy;

import com.objects.java.model.Money;
import com.objects.java.model.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
