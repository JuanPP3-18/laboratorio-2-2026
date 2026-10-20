package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

public class EscribaArcano implements EstrategiaDeMejora {

    @Override
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equalsIgnoreCase("Pergamino")){
            if (artefacto.getNivelDePoder() < 30){
                artefacto.incrementarPoder(25);
            }
            else {
                int i = artefacto.getNivelDePoder();
                artefacto.incrementarPoder(-10);
            }
        }
    }
}
