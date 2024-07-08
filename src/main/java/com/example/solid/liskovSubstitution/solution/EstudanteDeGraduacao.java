package com.example.solid.liskovSubstitution.solution;

public class EstudanteDeGraduacao extends Estudante {
    public EstudanteDeGraduacao(String nome) {
        super(nome);
    }

    public void estudar() {
        System.out.println(nome + " está estudando na graduação.");
    }

    public void entregarTCC() {
        //…
    }
}