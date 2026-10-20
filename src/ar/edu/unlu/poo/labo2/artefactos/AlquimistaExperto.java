package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

public class AlquimistaExperto implements EstrategiaDeMejora {

    @Override
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equalsIgnoreCase("Poción")){
            if (artefacto.getNivelDePoder() > 80){
                throw new IllegalArgumentException("No se puede.");
            }
            artefacto.incrementarPoder(20);
        }
    }
}
