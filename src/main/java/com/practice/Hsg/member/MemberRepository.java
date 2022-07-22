package com.practice.Hsg.member;

public interface MemberRepository {

    void save(Member member);
    Member findMemberById(Long id);

    // END LINE
}
