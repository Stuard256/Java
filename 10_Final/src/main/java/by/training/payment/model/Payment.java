package by.training.payment.model;

import java.util.ArrayList;

public class Payment {
    class Cart
    {
        private String name;
        private int price;

        Cart(String name, int price){
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return this.name + " " + this.price;
        }
    }
    private ArrayList<Cart> buyCart = new ArrayList<>();
    public void showCart(){
        for(Cart c : buyCart){
            System.out.println(c.toString());
        }
    }
    public void showFullPrice(){
        int sum = 0;
        for(Cart c : buyCart){
            sum+= c.price;
        }
        System.out.println("Cart price is: " + sum);
    }

    public void addCart(String name,int price){
        buyCart.add(new Cart(name, price));
    }
}
