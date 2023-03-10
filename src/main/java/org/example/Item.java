package org.example;

public abstract class Item {

    private String title;
    private double price;
    private int quantity;
    private int discount;
    private double total;

    public Item(String title, double price, int quantity){
        setTitle(title);
        setPrice(price);
        setQuantity(quantity);
    }

    /**
     * Calculates item's discount.
     * For NEW item discount is 0%;
     * For SECOND_FREE item discount is 50% if quantity > 1
     * For SALE item discount is 70%
     * For each full 10 not NEW items item gets additional 1% discount,
     * but not more than 80% total
     */
    public abstract int calculateDiscount();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        return total;
    }

    public void setTotalPrice(double total) {
        this.total = total;
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * (100.00 - getDiscount()) / 100.00;
    }
}
