package com.practice.Hsg.order;

import com.practice.Hsg.AutoAppConfig;
import com.practice.Hsg.member.Grade;
import com.practice.Hsg.member.Member;
import com.practice.Hsg.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderServiceTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

    @Test
    void createOrder() {

        // given
        Long memberId = 1L;
        Member memberA = new Member(memberId, "memberA", "2015-02-12", Grade.VIP);
        MemberService memberService = ac.getBean(MemberService.class);

        memberService.join(memberA);
        OrderService orderService = ac.getBean(OrderService.class);

        // when
        Order order = orderService.createOrder(1L, "productA", 20000);

        // then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(2000);
    }

    // END LINE
}
