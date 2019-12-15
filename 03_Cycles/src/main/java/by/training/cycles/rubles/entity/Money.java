package by.training.cycles.rubles.entity;

public interface Money {
    int QUANTITY = 0;

    default int getQuantity() {
        return QUANTITY;
    }
}