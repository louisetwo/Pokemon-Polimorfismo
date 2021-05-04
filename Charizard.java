package com.company;

public class Charizard extends Charmaleon{

    boolean asas;
    int evoluir;

    public Charizard(String categoria) {
        super(categoria);
    }

    public boolean isAsas() {
        return asas;
    }

    public void setAsas(boolean asas) {
        this.asas = asas;
    }

    public int getEvoluir() {
        return evoluir;
    }

    public void setEvoluir(int evoluir) {
        this.evoluir = evoluir;
    }
    // blaze   - > Charmander
    // flight
    // Solar Power

    @Override
    public void Som(){
        System.out.println(" Charizard grrRRR");
    }


    public void Habilidade(String categoria){
        if(categoria.equals("fogo")){
            System.out.println(" Chama");
        }else{
            System.out.println(" Ditto (?)");

        }
    }

    public void Habilidade(int evoluir){
        if(evoluir == 1){
            System.out.println(" Energia solar");
        }else if(evoluir == 0){
            System.out.println(" Sou charmander >.< ");
        }

    }

    public void Habilidade(boolean asas){
        if(asas){
            System.out.println(" Voar");
        }else {
            System.out.println(" Não sou charizard  :( ");
        }
    }





}
