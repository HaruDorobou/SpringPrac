package com.practice.Hsg.discount;

import com.practice.Hsg.annotation.MainDiscountPolicy;
import com.practice.Hsg.member.Member;

// @Component
// @MainDiscountPolicy
public class FixDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(Member member, int price) {
        return 0;
    }

    // END LINE
}
