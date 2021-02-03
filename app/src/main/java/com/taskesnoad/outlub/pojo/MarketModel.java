package com.taskesnoad.outlub.pojo;

public class MarketModel {
    private String nameMarket;
    private String orderTime;
    private  String descMarket;
    private String rate ,image;
    private String priceOrder;
    private String offersMarket;
    private String keyMarket;

    public MarketModel() {
    }

    public MarketModel(String nameMarket, String orderTime,
                       String descMarket, String rate, String image, String priceOrder, String offersMarket, String keyMarket) {
        this.nameMarket = nameMarket;
        this.orderTime = orderTime;
        this.descMarket = descMarket;
        this.rate = rate;
        this.image = image;
        this.priceOrder = priceOrder;
        this.offersMarket = offersMarket;
        this.keyMarket = keyMarket;
    }

    public String getNameMarket() {
        return nameMarket;
    }

    public void setNameMarket(String nameMarket) {
        this.nameMarket = nameMarket;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getDescMarket() {
        return descMarket;
    }

    public void setDescMarket(String descMarket) {
        this.descMarket = descMarket;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(String priceOrder) {
        this.priceOrder = priceOrder;
    }

    public String getOffersMarket() {
        return offersMarket;
    }

    public void setOffersMarket(String offersMarket) {
        this.offersMarket = offersMarket;
    }

    public String getKeyMarket() {
        return keyMarket;
    }

    public void setKeyMarket(String keyMarket) {
        this.keyMarket = keyMarket;
    }
}
