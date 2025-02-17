package Opgave03;

import java.sql.SQLOutput;

public class Opgave03Main {
    public static void main(String[] args) {
        System.out.println(power(3, 5));
        System.out.println(power(2, 10));
        System.out.println(power(5, 0));
    }


    public static int power(int n, int p) {
        if (p == 0) {
            return 1;
        } else if (p % 2 == 0) {
            int halfPower = power(n, p / 2);
            return halfPower * halfPower;
        } else {
            return power(n, p - 1) * n;
        }
    }
}

