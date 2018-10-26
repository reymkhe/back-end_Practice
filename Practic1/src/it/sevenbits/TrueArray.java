package it.sevenbits;

public class TrueArray {
    public static void main(String[] args) {

        int[] numbers = new int[7];
        int x = 5;
        int y = 5;

        boolean b = true;

        numbers[0] = x;
        numbers[numbers.length - 1] = y;

        if (numbers.length > 0) {
            if (numbers[0] == numbers[numbers.length - 1]) {
                System.out.println(b);
            }

        }
    }

}