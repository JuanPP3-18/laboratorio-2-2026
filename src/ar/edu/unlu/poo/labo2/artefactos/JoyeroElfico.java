package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

public class JoyeroElfico implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
        if (artefacto.getTipo().equalsIgnoreCase("Amuleto")){
            if (artefacto.getNivelDePoder() < 50){
                int i = artefacto.getNivelDePoder();
                artefacto.incrementarPoder(i*2);
            }
            else {
                int i = artefacto.getNivelDePoder();
                artefacto.incrementarPoder((int)(i * 1.25));
            }
        }
    }
}
