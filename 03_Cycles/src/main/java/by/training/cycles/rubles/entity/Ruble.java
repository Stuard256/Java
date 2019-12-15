package by.training.cycles.rubles.entity;

import by.training.cycles.rubles.validator.RubleValidator;


public class Ruble implements Money{

    private int quantity;

    @Override
    public int getQuantity() {
        return quantity;
    }

    public Ruble(int quantity){
       if(RubleValidator.validate(quantity)){
           this.quantity = quantity;
       }
    }
}
