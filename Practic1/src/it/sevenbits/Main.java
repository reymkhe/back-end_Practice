package it.sevenbits;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        ThirdPart.strBuilder();
        System.out.println();

        System.out.println("Задача 2");
        ThirdPart.printArgument();
        System.out.println();

        System.out.println("Задача 3");
        ThirdPart.changeNumber(7);
        ThirdPart.changeNumber(-3);
        System.out.println();

        System.out.println("Задача 4");
        int[] numbers1 = {2, 3, 5, 7, 9};
        int[] numbers2 = {2, 3, 5, 7, 2};
        int[] numbers3 = {};
        System.out.println(ThirdPart.checkArray(numbers1));
        System.out.println(ThirdPart.checkArray(numbers2));
        System.out.println(ThirdPart.checkArray(numbers3));
        System.out.println();
    }
}
