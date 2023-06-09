package com.iv;

public class Wizard extends Magician{
    @Override
    void performIllusion() {
        System.out.println("*phwish*");
    }

    @Override
    void chantSpell() {
        System.out.println("Liguma suguma");
    }
}
