package it.sevenbits;

public class StrBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        sb.append("Hello").append(",").append(" World");

        System.out.println(sb.toString());

    }

}
