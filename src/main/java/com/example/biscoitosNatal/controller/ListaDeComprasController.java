package com.example.biscoitosNatal.controller;

import com.example.biscoitosNatal.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/lista-de-compras")
public class ListaDeComprasController {
    private Map<String, Double> listaIngredientes = new HashMap<>();

    // Adiciona uma receita à lista de compras
    @PostMapping("/adicionar")
    public String adicionarReceita(@RequestParam String tipoReceita, @RequestParam int doses) {
        Receita receita;

        switch (tipoReceita.toLowerCase()) {
            case "areias":
                receita = new Areias();
                break;
            case "shortbread":
                receita = new ShortBread();
                break;
            case "recortados":
                receita = new Recortados();
                break;
            case "trufas":
                receita = new Trufas();
                break;
            case "merengues":
                receita = new Merengues();
                break;
            case "florzinhadeamendoa":
                receita = new FlorzinhasDeAmendoa();
                break;
            case "sables":
                receita = new Sables();
                break;
            case "bolachasflorentinas":
                receita = new BolachasFlorentinas();
                break;
            case "bicolores":
                receita = new Bicolores();
                break;
            default:
                return "Receita não encontrada.";
        }

        // Calcular ingredientes para a receita
        receita.calcularIngredientes(doses);

        // Adicionar os ingredientes à lista de compras
        receita.getIngredientes().forEach((ingrediente, quantidade) -> {
            listaIngredientes.merge(ingrediente, quantidade, Double::sum);
        });

        return "Receita adicionada com sucesso.";
    }

    // Reinicia a lista de ingredientes
    @PostMapping("/reiniciar")
    public String reiniciarLista() {
        listaIngredientes.clear();
        return "Lista de ingredientes reiniciada com sucesso.";
    }

    // Mostra a lista de compras
    @GetMapping("/mostrar")
    public Map<String, Double> mostrarLista() {
        return listaIngredientes;
    }
}
