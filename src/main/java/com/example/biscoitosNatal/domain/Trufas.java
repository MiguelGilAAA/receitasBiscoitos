package com.example.biscoitosNatal.domain;

public class Trufas extends Receita {

    public Trufas() {

        ingredientes.put("Chocolate Preto", 275.0);
        ingredientes.put("Cacau em pó", 15.0);
        ingredientes.put("Pistácios", 1.0);
        ingredientes.put("Avelãs", 1.0);
        ingredientes.put("Manteiga", 25.0);
        ingredientes.put("Natas espessas (decilitro)", 2.0);
    }

    @Override
    public void calcularIngredientes(int doses) {
        // Multiplica os ingredientes pelo número de doses
        ingredientes.replaceAll((key, value) -> value * doses);
    }
}
