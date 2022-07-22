package com.practice.Hsg.order;

public class Order {

    /**
     * Order Object Structure
     */

    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discountPrice;

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItenmPrice() {
        return itemPrice;
    }

    public void setItenmPrice(int itenmPrice) {
        this.itemPrice = itenmPrice;
    }

    public int getDiscountPolicy() {
        return discountPrice;
    }

    public void setDiscountPolicy(int discountPolicy) {
        this.discountPrice = discountPolicy;
    }


    // END LINE
}
