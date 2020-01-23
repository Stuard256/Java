package by.training.payment.controller;

import by.training.payment.model.Payment;
import by.training.textfile.view.FileView;

import java.io.IOException;

public class Runner
{
    public static void main( String[] args ) throws IOException {
        Payment payment = new Payment();
        payment.addCart("bread",100);
        payment.addCart("souse",250);
        payment.showCart();
        payment.showFullPrice();
    }
}
