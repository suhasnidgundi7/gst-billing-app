package com.svcp.gstbillingapp.utils;

public class PriceUtils {

    private final float finalPrice;
    private final int quantity;

    private final float tax;
    private float rate;
    private float taxableValue;
    private float singleGst;

    public PriceUtils(float finalPrice, int quantity, int taxSlab) {
        this.finalPrice = finalPrice;
        this.quantity = quantity;

        tax = ((float)taxSlab)/100;
    }

    public float getRate(){
        rate = finalPrice;

        return rate;
    }

    public float getTaxableValue(){
        taxableValue = rate * quantity;
        return taxableValue;
    }

    public float getSingleGst(){
        singleGst = taxableValue*(tax/2);
        singleGst = ((float)Math.round(singleGst*100))/100;
        return singleGst;
    }

}
