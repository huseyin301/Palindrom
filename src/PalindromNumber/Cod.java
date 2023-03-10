package PalindromNumber;

import java.util.Scanner;

public class Cod {

    static boolean isPalindrom(int x) {

        int tool = x, reverseNbr = 0, lastNbr;

        while (tool != 0) {

            lastNbr = tool % 10;

            reverseNbr = (reverseNbr * 10) + lastNbr;

            tool /= 10;

        }

        if (x == reverseNbr) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(50505));

    }
}
