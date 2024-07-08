package com.example.solid.openClosed.solution;

/*
    - Criar uma interface para a classe e injetá-la na classe `AprovaExameSangue´ e `AprovaRaioX´.
*/

import com.example.solid.openClosed.problem.Exame;

public interface AprovaExame {
    void aprovarSolicitacaoExame(Exame exame);

    boolean verificaCondicoesExame(Exame exame);

}