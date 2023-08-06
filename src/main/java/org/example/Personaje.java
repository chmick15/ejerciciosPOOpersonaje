package org.example;

import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private int experience;
    private int level;
    private int hp;
    private int mana;
    private List<Item> items;


    public Personaje() {
        hp = 100;
        mana = 100;
        items = new ArrayList<>();
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void recibirDano(int puntosDeDano){
        hp -= hp - puntosDeDano;
        if(hp < 0){
            hp = 0;
        }
    }

    public void agregarExperiencia(int puntosDeExperiencia){
        experience += puntosDeExperiencia;
    }

    public boolean isAlive(){
        if (hp <= 0){
            return false;
        }
        else return true;
    }

    public int getDefensaTotal(){
        int defensaTotal = 0;
        for(Item item : items){
            defensaTotal += item.getDefensa();
        }
        return defensaTotal;
    }

    public int getAtaqueTotal(){
        int ataqueTotal = 0;
        for(Item item : items){
            ataqueTotal += item.getAtaque();
        }
        return ataqueTotal;
    }
}
