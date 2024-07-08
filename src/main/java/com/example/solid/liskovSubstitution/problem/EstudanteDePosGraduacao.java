package com.example.solid.liskovSubstitution.problem;

public class EstudanteDePosGraduacao extends Estudante {

    public EstudanteDePosGraduacao(String nome) {
        super(nome);
    }

    @Override
    public void estudar() {
        System.out.println(nome + " está estudando e pesquisando.");
    }
}