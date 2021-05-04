package com.company;

public abstract class Pokemon {
    String categoria;  // fogo

    public abstract void Som();
    public abstract void Habilidade();


    //String Som; // Sobreposição -> Mesma assinatura, classes diferentes.
    //String habilidade;        // Sobrecarga -> Assinaturas diferentes, mesma classe.


    public Pokemon(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
