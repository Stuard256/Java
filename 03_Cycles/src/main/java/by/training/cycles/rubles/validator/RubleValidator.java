package by.training.cycles.rubles.validator;

public interface RubleValidator {
    static boolean validate(int quantity){
        return quantity >= 0 && quantity < 10000;
    }
}
