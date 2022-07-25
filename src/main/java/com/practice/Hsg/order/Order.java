package com.practice.Hsg.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Order {

    /**
     * Order Object Structure
     */

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    // END LINE
}
