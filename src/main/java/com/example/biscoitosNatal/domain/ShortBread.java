package com.example.biscoitosNatal.domain;

import com.example.biscoitosNatal.domain.Receita;

// Classe ShortBread, que herda da classe Receita
public class ShortBread extends Receita {

    public ShortBread() {
        // Ingredientes base para uma dose de ShortBread
        ingredientes.put("Farinha", 250.0);
        ingredientes.put("Açúcar em Pó", 150.0);
        ingredientes.put("Manteiga", 250.0);
        ingredientes.put("Farinha de Milho", 150.0);
    }

    @Override
    public void calcularIngredientes(int doses) {
        // Multiplica os ingredientes pelo número de doses
        ingredientes.replaceAll((key, value) -> value * doses);
    }
}