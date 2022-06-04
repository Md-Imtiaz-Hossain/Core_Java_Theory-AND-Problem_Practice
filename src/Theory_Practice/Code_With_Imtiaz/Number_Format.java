package Theory_Practice.Code_With_Imtiaz;

import java.text.NumberFormat;

public class Number_Format {
    public static void main(String[] args) {
        String s = NumberFormat.getCurrencyInstance().format(586248.239);
        String s2 = NumberFormat.getPercentInstance().format(.234);

        System.out.println(s);
        System.out.println(s2);
    }
}
