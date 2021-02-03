package com.taskesnoad.outlub.pojo;

public class Orders {

    private String nameOrder;
    private String price;
    private String descproduct;
    private String namePhone;
    private String keyProduct;

    public Orders(String nameOrder, String price, String descproduct, String namePhone, String keyProduct) {
        this.nameOrder = nameOrder;
        this.price = price;
        this.descproduct = descproduct;
        this.namePhone = namePhone;
        this.keyProduct = keyProduct;
    }

    public Orders() {
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescproduct() {
        return descproduct;
    }

    public void setDescproduct(String descproduct) {
        this.descproduct = descproduct;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public String getKeyProduct() {
        return keyProduct;
    }

    public void setKeyProduct(String keyProduct) {
        this.keyProduct = keyProduct;
    }
}
