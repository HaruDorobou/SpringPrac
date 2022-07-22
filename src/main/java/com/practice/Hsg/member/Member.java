package com.practice.Hsg.member;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor // Getter, Setter
public class Member {

    /**
     * Member Object Structure
     *
     * Getter, Setter -> Lombok
     */

    private long id; // unique
    private String name;
    private Grade grade;
    private String joinDate;

    // END LINE
}
