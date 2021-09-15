package cz.spsmb.a3;

import java.util.Scanner;

public class Application {

    public static final int THO_5000 = 5000;
    public static final int THO_2000 = 2000;
    public static final int THO_1000 = 1000;
    public static final int THO_500 = 500;
    public static final int THO_200 = 200;
    public static final int THO_100 = 100;
    public static final int DEC_50 = 50;
    public static final int DEC_20 = 20;
    public static final int DEC_10 = 10;
    public static final int DEC_5 = 5;
    public static final int DEC_2 = 2;
    public static final int DEC_1 = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bills = {THO_5000, THO_2000, THO_1000, THO_500, THO_200, THO_100, DEC_50, DEC_20, DEC_10, DEC_5, DEC_1};
        int money = sc.nextInt();



            if (money / THO_5000 > 0) {
                int a = money / 5000;
                System.out.println(a + "x5000");
                money = money - a * 5000;
            }
            if (money / THO_2000 > 0) {
                int b = money / 2000;
                money = money - b * 2000;
                System.out.println(b + "x2000");

            }
            if (money / THO_1000 > 0) {
                int c = money / 1000;
                System.out.println(c + "x1000");
                money = money - c * 1000;
            }
            if (money / THO_500 > 0) {
                int d = money / 500;
                System.out.println(d + "x500");
                money = money - d * 500;
            }
            if (money / THO_100 > 0) {
                int e = money / 100;
                System.out.println(e + "x100");
                money = money - e * 100;
            }
            if (money / DEC_50 > 0) {
                int f = money / 50;
                System.out.println(f + "x50");
                money = money - f * 50;
            }
            if (money / DEC_20 > 0) {
                int g = money / 20;
                System.out.println(g + "x20");
                money = money - g * 20;
            }
            if (money / DEC_10 > 0) {
                int h = money / 10;
                System.out.println(h + "x10");
                money = money - h * 10;
            }
            if (money / DEC_5 > 0) {
                int ch = money / 5;
                System.out.println(ch + "x5");
                money = money - ch * 5;
            }
            if (money / DEC_2 > 0) {
                int j = money / 2;
                System.out.println(j + "x2");
                money = money - j * 2;
            }
            if (money / DEC_1 > 0) {
                int k = money / 1;
                System.out.println(k + "x1");
                money = money - k * 1;
            }



    }


}

