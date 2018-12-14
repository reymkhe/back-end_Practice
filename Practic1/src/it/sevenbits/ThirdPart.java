package it.sevenbits;

import java.util.Scanner;

public class ThirdPart {

   public static void strBuilder() {
       StringBuilder sb = new StringBuilder();
       sb.append("Hello").append(",").append(" World");
       System.out.println(sb.toString());
   }

    public static void printArgument() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the argument: ");
        String argument = s.nextLine();
        System.out.println("Hello, " + argument);
    }

    public static void changeNumber(int n) {
       if (n < 0) {
           System.out.println(Math.abs(n));
       } else {
           System.out.println(n * 2);
       }
    }

    public static boolean checkArray(int[] numbers) {
       if (numbers.length > 0) {
           if (numbers[0] == numbers[numbers.length - 1]) {
               return true;
           }
       }
       return false;
    }
}