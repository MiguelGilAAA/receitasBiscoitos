package com.example.biscoitosNatal.domain;

public class Recortados extends Receita {

    public Recortados() {

        ingredientes.put("Farinha", 250.0);
        ingredientes.put("Açúcar", 90.0);
        ingredientes.put("Manteiga", 150.0);
        ingredientes.put("Gema de Ovo", 2.0);
    }

    @Override
    public void calcularIngredientes(int doses) {
        // Multiplica os ingredientes pelo número de doses
        ingredientes.replaceAll((key, value) -> value * doses);
    }
}
