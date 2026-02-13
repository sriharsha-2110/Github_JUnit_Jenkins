
package com.bnmit;

public class GreatestNumber {

    public static int findGreatest(int a, int b, int c) {
        int greatest = a;

        if (b > greatest) {
            greatest = b;
        }

        if (c > greatest) {
            greatest = c;
        }

        return greatest;
    }
}
