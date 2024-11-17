package com.example.biscoitosNatal.domain;

public class Sables extends Receita {

    public Sables() {

        ingredientes.put("Farinha", 250.0);
        ingredientes.put("Açúcar em pó", 150.0);
        ingredientes.put("Manteiga", 125.0);
        ingredientes.put("Ovo", 1.0);
        ingredientes.put("Cerejas Cristalizadas", 1.0);
    }

    @Override
    public void calcularIngredientes(int doses) {
        // Multiplica os ingredientes pelo número de doses
        ingredientes.replaceAll((key, value) -> value * doses);
    }
}
