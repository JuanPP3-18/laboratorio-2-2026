package ar.edu.unlu.poo.labo2.artefactos;
import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

import java.util.ArrayList;


public class EstrategiaCompuesta implements EstrategiaDeMejora {
    public ArrayList<EstrategiaDeMejora> estrategiaLista;
    public EstrategiaCompuesta(EstrategiaDeMejora... estrategias){
        for (EstrategiaDeMejora est : estrategias){
            estrategiaLista.add(est);
        }
    }

    @Override
    public void mejorar(Artefacto artefacto) {
        for (EstrategiaDeMejora estArt : estrategiaLista){
            estArt.mejorar(artefacto);
        }
    }
}
