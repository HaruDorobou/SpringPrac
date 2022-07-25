package com.practice.Hsg.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Member {

    /**
     * Member Object Structure
     */

    private Long id; // unique
    private String name;
    private String joinDate;
    private Grade grade;

    // END LINE
}
