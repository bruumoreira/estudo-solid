package com.example.solid.interfaceSegregation.problem;

import java.math.BigDecimal;

/*
    Princípio de Segregação de Interface (I - Interface Segregation Principle)
    - Criar interfaces específicas ao invés de termos uma única interface genérica, ou seja,
    uma classe também não deve ser obrigada a implementar métodos que não serão utilizados.
    “Uma classe não deve ser forçada a implementar interfaces e métodos que não serão utilizados”
 */
public interface Funcionario {

    public BigDecimal salario();

    public BigDecimal gerarComissao();

}