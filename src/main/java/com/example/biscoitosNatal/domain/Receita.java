package com.example.biscoitosNatal.domain;

import java.util.HashMap;
import java.util.Map;

// Classe base para todas as receitas
public abstract class Receita {
    protected Map<String, Double> ingredientes = new HashMap<>();

    // Método abstrato que calcula os ingredientes necessários para as doses
    public abstract void calcularIngredientes(int doses);

    // Método para obter os ingredientes
    public Map<String, Double> getIngredientes() {
        return ingredientes;
    }
}
