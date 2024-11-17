package com.example.biscoitosNatal.domain;

public class Bicolores extends Receita {

    public Bicolores() {

        ingredientes.put("Farinha", 350.0);
        ingredientes.put("Açúcar", 150.0);
        ingredientes.put("Manteiga", 90.0);
        ingredientes.put("Leite", 50.0);
        ingredientes.put("Gema de Ovo", 1.0);
        ingredientes.put("Chocolate Preto", 30.0);
        ingredientes.put("Baunilha", 2.0);
    }

    @Override
    public void calcularIngredientes(int doses) {
        // Multiplica os ingredientes pelo número de doses
        ingredientes.replaceAll((key, value) -> value * doses);
    }
}
