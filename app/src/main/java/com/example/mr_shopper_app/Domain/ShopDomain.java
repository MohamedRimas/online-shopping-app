package com.example.mr_shopper_app.Domain;

public class ShopDomain {
    private String title;
    private String pic;
    private String description;
    private String price;
    private String numberCard;

    public ShopDomain(String title, String pic, String description, String price) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(String numberCard) {
        this.numberCard = numberCard;
    }

    public ShopDomain(String title, String pic, String description, String price, String numberCard) {
        this.title = title;
        this.pic = pic;
        this.description = description;
        this.price = price;
        this.numberCard = numberCard;
    }


}
