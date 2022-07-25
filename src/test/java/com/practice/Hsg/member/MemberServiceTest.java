package com.practice.Hsg.member;

import com.practice.Hsg.AutoAppConfig;
import com.practice.Hsg.discount.DiscountPolicy;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberServiceTest {

    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

    @Test
    void joinMember() {
        // given
        Member member = new Member(1L, "memberA", "2015-02-13", Grade.BASIC);
        MemberService memberService = ac.getBean(MemberService.class);

        // when
        memberService.join(member);
        Member find = memberService.findMember(1L);

        // then
        assertThat(member).isEqualTo(find);
    }

    // END LINE
}
