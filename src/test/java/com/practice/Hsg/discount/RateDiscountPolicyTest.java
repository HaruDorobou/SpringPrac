package com.practice.Hsg.discount;

import com.practice.Hsg.AutoAppConfig;
import com.practice.Hsg.member.Grade;
import com.practice.Hsg.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class RateDiscountPolicyTest {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

    @Test
    void vip_o() {
        //given
        Member memberA = new Member(1L, "memberA","2015-03-13", Grade.VIP);
        RateDiscountPolicy rateDiscountPolicy = ac.getBean(RateDiscountPolicy.class);


        //when
        int discount = rateDiscountPolicy.discount(memberA, 20000);

        //then
        assertThat(discount).isEqualTo(2000);
    }

    @Test
    void vip_x() {
        //given
        Member memberB = new Member(1L, "memberB","2015-03-13", Grade.BASIC);
        RateDiscountPolicy rateDiscountPolicy = ac.getBean(RateDiscountPolicy.class);

        //when
        int discount = rateDiscountPolicy.discount(memberB, 10000);

        //then
        assertThat(discount).isEqualTo(0);
    }

}
