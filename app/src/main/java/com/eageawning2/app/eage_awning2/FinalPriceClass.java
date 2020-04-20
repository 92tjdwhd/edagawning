package com.eageawning2.app.eage_awning2;


import android.util.Log;

public class FinalPriceClass {
    Double totalPrice = 0.0;
    Double basePrice = 0.0;
    Double hddPrice = 0.0;

    private static final FinalPriceClass ourInstance = new FinalPriceClass();

    public static FinalPriceClass getInstance() {
        return ourInstance;
    }

    private FinalPriceClass() {

    }

    public Double getTotalPrice() {
        return totalPrice;
    }
    public void changePrice(Double base, Double hdd){
        Log.d("hdd", hdd.toString());
        Log.d("price", base.toString());
        Log.d("total", totalPrice.toString());
        this.totalPrice = totalPrice + base - hdd;
    }
    public void changehdd(Double base, Double hdd){
        this.totalPrice = totalPrice + hdd - base;
        Log.d("hdd", hdd.toString());
        Log.d("price", base.toString());
        Log.d("total", totalPrice.toString());
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void addTotalPrice(Double addPrice){
        this.totalPrice = this.totalPrice + addPrice;
    }
    public void minusTotalPrice(Double minusPrice){
        this.totalPrice = this.totalPrice - minusPrice;
    }

    public void resetTotal(){
        this.totalPrice =0.0;
    }
}
