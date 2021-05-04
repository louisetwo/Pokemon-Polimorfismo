package com.company;

public class Main {

    public static void main(String[] args) {
        Charmander c1 = new Charmander("fogo");
        Charmander c2 = new Charmaleon("fogo");
        Charizard c3 = new Charizard("fogo");

        System.out.println("Som: ");

        c1.Som();
        c2.Som();
        c3.Som();

        System.out.println("Habilidade: ");

        c1.Habilidade();
        c2.Habilidade();

        System.out.println("Charizard Habilidades: ");

        c3.Habilidade(1);
        c3.Habilidade(true);
        c3.Habilidade("fogo");

    }
}
