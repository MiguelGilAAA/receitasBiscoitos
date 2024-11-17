package com.example.biscoitosNatal.domain;

public class FlorzinhasDeAmendoa extends Receita {

    public FlorzinhasDeAmendoa() {

        ingredientes.put("Farinha", 150.0);
        ingredientes.put("Açúcar", 75.0);
        ingredientes.put("Manteiga", 100.0);
        ingredientes.put("Amêndoa Ralada", 100.0);
        ingredientes.put("Açúcar baunilhado (pacote)", 1.0);
        ingredientes.put("Gema de Ovo", 1.0);
        ingredientes.put("Fermento", 1.0);
        ingredientes.put("Ovo", 1.0);
        ingredientes.put("Amêndoa sem Pele (pacote)", 1.0);
    }

    @Override
    public void calcularIngredientes(int doses) {
        // Multiplica os ingredientes pelo número de doses
        ingredientes.replaceAll((key, value) -> value * doses);
    }
}
