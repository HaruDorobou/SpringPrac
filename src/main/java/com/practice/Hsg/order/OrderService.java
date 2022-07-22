package com.practice.Hsg.order;

import lombok.RequiredArgsConstructor;

public interface OrderService {
    Order createOrder(Long memberId, String name, int itemPrice);

    // END LINE
}
