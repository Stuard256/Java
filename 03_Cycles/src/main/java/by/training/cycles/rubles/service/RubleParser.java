package by.training.cycles.rubles.service;

import by.training.cycles.rubles.entity.Money;

public class RubleParser implements MoneyParser {

    private byte thousands;
    private byte hundreds;
    private byte dozens;
    private byte units;

    public byte getThousands() {
        return thousands;
    }

    public byte getHundreds() {
        return hundreds;
    }

    public byte getDozens() {
        return dozens;
    }

    public byte getUnits() {
        return units;
    }

    @Override
    public void parse(Money ruble) {
        this.units = (byte) (ruble.getQuantity() % 10);
        this.dozens = (byte) (((ruble.getQuantity() % 100) - this.units) / 10);
        this.hundreds = (byte) (((ruble.getQuantity() % 1000) - this.dozens * 10 - this.units) / 100);
        this.thousands = (byte) (((ruble.getQuantity() % 10000) - this.hundreds * 100 - this.dozens * 10 - this.units) / 1000);
    }
}
