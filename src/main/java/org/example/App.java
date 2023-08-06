package org.example;

public class App 
{
    public static void main( String[] args )
    {
        Personaje p1 = new Personaje();
        Personaje p2 = new Personaje();

        Item casco = new Item();
        casco.setDefensa(5);
        Item escudo = new Item();
        escudo.setDefensa(30);
        Item chaleco = new Item();
        chaleco.setDefensa(50);
        Item escudoMadera = new Item();
        escudoMadera.setDefensa(15);
        Item espada = new Item();
        espada.setAtaque(60);

        p1.getItems().add(casco);
        p1.getItems().add(escudo);
        p1.getItems().add(chaleco);
        p1.getItems().add(espada);
        p2.getItems().add(escudoMadera);

        int ataque = p1.getAtaqueTotal();
        int danosCausados = p2.getDefensaTotal() - ataque;
        p2.recibirDano(danosCausados);
        System.out.println(p2.getDefensaTotal());
        System.out.println(p2.getHp());
        System.out.println(p2.isAlive());
    }
}
