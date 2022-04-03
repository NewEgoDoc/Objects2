package com.objects.java.discountpolicy;

import com.objects.java.model.DiscountCondition;
import com.objects.java.model.Money;
import com.objects.java.model.Screening;

public class PercentDiscountPolicy extends DefaultDiscountPolicy{
    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
