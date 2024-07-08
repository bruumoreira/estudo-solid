package com.example.solid.openClosed.solution;

import com.example.solid.openClosed.problem.Exame;

public class AprovaRaioX implements AprovaExame {
    @Override
    public void aprovarSolicitacaoExame(Exame exame) {
        if (verificaCondicoesExame(exame))
            System.out.println("Raio-X aprovado!");

    }

    @Override
    public boolean verificaCondicoesExame(Exame exame) {
        //....
        return true;
    }
}