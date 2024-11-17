package com.example.biscoitosNatal.domain;

public class BolachasFlorentinas extends Receita {

    public BolachasFlorentinas() {

        ingredientes.put("Farinha", 20.0);
        ingredientes.put("Açúcar em pó", 115.0);
        ingredientes.put("Manteiga", 50.0);
        ingredientes.put("Cerejas Cristalizadas", 1.0);
        ingredientes.put("Casca de Laranja Cristalizadas", 25.0);
        ingredientes.put("Miolo de Amêndoa", 50.0);
        ingredientes.put("Miolo de Noz", 50.0);
        ingredientes.put("Gengibre Cristalizado", 10.0);
        ingredientes.put("Gengibre Moido", 5.0);
        ingredientes.put("Chocolate Preto", 50.0);
        ingredientes.put("Chocolate Branco", 50.0);
    }

    @Override
    public void calcularIngredientes(int doses) {
        // Multiplica os ingredientes pelo número de doses
        ingredientes.replaceAll((key, value) -> value * doses);
    }
}
