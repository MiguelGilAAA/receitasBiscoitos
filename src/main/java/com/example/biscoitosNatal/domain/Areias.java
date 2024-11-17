package com.example.biscoitosNatal.domain;

import com.example.biscoitosNatal.domain.Receita;

public class Areias extends Receita {

    public Areias() {
        // Ingredientes base para uma dose de Areias
        ingredientes.put("Farinha", 200.0);
        ingredientes.put("Açúcar", 100.0);
        ingredientes.put("Manteiga", 150.0);
    }

    @Override
    public void calcularIngredientes(int doses) {
        // Multiplica os ingredientes pelo número de doses
        ingredientes.replaceAll((key, value) -> value * doses);
    }
}
