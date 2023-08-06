package org.example;

public class Orca extends Personaje{
    @Override
    public int getHp() {
        return super.getHp() * 2;
    }
}
