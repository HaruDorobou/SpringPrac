package com.practice.Hsg.discount;

import com.practice.Hsg.annotation.MainDiscountPolicy;
import com.practice.Hsg.member.Grade;
import com.practice.Hsg.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }

    // END LINE
}
