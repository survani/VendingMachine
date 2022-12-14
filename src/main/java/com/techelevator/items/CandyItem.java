package com.techelevator.items;

import java.math.BigDecimal;

// Class contains: Use of BigDecimal for arbitrary precision

public class CandyItem extends Item {
    public static final String PRODUCT_TYPE_NAME = "Candy";
    public static final String DISPENSE_MESSAGE = "Munch Munch, Yum!";

    public CandyItem(String slotLocation, String productName, BigDecimal price, int quantityInStock) {
        super(slotLocation, productName, price, quantityInStock);
    }

    @Override
    public String getProductTypeName() {
        return PRODUCT_TYPE_NAME;
    }

    @Override
    public String getDispenseMessage() {
        return DISPENSE_MESSAGE;
    }

}