package com.example.solid.liskovSubstitution.solution;

/*
    Princípio de Substituição de Liskov (L - Liskov Substitution Principle)
    - Ao herdar, sempre lembrar do contrato estabelecido pela classe pai, ou seja,
    uma classe-filha deve ser capaz de executar tudo que sua classe-mãe faz. Esse
    princípio se conecta com o polimorfismo e reforça esse pilar da POO.
 */

public class Estudante {
    String nome;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }

    public void entregarTCC(){
        //…
    }

}