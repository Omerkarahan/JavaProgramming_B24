package day52_inheritance.lyft;

import javax.swing.*;

public class Lux extends Lyft {

    @Override
    public double calculateRate(int miles) {
        return super.calculateRate(miles) * 1.2;
    }
}
