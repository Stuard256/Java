 package by.training.linearalgorythm;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Vector;

public class Main {

     //4 вариант

    /**
     *      4:
     *      z = ( (a – 3 ) * b / 2) + c
     * @param a first num
     * @param b second num
     * @param c third num
     * @return result
     * @throws IllegalArgumentException exception
     */
    static public double first(double a, double b, double c) throws IllegalArgumentException{
        return ((a-3)* b / 2)+ c;
    }

     static class Circle{
        private double length;
        private double square;
        /**     14:
         *      Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
         * @param r radius
         * @throws IllegalArgumentException exception
         */
        private Circle(double r) throws IllegalArgumentException{
            this.length = 2 * Math.PI * r;
            this.square = Math.PI * r * r;
        }

        private void showCircle(){
            System.out.println(length);
            System.out.println(square);
        }
    }

    static class Pow {
        private int a8 = 1;
        private int a10 = 1;

        /**
         27:

         Дано значение a. Не используя никаких функций и никаких операций, кроме умножения, получить значение а8 за
         три операции и а10 за четыре операции.

         * @param a number
         */
        private Pow(int a){
            int temp = a*a;
            a8 = temp * temp * temp * temp;
            a10 = temp * temp * temp * temp * temp;
        }
    }

    /**
     37:
     Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
     false — в противном случае:
     **/
    static boolean choose(){
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("List of available numbers:");
            System.out.println("1: Целое число N является четным двузначным числом.");
            System.out.println("2: Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.");
            System.out.println("3: Сумма цифр данного трехзначного числа N является четным числом.");
            System.out.println("4: Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п).");
            System.out.println("5: Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.");
            System.out.println("6: Треугольник со сторонами а,b,с является равнобедренным.");
            System.out.println("7: Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре.");
            System.out.println("8: Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4).");
            System.out.println("9: График функции у = ах2 + bх+ с проходит через заданную точку с координатами (m, п)");
            System.out.println("Select number: ");
            byte b = scanner.nextByte();
            switch (b) {
                case 1:
                    System.out.println("Enter integer N");
                    int i = scanner.nextInt();
                    return (i % 10 != i && i % 2 == 0);
                case 2:
                    System.out.println("Enter 4-signed N");
                    int k = scanner.nextInt();
                    int k1 = (k - k % 1000) / 1000, k2 = ((k - k1 * 1000) - (k - k1 * 1000) % 100) / 100, k3 = ((k - k1 * 1000 - k2 * 100) - (k - k1 * 1000 - k2 * 100) % 10) / 10, k4 = k - k1 * 1000 - k2 * 100 - k3 * 10;
                    return k1 + k2 == k3 + k4;
                case 3:
                    System.out.println("Enter 3-signed N");
                    int j = scanner.nextInt();
                    return false;
                default:
                    return false;
            }
        }catch()
    }



    public static void main(String[] args) {
        System.out.println(first(2,4,5));
        Circle c1 = new Circle(4.5);
        c1.showCircle();
        a = new Pow(2);
        System.out.println(a.a8);
        System.out.println(a.a10);
        System.out.println(choose());
    }
}
