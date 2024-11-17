package com.example.biscoitosNatal.domain;

public class Merengues extends Receita {

    public Merengues() {

        ingredientes.put("Clara de Ovo", 1.0);
        ingredientes.put("Açúcar", 125.0);
        ingredientes.put("Vinagre (colher de chá)", 1.0);
    }

    @Override
    public void calcularIngredientes(int doses) {
        // Multiplica os ingredientes pelo número de doses
        ingredientes.replaceAll((key, value) -> value * doses);
    }
}
