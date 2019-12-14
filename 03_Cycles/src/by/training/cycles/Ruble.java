package by.training.cycles;

import java.util.Scanner;

public class Ruble {
    byte thousands;
    byte hundreds;
    byte dozens;
    byte units;
    public Ruble(int collision)throws IllegalArgumentException{
        if(collision < 10000) {
            this.units = (byte) (collision % 10);
            this.dozens = (byte) (((collision % 100) - this.units) / 10);
            this.hundreds = (byte) (((collision % 1000) - this.dozens * 10 - this.units) / 100);
            this.thousands = (byte) (((collision % 10000) - this.hundreds * 100 - this.dozens * 10 - this.units) / 1000);
        }
        else
            throw new IllegalArgumentException();
    }

    public static void read(){
        System.out.println("Enter your number between 0 and 9999");
        try(Scanner scanner = new Scanner(System.in)){
            if(scanner.hasNextInt()){
               new Ruble(scanner.nextInt()).print();
            }

        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

    }

    public void print(){
        StringBuilder result = new StringBuilder();
        switch(this.thousands){
            default:
                break;
            case 1:
                result.append("одна тысяча ");
                break;
            case 2:
                result.append("две тысячи ");
                break;
            case 3:
                result.append("три тысячи ");
                break;
            case 4:
                result.append("четыре тысячи ");
                break;
            case 5:
                result.append("пять тысяч ");
                break;
            case 6:
                result.append("шесть тысяч ");
                break;
            case 7:
                result.append("семь тысяч ");
                break;
            case 8:
                result.append("восемь тысяч ");
                break;
            case 9:
                result.append("девять тысяч ");
                break;
        }
        switch(this.hundreds){
            default:
                break;
            case 1:
                result.append("сто ");
                break;
            case 2:
                result.append("двести ");
                break;
            case 3:
                result.append("триста ");
                break;
            case 4:
                result.append("четыреста ");
                break;
            case 5:
                result.append("пятьсот ");
                break;
            case 6:
                result.append("шестьсот ");
                break;
            case 7:
                result.append("семьсот ");
                break;
            case 8:
                result.append("восемьсот ");
                break;
            case 9:
                result.append("девятьсот ");
                break;
        }

        switch(this.dozens){
            default:
                break;
            case 2:
                result.append("двадцать ");
                break;
            case 3:
                result.append("тридцать ");
                break;
            case 4:
                result.append("сорок ");
                break;
            case 5:
                result.append("пятьдесят ");
                break;
            case 6:
                result.append("шестьдесят ");
                break;
            case 7:
                result.append("семьдесят ");
                break;
            case 8:
                result.append("восемьдесят ");
                break;
            case 9:
                result.append("девяносто ");
                break;
        }

        switch(this.units){
            default:
                if(this.thousands == 0 && this.hundreds == 0 && this.dozens == 0){
                    result.append("ноль рублей");
                    break;
                }
                if(this.dozens != 1){result.append("рублей");}
                else{result.append("десять рублей");}
                break;
            case 1:
                if(this.dozens!=1){result.append("один рубль");}
                else{result.append("одиннадцать рублей");}
                break;
            case 2:
                if(this.dozens!=1){result.append("два рубля");}
                else{result.append("двенадцать рублей");}
                break;
            case 3:
                if(this.dozens!=1){result.append("три рубля");}
                else{result.append("тринадцать рублей");}
                break;
            case 4:
                if(this.dozens!=1){result.append("четыре рубля");}
                else{result.append("четырнадцать рублей");}
                break;
            case 5:
                if(this.dozens!=1){result.append("пять рублей");}
                else{result.append("пятнадцать рублей");}
                break;
            case 6:
                if(this.dozens!=1){result.append("шесть рублей");}
                else{result.append("шестнадцать рублей");}
                break;
            case 7:
                if(this.dozens!=1){result.append("семь рублей");}
                else{result.append("семнадцать рублей");}
                break;
            case 8:
                if(this.dozens!=1){result.append("восемь рублей");}
                else{result.append("восемнадцать рублей");}
                break;
            case 9:
                if(this.dozens!=1){result.append("девять рублей");}
                else{result.append("девятнадцать рублей");}
                break;
        }
        System.out.println(result);
    }
}
