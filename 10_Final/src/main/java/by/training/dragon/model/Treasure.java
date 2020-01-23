package by.training.dragon.model;

public class Treasure {
    private String name;
    private int price;

    public Treasure(String name,int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " " + this.price;
    }
}
