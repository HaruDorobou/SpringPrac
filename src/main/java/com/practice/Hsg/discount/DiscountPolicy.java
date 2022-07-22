package com.practice.Hsg.discount;

import com.practice.Hsg.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);

    // END LINE
}
