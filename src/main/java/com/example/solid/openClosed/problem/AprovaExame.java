package com.example.solid.openClosed.problem;
/*
    Princípio do Aberto-Fechado (O - Open Closed Principle)
    - Desenvolver classes que são "abertas para extensão" mas "fechadas para modificação", ou seja,
    estender o comportamento dela deve ser fácil, mas ao mesmo tempo, elas devem ser fechadas para
    alteração. Não podendo ser modificada (ter seu código alterado) o tempo todo.
 */

public class AprovaExame {
    private static final String SANGUE = "SANGUE";
    private static final String RAIOX = "RAIOX";
    public void aprovarSolicitacaoExame(Exame exame) {
        if (exame.tipo == SANGUE) {
            if (verificaCondicoesExameSangue(exame))
                System.out.println("Exame sanguíneo aprovado!");
        } else if (exame.tipo == RAIOX) {
            if (verificaCondicoesRaioX(exame))
                System.out.println("Raio X aprovado!");
        }

    }

    private boolean verificaCondicoesExameSangue(Exame exame) {
        //....
        return true;
    }

    private boolean verificaCondicoesRaioX(Exame exame) {
        //....
        return true;
    }
}