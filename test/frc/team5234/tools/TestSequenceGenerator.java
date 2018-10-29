package frc.team5234.tools;

import java.text.NumberFormat;

public class TestSequenceGenerator {

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getInstance();
        double value = -1;

        for (int i = 0; i <= 40; i++) {
            System.out.println(format.format(value));
            value += 0.05;
        }
    }
}
