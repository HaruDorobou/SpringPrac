package com.practice.Hsg.order;

import com.practice.Hsg.annotation.MainDiscountPolicy;
import com.practice.Hsg.discount.DiscountPolicy;
import com.practice.Hsg.member.Member;
import com.practice.Hsg.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    @Autowired
    public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String name, int itemPrice) {
        Member member = memberRepository.findMemberById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, name, itemPrice, discountPrice);
    }

    // END LINE
}
